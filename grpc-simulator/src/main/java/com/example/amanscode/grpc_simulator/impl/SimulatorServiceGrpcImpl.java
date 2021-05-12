package com.example.amanscode.grpc_simulator.impl;

import com.google.gson.Gson;
import com.example.amanscode.grpc_simulator.counters.GRPCSimulatorCounters;
import com.example.amanscode.grpc_simulator.generated.SimulatorResponse;
import com.example.amanscode.grpc_simulator.generated.SimulatorServiceGrpc;
import com.example.amanscode.grpc_simulator.pojo.RequestPojo;
import com.example.amanscode.grpc_simulator.pojo.ResponsePojo;

public class SimulatorServiceGrpcImpl extends SimulatorServiceGrpc.SimulatorServiceImplBase{

	@Override
	public void myGrpcService(com.example.amanscode.grpc_simulator.generated.SimulatorRequest request,
			io.grpc.stub.StreamObserver<com.example.amanscode.grpc_simulator.generated.SimulatorResponse> responseObserver) {
		
		GRPCSimulatorCounters.incrementRequestCounter();

//		System.out.println("Received new MOFSMPojo Request : " + request.getMoFSMRequestPojoString());

		Gson myGson = new Gson();
		RequestPojo moFSMRequestPojo = myGson.fromJson(request.getRequestPojoString(), RequestPojo.class);
//		System.out.println("moFSMRequestPojo.getImsi() : " + moFSMRequestPojo.getImsi());

		ResponsePojo moFSMResponsePojo = new ResponsePojo(); moFSMResponsePojo.setId("response_" + moFSMRequestPojo.getId());
		String moFSMResponsePojoString = myGson.toJson(moFSMResponsePojo);

		SimulatorResponse response = SimulatorResponse.newBuilder()
				.setResponsePojoString(moFSMResponsePojoString)
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
		GRPCSimulatorCounters.incrementResponseCounter();;
		
	}

}
