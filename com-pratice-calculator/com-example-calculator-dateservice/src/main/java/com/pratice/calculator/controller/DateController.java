package com.pratice.calculator.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pratice.calculator.common.service.dto.CalRequest;
import com.pratice.calculator.manager.DateManager;

@RestController
public class DateController {
	
	@Autowired
	DateManager dtmgr;
	
	@RequestMapping(value = "/getdate", method = RequestMethod.POST)
	public ResponseEntity<?>GetDate(@RequestBody @Valid CalRequest request) throws Exception{
		
		return dtmgr.CalDate(request);
	}

}
