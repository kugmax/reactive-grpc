package com.kugmax.learn.grpcblokingserver.service;

import com.kugmax.learn.grpcblokingserver.model.Conversation;
import com.kugmax.learn.grpcblokingserver.repository.ConversationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ConversationServiceImpl implements ConversationService {
    private ConversationRepository conversationRepository;

    @Override
    public Conversation greeting(String greeting) {
        Conversation conversation = new Conversation();
        conversation.setGreeding(greeting);
        conversation.setAnswer(greeting + " hello " +  System.currentTimeMillis());

        Conversation saved = conversationRepository.save(conversation);

        return conversationRepository.findById(saved.getId()).orElseThrow();
    }
}
