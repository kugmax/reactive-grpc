package com.kugmax.learn.r2dbc.service;

import com.kugmax.learn.r2dbc.model.Visitors;
import com.kugmax.learn.r2dbc.repository.postgres.VisitorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Instant;

@AllArgsConstructor
@Service
public class VisitorServiceImpl implements VisitorService {
    private VisitorRepository visitorRepository;

    @Override
    public Mono<Visitors> greeting(String greeting) {
        Visitors visitor = new Visitors();
        visitor.setVisitTime(Instant.now());

        return visitorRepository.save(visitor);
    }
}
