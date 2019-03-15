package com.kugmax.learn.r2dbc.config;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@Configuration
@EnableR2dbcRepositories(value = "com.kugmax.learn.r2dbc.repository.postgres")
public class R2dbcConfig extends AbstractR2dbcConfiguration {

    @Bean
    @Override
    public PostgresqlConnectionFactory connectionFactory() {
        PostgresqlConnectionConfiguration config = PostgresqlConnectionConfiguration.builder() //
                .host("localhost") //
                .port(5432) //
                .database("postgres") //
                .username("postgres") //
                .password("mysecretpassword") //
                .build();

        return new PostgresqlConnectionFactory(config);
    }

}
