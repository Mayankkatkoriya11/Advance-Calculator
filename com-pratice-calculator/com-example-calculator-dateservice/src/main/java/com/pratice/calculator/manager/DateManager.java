package com.pratice.calculator.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pratice.calculator.common.service.dto.CalRequest;
import com.pratice.calculator.service.DateService;

@Service
public class DateManager {
	
	@Autowired
	private DateService service;
	
	public ResponseEntity<?>CalDate(CalRequest request) throws Exception{
		
		return service.service(request.getDate_1(),request.getDate_2());
	
	}
	

}
