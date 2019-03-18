package com.kugmax.learn.r2dbc.service;

import com.kugmax.learn.r2dbc.model.Visitor;
import com.kugmax.learn.r2dbc.repository.postgres.VisitorRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.r2dbc.function.TransactionalDatabaseClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Instant;

@AllArgsConstructor
@Service
public class VisitorServiceImpl implements VisitorService {
    private VisitorRepository visitorRepository;
    private TransactionalDatabaseClient client;

    @Override
    public Mono<Visitor> greeting(String greeting) {
        Visitor visitor = new Visitor();
        visitor.setVisitTime(Instant.now());

        Flux<Visitor> trResult = client.inTransaction(
                callback ->  visitorRepository
                        .save(visitor)
//                        .then(Mono.error(new Exception("No commit here pls")))
        );

        return trResult.single();
    }
}
