package com.example.searchuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SearchUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchUserApplication.class, args);
	}

}
