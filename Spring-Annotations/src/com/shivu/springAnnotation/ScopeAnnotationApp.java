package com.shivu.springAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAnnotationApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach1 = context.getBean("tennisCoach", TennisCoach.class);
//		System.out.println(coach1.getDailyWorkout());
		Coach coach2 = context.getBean("tennisCoach", TennisCoach.class);
//		System.out.println(coach2.getDailyWorkout());
		
		if(coach1 == coach2) {
			System.out.println("Same instances-- Memory location: " + coach1);
		} else {
			System.out.println("Different instances--- Memory locations:" + coach1  + ", " + coach2);
		}
		context.close();
	}

}
