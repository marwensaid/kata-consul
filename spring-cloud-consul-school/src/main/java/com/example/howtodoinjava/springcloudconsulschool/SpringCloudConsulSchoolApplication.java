package com.example.howtodoinjava.springcloudconsulschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// annotate this class with discovery (consul) annotation
@SpringBootApplication
public class SpringCloudConsulSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulSchoolApplication.class, args);
	}
}
