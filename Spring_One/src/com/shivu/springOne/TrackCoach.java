package com.shivu.springOne;

public class TrackCoach implements Coach{
	
	private HappyFortuneService hfs;
	
	public TrackCoach(HappyFortuneService hfs) {
		this.hfs = hfs;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 20 minutes on Tennis shots";
	}

	@Override
	public String getDailyFortune() {
		return "Track coach sends you his daily fortune saying to have wonderful win";
	}
	
//	Init method
	public void startupStuff() {
		System.out.println("Track Coach initiated...");
	}
	
//	Destroy Method
	public void closeUpStuff() {
		System.out.println("Cleaning up hooks and closing beans.....");
	}
}
