package com.kugmax.learn.r2dbc.service;

import com.kugmax.learn.r2dbc.model.Visitors;
import reactor.core.publisher.Mono;

public interface VisitorService {
    Mono<Visitors> greeting(String greeting);
}
