package com.kugmax.learn.r2dbc.service;

import com.kugmax.learn.r2dbc.model.Visitor;
import reactor.core.publisher.Mono;

public interface VisitorService {
    Mono<Visitor> greeting(String greeting);
}
