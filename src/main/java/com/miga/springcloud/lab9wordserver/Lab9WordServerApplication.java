package com.miga.springcloud.lab9wordserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab9WordServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab9WordServerApplication.class, args);
    }
}
