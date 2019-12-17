package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableDiscoveryClient
@EnableFeignClients
@EnableScheduling
@EnableTransactionManagement
@SpringBootApplication
public class NewpowerbrowserApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewpowerbrowserApplication.class, args);
    }
}