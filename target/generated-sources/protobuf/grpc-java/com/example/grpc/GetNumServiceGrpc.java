package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: GetNumService.proto")
public final class GetNumServiceGrpc {

  private GetNumServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.GetNumService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.GetNumServiceOuterClass.getNumRequest,
      com.example.grpc.GetNumServiceOuterClass.getNumResponse> getGetNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNum",
      requestType = com.example.grpc.GetNumServiceOuterClass.getNumRequest.class,
      responseType = com.example.grpc.GetNumServiceOuterClass.getNumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.GetNumServiceOuterClass.getNumRequest,
      com.example.grpc.GetNumServiceOuterClass.getNumResponse> getGetNumMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.GetNumServiceOuterClass.getNumRequest, com.example.grpc.GetNumServiceOuterClass.getNumResponse> getGetNumMethod;
    if ((getGetNumMethod = GetNumServiceGrpc.getGetNumMethod) == null) {
      synchronized (GetNumServiceGrpc.class) {
        if ((getGetNumMethod = GetNumServiceGrpc.getGetNumMethod) == null) {
          GetNumServiceGrpc.getGetNumMethod = getGetNumMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.GetNumServiceOuterClass.getNumRequest, com.example.grpc.GetNumServiceOuterClass.getNumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GetNumServiceOuterClass.getNumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GetNumServiceOuterClass.getNumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GetNumServiceMethodDescriptorSupplier("getNum"))
              .build();
        }
      }
    }
    return getGetNumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetNumServiceStub newStub(io.grpc.Channel channel) {
    return new GetNumServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetNumServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GetNumServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetNumServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GetNumServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GetNumServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getNum(com.example.grpc.GetNumServiceOuterClass.getNumRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GetNumServiceOuterClass.getNumResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNumMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNumMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.grpc.GetNumServiceOuterClass.getNumRequest,
                com.example.grpc.GetNumServiceOuterClass.getNumResponse>(
                  this, METHODID_GET_NUM)))
          .build();
    }
  }

  /**
   */
  public static final class GetNumServiceStub extends io.grpc.stub.AbstractStub<GetNumServiceStub> {
    private GetNumServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetNumServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetNumServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetNumServiceStub(channel, callOptions);
    }

    /**
     */
    public void getNum(com.example.grpc.GetNumServiceOuterClass.getNumRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GetNumServiceOuterClass.getNumResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetNumMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetNumServiceBlockingStub extends io.grpc.stub.AbstractStub<GetNumServiceBlockingStub> {
    private GetNumServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetNumServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetNumServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetNumServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.example.grpc.GetNumServiceOuterClass.getNumResponse> getNum(
        com.example.grpc.GetNumServiceOuterClass.getNumRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetNumMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetNumServiceFutureStub extends io.grpc.stub.AbstractStub<GetNumServiceFutureStub> {
    private GetNumServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetNumServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetNumServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetNumServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_NUM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GetNumServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetNumServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NUM:
          serviceImpl.getNum((com.example.grpc.GetNumServiceOuterClass.getNumRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.GetNumServiceOuterClass.getNumResponse>) responseObserver);
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

  private static abstract class GetNumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetNumServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.GetNumServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetNumService");
    }
  }

  private static final class GetNumServiceFileDescriptorSupplier
      extends GetNumServiceBaseDescriptorSupplier {
    GetNumServiceFileDescriptorSupplier() {}
  }

  private static final class GetNumServiceMethodDescriptorSupplier
      extends GetNumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GetNumServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GetNumServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetNumServiceFileDescriptorSupplier())
              .addMethod(getGetNumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
