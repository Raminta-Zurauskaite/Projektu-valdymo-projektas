package com.projektokomanda.atsparumosalciuiskaiciuokle.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.projektokomanda.atsparumosalciuiskaiciuokle.model.Data;

@Component
public class Validation implements Validator{

	@Override
	public boolean supports(Class<?> cl) {
		return cl == Data.class;
	}

	@Override
	public void validate(Object target, Errors errors) {
		Data dataTarget = (Data) target;
		
		if(dataTarget.getM0() == 0.0) errors.rejectValue("m0", "Validation.EmptyField");
		if(dataTarget.getM1() == 0.0) errors.rejectValue("m1", "Validation.EmptyField");
		if(dataTarget.getM2() == 0.0) errors.rejectValue("m2", "Validation.EmptyField");
		
		if(dataTarget.getM4() == 0.0) errors.rejectValue("m4", "Validation.EmptyField");
		if(dataTarget.getM5() == 0.0) errors.rejectValue("m5", "Validation.EmptyField");
		if(dataTarget.getM6() == 0.0) errors.rejectValue("m6", "Validation.EmptyField");

		if(dataTarget.getHmin() == 0.0) errors.rejectValue("hmin", "Validation.EmptyField");
		if(dataTarget.getHmax() == 0.0) errors.rejectValue("hmax", "Validation.EmptyField");

		if(dataTarget.getAa() == 0.0) errors.rejectValue("aa", "Validation.EmptyField");
		if(dataTarget.getBa() == 0.0) errors.rejectValue("ba", "Validation.EmptyField");

		if(dataTarget.getM3() == 0.0) {
			if(dataTarget.getAv() == 0.0) errors.rejectValue("av", "Validation.EmptyField");
			if(dataTarget.getBv() == 0.0) errors.rejectValue("bv", "Validation.EmptyField");
			if(dataTarget.getH1() == 0.0) errors.rejectValue("h1", "Validation.EmptyField");
			if(dataTarget.getH2() == 0.0) errors.rejectValue("h2", "Validation.EmptyField");
		}
		else if(dataTarget.getAv() == 0.0 || dataTarget.getBv() == 0.0 || dataTarget.getH1() == 0.0 || dataTarget.getH2() == 0.0) {
			if(dataTarget.getM3() == 0.0) errors.rejectValue("m3", "Validation.EmptyField");
		}
		
	}

}
