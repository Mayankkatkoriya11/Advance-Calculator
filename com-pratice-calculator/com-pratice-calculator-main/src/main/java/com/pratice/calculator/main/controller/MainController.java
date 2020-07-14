package com.pratice.calculator.main.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.calculator.common.service.dto.CalRequest;
import com.pratice.calculator.common.service.exception.InputNotValid;
import com.pratice.calculator.main.service.MainService;

@RestController
public class MainController {
	
	@Autowired
	private MainService service;
	
	@RequestMapping(value = "/caldate",method = RequestMethod.POST)
	public ResponseEntity<?>calDate(@Valid @RequestBody CalRequest request) throws Exception{
		
		if(!request.getDate_1().matches("^[0-9]{2}-[0-9]{2}-[0-9]{4}$") || !request.getDate_2().matches("^[0-9]{2}-[0-9]{2}-[0-9]{4}$")) {
			throw new InputNotValid("Input Not Valid");
		}
		return service.processDate(request);
	}

	@RequestMapping(value = "/calpow",method = RequestMethod.POST)
	public ResponseEntity<?>calPower(@Valid @RequestBody CalRequest request) throws Exception{
		
		if(!request.getNum_1().matches("^[0-9]{2}.[0-9]{2}$") || !request.getNum_2().matches("^[0-9]{2}.[0-9]{2}$")) {
			throw new InputNotValid("Input Not Valid");
		}
		return service.processPower(request);
	}

}
