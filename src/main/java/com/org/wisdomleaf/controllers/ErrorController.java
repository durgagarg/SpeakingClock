package com.org.wisdomleaf.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorController {
	
	@ExceptionHandler(NumberFormatException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public String handleFormateException() {
		
		return "You need to pass a valid 24 hour format hour";
	}
	
	@ExceptionHandler(IndexOutOfBoundsException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public String handleOutOfIndexException() {
		
		return "Invaid time input";
	}
	
	

}
