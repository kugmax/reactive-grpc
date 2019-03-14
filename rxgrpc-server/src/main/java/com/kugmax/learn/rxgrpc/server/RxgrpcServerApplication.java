package com.kugmax.learn.rxgrpc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@EnableCouchbaseRepositories
@SpringBootApplication
public class RxgrpcServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RxgrpcServerApplication.class, args);
	}

}
