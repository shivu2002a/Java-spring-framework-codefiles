package com.shivu.springOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach cricCoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(cricCoach.getDailyFortune());
		System.out.println(cricCoach.getDailyWorkout());
		System.out.println("Email: " + cricCoach.getEmailAddress() + "   Team: "  + cricCoach.getTeam());
		
		context.close();
		
		
	}

}
