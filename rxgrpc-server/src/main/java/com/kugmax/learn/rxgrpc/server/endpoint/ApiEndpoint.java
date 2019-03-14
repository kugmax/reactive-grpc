package com.kugmax.learn.rxgrpc.server.endpoint;

import com.kugmax.learn.rxgrpc.HelloRequest;
import com.kugmax.learn.rxgrpc.HelloResponse;
import com.kugmax.learn.rxgrpc.ReactorAPIServiceGrpc;
import com.kugmax.learn.rxgrpc.server.model.Conversation;
import com.kugmax.learn.rxgrpc.server.service.ConversationService;
import lombok.AllArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@GRpcService
public class ApiEndpoint extends ReactorAPIServiceGrpc.APIServiceImplBase {

    private ConversationService conversationService;

    @Override
    public Mono<HelloResponse> hello(Mono<HelloRequest> request) {

        try {
            return request
                    .map(HelloRequest::getGreeting)
                    .map(e -> conversationService.greeting(e))
                    .onErrorResume(e -> {
                        e.printStackTrace();
                        return Mono.error(e);
                    }
                    )
                    .flatMap(this::toResponse);
        } catch (Exception e) {
            e.printStackTrace();

            return Mono.error(e);
        }
    }

    private Mono<HelloResponse> toResponse(Mono<Conversation> conversationMono) {
        return conversationMono.map(e -> HelloResponse.newBuilder().setAnswer(e.getAnswer()).build());
    }
}
