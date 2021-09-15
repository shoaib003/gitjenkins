package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class DemoApplication {
	
	
	public static Logger logger = (Logger) LoggerFactory.getLogger(DemoApplication.class);
   
	@PostConstruct
	public void init() {
    	logger.info("application added........");
    }
    
    
    
    
	public static void main(String[] args) {
		logger.info("application executed........");
		SpringApplication.run(DemoApplication.class, args);
	}

}
