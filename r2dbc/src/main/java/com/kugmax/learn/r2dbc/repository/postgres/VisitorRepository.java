package com.kugmax.learn.r2dbc.repository.postgres;

import com.kugmax.learn.r2dbc.model.Visitors;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorRepository extends ReactiveCrudRepository<Visitors, Long> {
}
