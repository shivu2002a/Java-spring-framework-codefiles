package com.shivu.springOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifecycle-ApplicationContext.xml");
		
		TrackCoach trackCoach = context.getBean("myCoach", TrackCoach.class);
		System.out.println(trackCoach.getDailyWorkout());
		context.close();
	}

}
