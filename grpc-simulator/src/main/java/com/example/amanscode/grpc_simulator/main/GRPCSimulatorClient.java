package com.example.amanscode.grpc_simulator.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.google.common.util.concurrent.RateLimiter;
import com.google.gson.Gson;
import com.example.amanscode.grpc_simulator.generated.SimulatorRequest;
import com.example.amanscode.grpc_simulator.generated.SimulatorResponse;
import com.example.amanscode.grpc_simulator.generated.SimulatorServiceGrpc;
import com.example.amanscode.grpc_simulator.pojo.RequestPojo;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRPCSimulatorClient {
	private static final Logger logger = LogManager.getLogger(GRPCSimulatorClient.class);
	private static int rateLimit;
	public static final Properties props = new Properties();
	public static int requestSent = 0;
    public static void startClient() {
    	
    	// Initialize Logger
    	String log4JPropertyFile = "./log4j.properties";
    	Properties p = new Properties();
    	try {
    	    p.load(new FileInputStream(log4JPropertyFile));
    	    PropertyConfigurator.configure(p);
    	    logger.info("Logger configured !");
    	} catch (IOException e) {
    	}
    	
    	// Load grpcClientSimulator.properties
    	try {
//			props.load(new FileInputStream("C:\\Users\\kimidi.sagar\\Documents\\code\\grpcClientSimulator.properties"));
			props.load(new FileInputStream("./grpcClientSimulator.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	rateLimit = Integer.parseInt(props.getProperty("rateLimit"));
		String host = props.getProperty("host");
		int port = Integer.parseInt(props.getProperty("port"));
		RateLimiter rateLimiter = RateLimiter.create(rateLimit);
    	
//    	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
    	ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
    	          .usePlaintext()
    	          .build();
    	
    	// create stub
    	SimulatorServiceGrpc.SimulatorServiceBlockingStub stub = SimulatorServiceGrpc.newBlockingStub(channel);
    	
    	System.out.println("!!! Connected !!!");
    	
    	for (int i = 1; i <= rateLimit; i++) {
			rateLimiter.acquire();
		}
    	logger.info("Load started : "+ (new Date()).toString());
    	
    	for (int i = 1; i <= Integer.parseInt(props.getProperty("totalNoOfMsg")); i++) {
			rateLimiter.acquire(); 
			RequestPojo requestPojo = new RequestPojo(); requestPojo.setId(requestSent + "my_imsi");
	    	Gson myGson = new Gson();
	    	String requestPojoString = myGson.toJson(requestPojo);
			new Thread(new LoadSender(stub, requestPojoString)).start();
			}
    	
    	
        channel.shutdown();
        
        while(!channel.isTerminated())
        {
        }
        logger.info("Load ended : " + (new Date()).toString() + " :: No Of Succesful Requests : " + requestSent);
        
    }
    
    public static void service(SimulatorServiceGrpc.SimulatorServiceBlockingStub stub, String requestPojoString) {
    	SimulatorResponse simulatorResponse = stub.myGrpcService(SimulatorRequest.newBuilder()
    			.setRequestPojoString(requestPojoString)
    			.build());
    	
    	if(simulatorResponse.getResponsePojoString() != null)
    	{
    		incrementRequestSent();
    	}
    	
    }
    
    public static class LoadSender implements Runnable{
    	
    	SimulatorServiceGrpc.SimulatorServiceBlockingStub stub;
    	String requestPojoString;
    	
    	public LoadSender(SimulatorServiceGrpc.SimulatorServiceBlockingStub stub, String requestPojoString) {
    		this.stub = stub;
    		this.requestPojoString = requestPojoString;
		}

		@Override
		public void run() {
			service(stub, requestPojoString);
		}
    	
    }
    
    public static synchronized void incrementRequestSent()
    {
    	requestSent++;
    }
    
}
