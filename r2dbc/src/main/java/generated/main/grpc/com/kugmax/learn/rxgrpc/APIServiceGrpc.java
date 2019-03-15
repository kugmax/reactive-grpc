package com.kugmax.learn.rxgrpc;

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
    value = "by gRPC proto compiler (version 1.17.0)",
    comments = "Source: api.proto")
public final class APIServiceGrpc {

  private APIServiceGrpc() {}

  public static final String SERVICE_NAME = "com.kugmax.learn.rxgrpc.APIService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kugmax.learn.rxgrpc.HelloRequest,
      com.kugmax.learn.rxgrpc.HelloResponse> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello",
      requestType = com.kugmax.learn.rxgrpc.HelloRequest.class,
      responseType = com.kugmax.learn.rxgrpc.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kugmax.learn.rxgrpc.HelloRequest,
      com.kugmax.learn.rxgrpc.HelloResponse> getHelloMethod() {
    io.grpc.MethodDescriptor<com.kugmax.learn.rxgrpc.HelloRequest, com.kugmax.learn.rxgrpc.HelloResponse> getHelloMethod;
    if ((getHelloMethod = APIServiceGrpc.getHelloMethod) == null) {
      synchronized (APIServiceGrpc.class) {
        if ((getHelloMethod = APIServiceGrpc.getHelloMethod) == null) {
          APIServiceGrpc.getHelloMethod = getHelloMethod = 
              io.grpc.MethodDescriptor.<com.kugmax.learn.rxgrpc.HelloRequest, com.kugmax.learn.rxgrpc.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.kugmax.learn.rxgrpc.APIService", "hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kugmax.learn.rxgrpc.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kugmax.learn.rxgrpc.HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new APIServiceMethodDescriptorSupplier("hello"))
                  .build();
          }
        }
     }
     return getHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static APIServiceStub newStub(io.grpc.Channel channel) {
    return new APIServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static APIServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new APIServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static APIServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new APIServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class APIServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void hello(com.kugmax.learn.rxgrpc.HelloRequest request,
        io.grpc.stub.StreamObserver<com.kugmax.learn.rxgrpc.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kugmax.learn.rxgrpc.HelloRequest,
                com.kugmax.learn.rxgrpc.HelloResponse>(
                  this, METHODID_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class APIServiceStub extends io.grpc.stub.AbstractStub<APIServiceStub> {
    private APIServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private APIServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected APIServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new APIServiceStub(channel, callOptions);
    }

    /**
     */
    public void hello(com.kugmax.learn.rxgrpc.HelloRequest request,
        io.grpc.stub.StreamObserver<com.kugmax.learn.rxgrpc.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class APIServiceBlockingStub extends io.grpc.stub.AbstractStub<APIServiceBlockingStub> {
    private APIServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private APIServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected APIServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new APIServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.kugmax.learn.rxgrpc.HelloResponse hello(com.kugmax.learn.rxgrpc.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class APIServiceFutureStub extends io.grpc.stub.AbstractStub<APIServiceFutureStub> {
    private APIServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private APIServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected APIServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new APIServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kugmax.learn.rxgrpc.HelloResponse> hello(
        com.kugmax.learn.rxgrpc.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final APIServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(APIServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((com.kugmax.learn.rxgrpc.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.kugmax.learn.rxgrpc.HelloResponse>) responseObserver);
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

  private static abstract class APIServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    APIServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kugmax.learn.rxgrpc.Api.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("APIService");
    }
  }

  private static final class APIServiceFileDescriptorSupplier
      extends APIServiceBaseDescriptorSupplier {
    APIServiceFileDescriptorSupplier() {}
  }

  private static final class APIServiceMethodDescriptorSupplier
      extends APIServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    APIServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (APIServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new APIServiceFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
