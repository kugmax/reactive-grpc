package com.kugmax.learn.r2dbc.endpoint;

import com.kugmax.learn.r2dbc.model.Visitors;
import com.kugmax.learn.r2dbc.service.VisitorService;
import lombok.AllArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@GRpcService
public class ApiEndpoint extends com.kugmax.learn.rxgrpc.ReactorAPIServiceGrpc.APIServiceImplBase {

    private VisitorService visitorService;

    @Override
    public Mono<com.kugmax.learn.rxgrpc.HelloResponse> hello(Mono<com.kugmax.learn.rxgrpc.HelloRequest> request) {

        try {
            return request
                    .map(com.kugmax.learn.rxgrpc.HelloRequest::getGreeting)
                    .map(e -> visitorService.greeting(e))
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

    private Mono<com.kugmax.learn.rxgrpc.HelloResponse> toResponse(Mono<Visitors> conversationMono) {
        return conversationMono.map(e -> com.kugmax.learn.rxgrpc.HelloResponse.newBuilder().setAnswer(e.getVisitTime().toString()).build());
    }
}
