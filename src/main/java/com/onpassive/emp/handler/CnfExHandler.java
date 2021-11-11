package com.onpassive.emp.handler;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.onpassive.emp.exception.EmpNameNotFoundException;
import com.onpassive.emp.exception.EmpNotFoundException;

@ControllerAdvice
public class CnfExHandler {
	
	@ExceptionHandler(value = EmpNotFoundException.class)
	public ResponseEntity<Object> exception(EmpNotFoundException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = EmpNameNotFoundException.class)
	public ResponseEntity<Object> exception(EmpNameNotFoundException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}


}
