package com.shivu.springOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		
		// Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from Spring Container
		// Alias(Bean - ID), Interface implemented by that class
		Coach bbCoach = context.getBean("baseballCoach", Coach.class);
		
		Coach tCoach = context.getBean("trackCoach", Coach.class);
		
		//Call the methods
		System.out.println(bbCoach.getDailyWorkout() + "\n" + bbCoach.getDailyFortune() + "\n");
		System.out.println(tCoach.getDailyWorkout() + "\n" + tCoach.getDailyFortune());
		
		//Close the appContext
		context.close();
	}

}
