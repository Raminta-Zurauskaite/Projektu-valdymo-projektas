package com.projektokomanda.atsparumosalciuiskaiciuokle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projektokomanda.atsparumosalciuiskaiciuokle.calculator.Calculator;
import com.projektokomanda.atsparumosalciuiskaiciuokle.model.Data;
import com.projektokomanda.atsparumosalciuiskaiciuokle.model.Results;
import com.projektokomanda.atsparumosalciuiskaiciuokle.validator.Validation;

@RestController
@RequestMapping("api")

@CrossOrigin(origins = "http://localhost:3000")

public class Controller {
	
	@Autowired
	private Calculator calculator;
	
	@Autowired
	private Validation validator;
	
	@InitBinder
	protected void initBinder(WebDataBinder dataBinder) {
		Object target = dataBinder.getTarget();
		if(target == null) {
			return;
		}
		
		if(target.getClass() == Data.class) {
			dataBinder.setValidator(validator);
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/calculate")
	public Data calculate(@RequestBody @Validated Data data) {
		calculator.calculate(data);
		return data;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/results")
	public Results getResults() {
		return calculator.getResults();
	}
}
