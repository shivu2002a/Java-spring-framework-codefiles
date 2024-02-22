package com.shivu.springOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	 
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope-ApplicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyFortune());
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		System.out.println(alphaCoach.getDailyFortune());
		
		System.out.println("Both instances are same: " + (theCoach == alphaCoach) );
		System.out.println("Memory location for theCoach: " + theCoach + " and alphaCoach: " + alphaCoach);
		
		
		
		
		
		context.close();
	}
}
