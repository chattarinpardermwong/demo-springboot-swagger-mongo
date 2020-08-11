package com.example.demo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
// https://docs.spring.io/spring-data/mongodb/docs/3.0.2.RELEASE/reference/html/#mongo-template
@Configuration
public class MongoConfig {
    public @Bean
    MongoClient mongoClient() {
        return MongoClients.create("mongodb://128.199.225.70:27017");
    }

    public @Bean
    MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "demo");
    }
}
