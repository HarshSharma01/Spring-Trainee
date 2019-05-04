package com.learn.tms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.io.tms.controller")
@ComponentScan("com.io.tms.dao")
@ComponentScan("com.io.tms.service")
@ComponentScan("com.io.tms.model")
@EntityScan(basePackages = {"com.io.tms.model"})
@SpringBootApplication
public class TraineeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraineeManagementSystemApplication.class, args);
	}
}
