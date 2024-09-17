package com.optimagrowth.optimagrowth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OptimagrowthApplication {

	public static void main(String[] args) {
		SpringApplication.run(OptimagrowthApplication.class, args);
	}

}
