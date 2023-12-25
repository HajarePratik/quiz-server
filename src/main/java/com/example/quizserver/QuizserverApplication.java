package com.example.quizserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class QuizserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizserverApplication.class, args);
    }

}
