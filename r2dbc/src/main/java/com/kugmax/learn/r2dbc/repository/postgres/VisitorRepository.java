package com.kugmax.learn.r2dbc.repository.postgres;

import com.kugmax.learn.r2dbc.model.Visitor;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorRepository extends R2dbcRepository<Visitor, Long> {
}
