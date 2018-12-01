package com.projektokomanda.atsparumosalciuiskaiciuokle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projektokomanda.atsparumosalciuiskaiciuokle.model.Data;
import com.projektokomanda.atsparumosalciuiskaiciuokle.model.Results;
import com.projektokomanda.atsparumosalciuiskaiciuokle.service.Service;

@RestController
@RequestMapping("api")

@CrossOrigin(origins = "http://localhost:3000")

public class Controller {
	
	@Autowired
	Service service;

	@RequestMapping(method = RequestMethod.POST, value = "/calculate")
	public void calculate(@RequestBody Data data) {
		service.calculate(data);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/results")
	public Results getResults() {
		return service.getResults();
	}
}
