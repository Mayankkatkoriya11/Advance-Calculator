package com.pratice.calculator.power.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.calculator.common.service.dto.CalRequest;
import com.pratice.calculator.common.service.exception.InputNotValid;
import com.pratice.calculator.power.manager.PowerManager;

@RestController
public class PowerController {
	
	@Autowired
	private PowerManager mgr;
	
	@RequestMapping(value ="/getpower", method = RequestMethod.POST)
	public ResponseEntity<?>Calculate(@RequestBody @Valid CalRequest request) throws Exception{
		
		return mgr.CalPower(request);
		}

}
