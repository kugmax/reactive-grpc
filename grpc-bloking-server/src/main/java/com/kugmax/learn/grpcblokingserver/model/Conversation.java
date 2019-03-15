package com.kugmax.learn.grpcblokingserver.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

@Data
@Document
public class Conversation {
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    @Id
    private String id;
    private String greeding;
    private String answer;
}
