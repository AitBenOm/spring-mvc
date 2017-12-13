package com.AitBenOm.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String showHello() {
		return "Hello";
	}
	

	@RequestMapping("/processForm")
	public String showHome() {
		return "Home";
	}

}
