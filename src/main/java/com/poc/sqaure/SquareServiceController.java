package com.poc.sqaure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareServiceController {
	
	@GetMapping("/square/{inputNum}")
	public double squareOfNum(@PathVariable double inputNum)
	{
		
		System.out.println("Received number is " + inputNum);
		double result = Math.pow(inputNum, 2);
		return result;
		
	}

}