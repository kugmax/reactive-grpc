package com.kugmax.learn.r2dbc.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.Instant;

@Data
public class Visitors {
    @Id
    private Long visitorId;
    private Instant visitTime;
}
