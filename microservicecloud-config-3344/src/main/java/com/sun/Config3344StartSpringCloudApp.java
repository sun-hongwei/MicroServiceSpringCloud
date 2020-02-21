package com.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author hongweisun
 */
@SpringBootApplication
@EnableConfigServer
public class Config3344StartSpringCloudApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(Config3344StartSpringCloudApp.class, args);
	}
}
