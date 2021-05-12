package com.example.amanscode.grpc_simulator.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.example.amanscode.grpc_simulator.counters.GRPCSimulatorCounters;
import com.example.amanscode.grpc_simulator.impl.SimulatorServiceGrpcImpl;

import io.grpc.Server;
import io.grpc.netty.NettyServerBuilder;

public class GRPCSimulatorServer {
    private static final Logger logger = LogManager.getLogger(GRPCSimulatorServer.class);
    public static final Properties props = new Properties();
    public static void startServer() {
    	
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

    	String host = props.getProperty("host");
		int port = Integer.parseInt(props.getProperty("port"));
		
//    	Server server = NettyServerBuilder.forAddress(new InetSocketAddress("localhost", 8080))
    	Server server = NettyServerBuilder.forAddress(new InetSocketAddress(host, port))
    			 .addService(new SimulatorServiceGrpcImpl()).build();
    	
//    	Server server = NettyServerBuilder.forAddress(new InetSocketAddress("10.32.141.8", 8080))
//   			 .addService(new MHereServiceGrpcImpl()).build();

        try {
			server.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        logger.info("Server Started !");
        
        while(true)
        {
        	try {
        		int printCountersTimeForServer = Integer.parseInt(props.getProperty("printCountersTimeForServer"));
				Thread.sleep(printCountersTimeForServer*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        	logger.info("No of Requests Received : " + GRPCSimulatorCounters.noOfRequestReceived + " :::	" + "No of Responses Sent : " + GRPCSimulatorCounters.noOfResponseSent);
        }
        
    }
}
