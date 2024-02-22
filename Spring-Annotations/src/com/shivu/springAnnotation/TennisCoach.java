package com.shivu.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
@Scope("prototype")
public class TennisCoach implements Coach{
	
	//Applying Field injection directly (Java Reflections)
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService hfs; 
	
	
	public TennisCoach() {
		System.out.println("Inside default Constructor");
	}
	/*
	@Autowired
	public void setHfs(FortuneService hfs) {
		this.hfs = hfs;
		System.out.println("Inside setter method");
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand valley";
	}
	
	public String getDailyFortune() {
		return hfs.getFortune();
	}
}
