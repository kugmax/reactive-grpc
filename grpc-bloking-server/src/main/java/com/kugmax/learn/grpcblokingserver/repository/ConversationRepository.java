package com.kugmax.learn.grpcblokingserver.repository;


import com.kugmax.learn.grpcblokingserver.model.Conversation;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversationRepository extends CouchbaseRepository<Conversation, String> {
}
