package com.example.demo4;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo4Application {
	public static Logger logger = LoggerFactory.getLogger(Demo4Application.class);

	@PostConstruct
	public void init(){
		logger.info("Application Started........");
	}

	public static void main(String[] args) {
		logger.info("Application executed........");
		SpringApplication.run(Demo4Application.class, args);
	}

}
