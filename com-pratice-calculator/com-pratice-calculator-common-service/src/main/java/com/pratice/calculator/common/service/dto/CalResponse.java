package com.pratice.calculator.common.service.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CalResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String response = "";
	private String responseCode = "";
	private String responseDesc ="";
	
	private String Diff_Date;
	
	private String result;

	public CalResponse(String result) {
		super();
		this.result = result;
	}
}
