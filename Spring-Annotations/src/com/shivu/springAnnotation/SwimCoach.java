package com.shivu.springAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
	
	@Value("${shivu.email}")
	private String email;
	
	@Value("${shivu.address}")
	private String address;
	
	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim for 50 km in ocean";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Fish may eat you";
	}
	
	

}
