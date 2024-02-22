package com.shivu.springOne;

public class BaseballCoach implements Coach {
	
	private FortuneService thefortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.thefortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return thefortuneService.getFortune();
	}
}
