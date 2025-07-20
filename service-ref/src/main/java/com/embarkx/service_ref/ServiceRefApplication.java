package com.embarkx.service_ref;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRefApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRefApplication.class, args);
	}

}
