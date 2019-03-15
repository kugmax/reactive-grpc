package com.kugmax.learn.grpcblokingserver.service;


import com.kugmax.learn.grpcblokingserver.model.Conversation;

public interface ConversationService {
    Conversation greeting(String greeting);
}
