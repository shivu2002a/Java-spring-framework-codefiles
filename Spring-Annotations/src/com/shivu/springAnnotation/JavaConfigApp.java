package com.shivu.springAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach tenniscoach = context2.getBean("tennisCoach", Coach.class); 
		String s = tenniscoach.getDailyWorkout();
		System.out.println(s);
		
		SwimCoach swimCoach = context2.getBean("swimCoach", SwimCoach.class);
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach.getEmail());
		System.out.println(swimCoach.getAddress());
		
		context2.close();
 	}
}
