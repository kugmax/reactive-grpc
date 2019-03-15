package com.kugmax.learn.grpcblokingserver.endpoint;

import com.kugmax.learn.grpcblokingserver.model.Conversation;
import com.kugmax.learn.grpcblokingserver.service.ConversationService;
import com.kugmax.learn.rxgrpc.HelloRequest;
import com.kugmax.learn.rxgrpc.HelloResponse;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;

@AllArgsConstructor
@GRpcService
public class ApiEndpoint extends com.kugmax.learn.rxgrpc.APIServiceGrpc.APIServiceImplBase {

    private ConversationService conversationService;

    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {

        try {
            Conversation conversation = conversationService.greeting(request.getGreeting());

            responseObserver.onNext(
                    HelloResponse.newBuilder().setAnswer(conversation.getAnswer()).build()
            );
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }
}
