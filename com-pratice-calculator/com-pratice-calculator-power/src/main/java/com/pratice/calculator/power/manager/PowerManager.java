package com.pratice.calculator.power.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pratice.calculator.common.service.dto.CalRequest;
import com.pratice.calculator.power.service.PowerService;

@Service
public class PowerManager {
	
	@Autowired
	private PowerService service;
	
	public ResponseEntity<?>CalPower(CalRequest request){
		return service.service(request.getNum_1(),request.getNum_2());
	}

}
