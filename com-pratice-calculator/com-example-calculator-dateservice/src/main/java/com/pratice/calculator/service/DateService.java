package com.pratice.calculator.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface DateService {
	
	public ResponseEntity<?>service(String Date_1,String Date_2) throws Exception;

}
