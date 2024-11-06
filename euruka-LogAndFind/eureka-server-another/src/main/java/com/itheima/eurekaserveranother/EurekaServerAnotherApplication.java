package com.itheima.eurekaserveranother;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAnotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerAnotherApplication.class, args);
    }

}
