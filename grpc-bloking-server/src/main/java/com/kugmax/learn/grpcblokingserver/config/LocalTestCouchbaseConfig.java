package com.kugmax.learn.grpcblokingserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class LocalTestCouchbaseConfig extends AbstractCouchbaseConfiguration {
    @Override
    protected List<String> getBootstrapHosts() {
        return Arrays.asList("localhost", "172.17.0.2");
    }

    @Override
    protected String getBucketName() {
        return "rxgrpc-test";
    }

    @Override
    protected String getUsername() {
        return "Administrator";
    }

    @Override
    protected String getBucketPassword() {
        return "password";
    }
}
