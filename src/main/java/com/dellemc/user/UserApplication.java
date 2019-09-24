package com.dellemc.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;



@EnableCircuitBreaker
@SpringBootApplication
public class UserApplication  {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
  }
  
  
}
