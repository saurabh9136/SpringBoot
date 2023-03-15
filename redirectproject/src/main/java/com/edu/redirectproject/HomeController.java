package com.edu.redirectproject;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
	
	@GetMapping("/start")
	public String display() { // this method return the string statement
		return "Home.html";	// using this line the html file will call 
	}
}
