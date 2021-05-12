package com.example.amanscode.grpc_simulator.counters;

public class GRPCSimulatorCounters {

	public static int noOfRequestReceived = 0;
	public static int noOfResponseSent = 0;

	public static synchronized void incrementRequestCounter() {
		noOfRequestReceived++;
	}

	public static synchronized void incrementResponseCounter() {
		noOfResponseSent++;
	}

}
