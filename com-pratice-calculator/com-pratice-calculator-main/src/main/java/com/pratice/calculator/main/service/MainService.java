package com.pratice.calculator.main.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pratice.calculator.common.service.dto.CalRequest;
import com.pratice.calculator.common.service.dto.CalResponse;



@Service
public class MainService {
	
	@Value("${url_getdate}")
	private String url_getdate;
	
	@Value("${url_getpower}")
	private String url_getpower;
	
	@Autowired
	private CalResponse result;
	@Autowired
	private CalResponse response;
	
	RestTemplate restTemplate = new RestTemplate();
	
	
	public ResponseEntity<?>processDate(CalRequest request){
		
		
		result=restTemplate.postForObject(url_getdate,request,CalResponse.class);
		response.setDiff_Date(result.getResponse().toString());
		
		
		return ResponseEntity.ok(response);
	}

	public ResponseEntity<?> processPower(@Valid CalRequest request) {
		
		result=restTemplate.postForObject(url_getpower,request,CalResponse.class);
		response.setResult(result.getResponse().toString());
		
		return ResponseEntity.ok(response);
	}
	

}
