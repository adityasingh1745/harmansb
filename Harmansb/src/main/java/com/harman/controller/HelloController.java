package com.harman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/springboot")
	public String sayHi() {
		return "Hi from Dragon Ball - Goku is here";
	}

}
