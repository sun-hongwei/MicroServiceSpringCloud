package com.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.sun"})
public class MicroservicecloudConsumerDeptFeign {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConsumerDeptFeign.class, args);
    }

}
