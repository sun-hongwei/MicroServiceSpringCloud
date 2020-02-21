package com.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceProviderDept8003Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderDept8003Application.class, args);
    }

}
