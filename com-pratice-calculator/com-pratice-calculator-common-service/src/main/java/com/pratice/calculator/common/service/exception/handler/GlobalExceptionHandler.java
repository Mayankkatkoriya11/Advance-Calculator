package com.pratice.calculator.common.service.exception.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.pratice.calculator.common.service.dto.CalResponse;
import com.pratice.calculator.common.service.exception.InputNotValid;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	@Autowired
	CalResponse response;
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,HttpHeaders headers,HttpStatus status,WebRequest request){
			response.setResponseCode("92");
			response.setResponseDesc(ex.getBindingResult().getFieldError().getDefaultMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}
	
	@ExceptionHandler({InputNotValid.class})
	public ResponseEntity<?> handleInputNotValid(InputNotValid ex, WebRequest request){
		
		response.setResponseCode("92");
		response.setResponseDesc(ex.getMessage());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		
	}

}
