package com.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/testrun")
	public String testRun() {
		
		return "TestRun Successfully......";
		
	}
	
	
}
