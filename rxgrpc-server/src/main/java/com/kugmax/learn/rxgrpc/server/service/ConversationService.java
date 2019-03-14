package com.kugmax.learn.rxgrpc.server.service;

import com.kugmax.learn.rxgrpc.server.model.Conversation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ConversationService {
    Mono<Conversation> greeting(String greeting);
}
