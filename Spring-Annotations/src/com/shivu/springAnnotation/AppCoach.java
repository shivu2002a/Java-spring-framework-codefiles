package com.shivu.springAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCoach {

	public static void main(String[] args) {
	
//		Retrieve bean from Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tenCoach = context.getBean("tennisCoach", TennisCoach.class);
		System.out.println(tenCoach.getDailyWorkout());
		System.out.println(tenCoach.getDailyFortune() + "\n\n");
		
		Coach cricCoach = context.getBean("cricketCoach", CricketCoach.class);
		System.out.println(cricCoach.getDailyWorkout());
		System.out.println(cricCoach.getDailyFortune());
		context.close();

	}

}
