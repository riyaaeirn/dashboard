package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DashboardApplication  implements CommandLineRunner {

	 //private static final Logger logger = LoggerFactory.getLogger(DashboardApplication.class);
	private final static Logger logger = LoggerFactory.getLogger(DashboardApplication.class);
	@Autowired
  private ServerProperties serverProperties;
	@Autowired
	private RestURLData restURLData;
	 @Override
	    public void run(String... args) {
	        System.out.println(serverProperties);
	        System.out.println(restURLData);
	        logger.debug("restURLData"+restURLData);
	        logger.debug("serverProperties"+serverProperties);

	        
	    }
   
	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);

        logger.debug("Hello SpringBoot from Logback {}");

		System.out.println("SpringBoot Starter Project");
	}

}
