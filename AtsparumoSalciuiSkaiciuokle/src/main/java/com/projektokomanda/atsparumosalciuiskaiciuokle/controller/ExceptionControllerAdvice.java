package com.projektokomanda.atsparumosalciuiskaiciuokle.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
	
	private MessageSource messageSource;

	public ExceptionControllerAdvice(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	private String resolveLocalizedErrorMessage(FieldError fieldError) {
		Locale currentLocale = Locale.getDefault();
		String localizedErrorMessage = messageSource.getMessage(fieldError, currentLocale);
		
		if(localizedErrorMessage.equals(fieldError.getDefaultMessage())) {
			String[] fieldErrorCodes = fieldError.getCodes();
			localizedErrorMessage = fieldErrorCodes[0];
		}
		
		return localizedErrorMessage;
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ModelMap validationExceptionHandler(MethodArgumentNotValidException e) {
		BindingResult result = e.getBindingResult();
		List<FieldError> fieldErrors = result.getFieldErrors();
		ModelMap errors = new ModelMap();
		for(FieldError fieldError : fieldErrors) {
			errors.addAttribute(fieldError.getField(), resolveLocalizedErrorMessage(fieldError));
		}
		
		return errors;
	}
	
}
