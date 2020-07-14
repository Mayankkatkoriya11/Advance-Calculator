package com.pratice.calculator.power.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.pratice.calculator.common.service.dto.CalResponse;

import com.pratice.calculator.power.service.PowerService;

@Component
public class PowerImpl implements PowerService {

	@Override
	public ResponseEntity<?> service(String num_1, String num_2) {
		
		Double power=1.0;
		Double base= Double.parseDouble(num_1);
		Double expo=Double.parseDouble(num_2);
		
		for(int i=1;i<=expo;i++) {
			power=power*base;
		}
		CalResponse response = new CalResponse();
		response.setResult(power.toString());		
		return ResponseEntity.ok(response);
	}	

}
