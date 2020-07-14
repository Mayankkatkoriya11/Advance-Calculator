package com.pratice.calculator.power.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.pratice.calculator" )
public class PowerMain {
	
	public static void main(String[] args) {
		SpringApplication.run(PowerMain.class, args);
	}

}
