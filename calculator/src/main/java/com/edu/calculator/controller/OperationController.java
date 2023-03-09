package com.edu.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.calculator.entity.Operations;

@RestController
@RequestMapping("/calculator")
public class OperationController {

	@GetMapping("/add/{a}/{b}")	// for addition of numbers
	public String add(@PathVariable int a, @PathVariable int b)// taking path variables so user can enter a data into url
	{ 
		
		int add = Operations.sum(a, b); // calling sum operation and saving into result
		return "The Addition Of a given Number is:"+add; // return string with integer answer
	}
	
	@GetMapping("/substract/{a}/{b}")
	public String substract(@PathVariable int a, @PathVariable int b) 
	{
		int sub = Operations.sub(a, b);
		return "The Substraction Of a given Number is:"+sub;
	}
	@GetMapping("/multipliply/{a}/{b}")
	public String multipliply(@PathVariable int a, @PathVariable int b) 
	{
		int mul = Operations.mul(a, b);
		return "The Multiplication Of a given Number is:"+mul;
	}
	
	@GetMapping("/divide/{a}/{b}")
	public String divide(@PathVariable int a, @PathVariable int b) 
	{
		int div = Operations.div(a, b);
		return "The Division Of a given Number is:"+div;
	}
	
}
