package com.example.amanscode.grpc_simulator.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: GRPCSimulator.proto")
public final class SimulatorServiceGrpc {

  private SimulatorServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.amanscode.grpc_simulator.generated.SimulatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.amanscode.grpc_simulator.generated.SimulatorRequest,
      com.example.amanscode.grpc_simulator.generated.SimulatorResponse> getMyGrpcServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "myGrpcService",
      requestType = com.example.amanscode.grpc_simulator.generated.SimulatorRequest.class,
      responseType = com.example.amanscode.grpc_simulator.generated.SimulatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.amanscode.grpc_simulator.generated.SimulatorRequest,
      com.example.amanscode.grpc_simulator.generated.SimulatorResponse> getMyGrpcServiceMethod() {
    io.grpc.MethodDescriptor<com.example.amanscode.grpc_simulator.generated.SimulatorRequest, com.example.amanscode.grpc_simulator.generated.SimulatorResponse> getMyGrpcServiceMethod;
    if ((getMyGrpcServiceMethod = SimulatorServiceGrpc.getMyGrpcServiceMethod) == null) {
      synchronized (SimulatorServiceGrpc.class) {
        if ((getMyGrpcServiceMethod = SimulatorServiceGrpc.getMyGrpcServiceMethod) == null) {
          SimulatorServiceGrpc.getMyGrpcServiceMethod = getMyGrpcServiceMethod =
              io.grpc.MethodDescriptor.<com.example.amanscode.grpc_simulator.generated.SimulatorRequest, com.example.amanscode.grpc_simulator.generated.SimulatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "myGrpcService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.amanscode.grpc_simulator.generated.SimulatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.amanscode.grpc_simulator.generated.SimulatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SimulatorServiceMethodDescriptorSupplier("myGrpcService"))
              .build();
        }
      }
    }
    return getMyGrpcServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SimulatorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimulatorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimulatorServiceStub>() {
        @java.lang.Override
        public SimulatorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimulatorServiceStub(channel, callOptions);
        }
      };
    return SimulatorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SimulatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimulatorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimulatorServiceBlockingStub>() {
        @java.lang.Override
        public SimulatorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimulatorServiceBlockingStub(channel, callOptions);
        }
      };
    return SimulatorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SimulatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimulatorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimulatorServiceFutureStub>() {
        @java.lang.Override
        public SimulatorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimulatorServiceFutureStub(channel, callOptions);
        }
      };
    return SimulatorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SimulatorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void myGrpcService(com.example.amanscode.grpc_simulator.generated.SimulatorRequest request,
        io.grpc.stub.StreamObserver<com.example.amanscode.grpc_simulator.generated.SimulatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMyGrpcServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMyGrpcServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.amanscode.grpc_simulator.generated.SimulatorRequest,
                com.example.amanscode.grpc_simulator.generated.SimulatorResponse>(
                  this, METHODID_MY_GRPC_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class SimulatorServiceStub extends io.grpc.stub.AbstractAsyncStub<SimulatorServiceStub> {
    private SimulatorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimulatorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimulatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void myGrpcService(com.example.amanscode.grpc_simulator.generated.SimulatorRequest request,
        io.grpc.stub.StreamObserver<com.example.amanscode.grpc_simulator.generated.SimulatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMyGrpcServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SimulatorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SimulatorServiceBlockingStub> {
    private SimulatorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimulatorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimulatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.amanscode.grpc_simulator.generated.SimulatorResponse myGrpcService(com.example.amanscode.grpc_simulator.generated.SimulatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMyGrpcServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SimulatorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SimulatorServiceFutureStub> {
    private SimulatorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimulatorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimulatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.amanscode.grpc_simulator.generated.SimulatorResponse> myGrpcService(
        com.example.amanscode.grpc_simulator.generated.SimulatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMyGrpcServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MY_GRPC_SERVICE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SimulatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SimulatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MY_GRPC_SERVICE:
          serviceImpl.myGrpcService((com.example.amanscode.grpc_simulator.generated.SimulatorRequest) request,
              (io.grpc.stub.StreamObserver<com.example.amanscode.grpc_simulator.generated.SimulatorResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SimulatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SimulatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.amanscode.grpc_simulator.generated.GRPCSimulator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SimulatorService");
    }
  }

  private static final class SimulatorServiceFileDescriptorSupplier
      extends SimulatorServiceBaseDescriptorSupplier {
    SimulatorServiceFileDescriptorSupplier() {}
  }

  private static final class SimulatorServiceMethodDescriptorSupplier
      extends SimulatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SimulatorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SimulatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SimulatorServiceFileDescriptorSupplier())
              .addMethod(getMyGrpcServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
