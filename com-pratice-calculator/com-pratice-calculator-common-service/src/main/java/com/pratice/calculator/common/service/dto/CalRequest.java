package com.pratice.calculator.common.service.dto;

import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalRequest {
	
	
	@NotEmpty
	private String request;
	
	@NotEmpty
	private String date_1;
	
	@NotEmpty
	private String date_2;
	
	@NotEmpty
	private String num_1;
	
	@NotEmpty
	private String num_2;

}
