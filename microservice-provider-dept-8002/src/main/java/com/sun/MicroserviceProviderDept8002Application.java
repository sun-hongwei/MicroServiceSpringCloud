package com.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceProviderDept8002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderDept8002Application.class, args);
    }

}
