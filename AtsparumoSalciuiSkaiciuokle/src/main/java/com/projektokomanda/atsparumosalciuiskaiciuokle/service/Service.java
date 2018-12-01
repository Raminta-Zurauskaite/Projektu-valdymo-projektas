package com.projektokomanda.atsparumosalciuiskaiciuokle.service;

import com.projektokomanda.atsparumosalciuiskaiciuokle.model.Data;
import com.projektokomanda.atsparumosalciuiskaiciuokle.model.Results;

public interface Service {

	public void calculate(Data data);
	
	public Results getResults();
}
