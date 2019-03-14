package com.kugmax.learn.rxgrpc.server.service;

import com.kugmax.learn.rxgrpc.server.model.Conversation;
import com.kugmax.learn.rxgrpc.server.repository.ConversationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class ConversationServiceImpl implements ConversationService {
    private ConversationRepository conversationRepository;

    @Override
    public Mono<Conversation> greeting(String greeting) {
        Conversation conversation = new Conversation();
        conversation.setGreeding(greeting);
        conversation.setAnswer(greeting + " hello " +  System.currentTimeMillis());

        return conversationRepository.save(conversation);
    }
}
