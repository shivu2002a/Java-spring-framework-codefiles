package com.shivu.springOne;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("Inside no - arg constructor");
	}
	
	public void setFortuneService(FortuneService fs) {
		this.fortuneService = fs;
		System.out.println("FortuneService is set");
	}

	@Override
	public String getDailyWorkout() {
		return "Hey, CricketBoy";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("Team is successfully set.");
	}
	
	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("Email address is successfully set.");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	

}
