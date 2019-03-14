package com.kugmax.learn.rxgrpc.server.repository;

import com.kugmax.learn.rxgrpc.server.model.Conversation;
import org.springframework.data.couchbase.repository.ReactiveCouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversationRepository extends ReactiveCouchbaseRepository<Conversation, Long> {
}
