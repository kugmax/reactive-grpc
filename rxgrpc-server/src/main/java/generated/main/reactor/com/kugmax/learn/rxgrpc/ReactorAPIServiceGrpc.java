package com.kugmax.learn.rxgrpc;

import static com.kugmax.learn.rxgrpc.APIServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by ReactorGrpc generator",
comments = "Source: api.proto")
public final class ReactorAPIServiceGrpc {
    private ReactorAPIServiceGrpc() {}

    public static ReactorAPIServiceStub newReactorStub(io.grpc.Channel channel) {
        return new ReactorAPIServiceStub(channel);
    }

    public static final class ReactorAPIServiceStub extends io.grpc.stub.AbstractStub<ReactorAPIServiceStub> {
        private APIServiceGrpc.APIServiceStub delegateStub;

        private ReactorAPIServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = APIServiceGrpc.newStub(channel);
        }

        private ReactorAPIServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = APIServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected ReactorAPIServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReactorAPIServiceStub(channel, callOptions);
        }

        public reactor.core.publisher.Mono<com.kugmax.learn.rxgrpc.HelloResponse> hello(reactor.core.publisher.Mono<com.kugmax.learn.rxgrpc.HelloRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::hello);
        }

        public reactor.core.publisher.Mono<com.kugmax.learn.rxgrpc.HelloResponse> hello(com.kugmax.learn.rxgrpc.HelloRequest reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::hello);
        }

    }

    public static abstract class APIServiceImplBase implements io.grpc.BindableService {

        public reactor.core.publisher.Mono<com.kugmax.learn.rxgrpc.HelloResponse> hello(reactor.core.publisher.Mono<com.kugmax.learn.rxgrpc.HelloRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.kugmax.learn.rxgrpc.APIServiceGrpc.getHelloMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.kugmax.learn.rxgrpc.HelloRequest,
                                            com.kugmax.learn.rxgrpc.HelloResponse>(
                                            this, METHODID_HELLO)))
                    .build();
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
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((com.kugmax.learn.rxgrpc.HelloRequest) request,
                            (io.grpc.stub.StreamObserver<com.kugmax.learn.rxgrpc.HelloResponse>) responseObserver,
                            serviceImpl::hello);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
