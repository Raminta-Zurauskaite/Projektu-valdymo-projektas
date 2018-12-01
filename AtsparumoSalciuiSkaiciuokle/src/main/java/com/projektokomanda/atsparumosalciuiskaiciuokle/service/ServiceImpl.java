package com.projektokomanda.atsparumosalciuiskaiciuokle.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.projektokomanda.atsparumosalciuiskaiciuokle.calculator.Calculator;
import com.projektokomanda.atsparumosalciuiskaiciuokle.model.Data;
import com.projektokomanda.atsparumosalciuiskaiciuokle.model.Results;

public class ServiceImpl implements Service{

	@Autowired
	Calculator calculator;
	
	@Override
	public void calculate(Data data) {
		calculator.calculate(data);
		
	}

	@Override
	public Results getResults() {
		return calculator.getResults();
		
	}

}
