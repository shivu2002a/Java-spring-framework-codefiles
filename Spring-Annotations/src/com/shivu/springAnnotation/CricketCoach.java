package com.shivu.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Qualifier("randomFortuneService")
	private RandomFortuneService hfs;
	
	@Autowired
	public CricketCoach(RandomFortuneService hfs) {
		this.hfs = hfs;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice full toss shots";
	}
	
	public String getDailyFortune() {
		return hfs.getFortune();
	}
	

}
