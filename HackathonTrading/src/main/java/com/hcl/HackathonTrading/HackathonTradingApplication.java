package com.hcl.HackathonTrading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HackathonTradingApplication {

	private static final Logger logger = LoggerFactory.getLogger(HackathonTradingApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(HackathonTradingApplication.class, args);
	}

}
