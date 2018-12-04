package com.projektokomanda.atsparumosalciuiskaiciuokle.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projektokomanda.atsparumosalciuiskaiciuokle.calculator.Calculator;
import com.projektokomanda.atsparumosalciuiskaiciuokle.model.Data;
import com.projektokomanda.atsparumosalciuiskaiciuokle.model.Results;

@RestController
@RequestMapping("api")

@CrossOrigin(origins = "http://localhost:3000")

public class Controller {
	
	private Calculator calculator = new Calculator();

	@RequestMapping(method = RequestMethod.POST, value = "/calculate")
	public Data calculate(@RequestBody Data data) {
		System.out.println(data.toString());
		calculator.calculate(data);
		return data;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/results")
	public Results getResults() {
		return calculator.getResults();
	}
}
