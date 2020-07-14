package com.pratice.calculator.service.impl;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.pratice.calculator.common.service.dto.CalResponse;
import com.pratice.calculator.service.DateService;

@Component
public class DateImpl implements DateService {

	@Override
	public ResponseEntity<?> service(String Date_1, String Date_2) throws Exception
	{ 
		
		Date dateBefore= new SimpleDateFormat("dd-MM-yyyy").parse(Date_1);
		Date dateAfter= new SimpleDateFormat("dd-MM-yyyy").parse(Date_2);
		
		Long diffrence = dateAfter.getTime() - dateBefore.getTime();
		
		float daysBetween=TimeUnit.DAYS.convert(diffrence, TimeUnit.MILLISECONDS);
		
		Double day = (double)daysBetween;
		
		CalResponse response = new CalResponse();
		response.setDiff_Date(day.toString() + " days");
		
		return ResponseEntity.ok(response);
	}

}
