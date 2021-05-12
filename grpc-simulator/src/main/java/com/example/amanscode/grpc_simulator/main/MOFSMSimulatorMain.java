package com.example.amanscode.grpc_simulator.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MOFSMSimulatorMain {
	public static final Properties props = new Properties();
	public static void main(String[] args) {
		try {
			props.load(new FileInputStream("./grpcClientSimulator.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
		String serverOrClient = props.getProperty("serverOrClient");
		
		if("server".equalsIgnoreCase(serverOrClient)) {
			GRPCSimulatorServer.startServer();
		}
		else if("client".equalsIgnoreCase(serverOrClient)) {
			GRPCSimulatorClient.startClient();
		}
		else {
			System.out.println("Please enter a valid value in serverOrClient !");
		}
	}

}
