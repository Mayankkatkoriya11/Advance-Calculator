package com.pratice.calculator.power.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface PowerService {
	
	public ResponseEntity<?>service(String num_1,String num_2);
}
