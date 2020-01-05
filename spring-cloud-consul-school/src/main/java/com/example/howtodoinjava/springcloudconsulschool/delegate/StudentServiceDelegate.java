package com.example.howtodoinjava.springcloudconsulschool.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Service
public class StudentServiceDelegate {
	@Autowired
	RestTemplate restTemplate;

	// implement this method
	public String callStudentServiceAndGetData(String schoolname) {
		System.out.println("Consul Demo - Getting School details for " + schoolname);




		System.out.println("Response Received as " + "response" + " -  " + new Date());

		return "School Name -  " + schoolname + " :::  Student Details " + "response" + " -  " + new Date();
	}
	
	@Bean
	// how load balanced this ?
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
