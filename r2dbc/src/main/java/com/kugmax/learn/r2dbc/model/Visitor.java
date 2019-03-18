package com.kugmax.learn.r2dbc.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;

@Table("visitors")
@Data
public class Visitor {
    @Id
    private Long visitorId;
    private Instant visitTime;
}
