package com.pschaefer.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pschaefer.model.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		Coach coach2 = context.getBean("drinkingCoach", Coach.class);
		
		// call a method on the bean
		System.out.println("Tennis Coach: ");
		System.out.println(coach.getDailyWorkout());		
		System.out.println(coach.getFortune());
		System.out.println(coach.toString());
		
		System.out.println("\nDrinking Coach: ");
		System.out.println(coach2.getDailyWorkout());		
		System.out.println(coach2.getFortune());
		System.out.println(coach2.toString());
		
		// close the context
		context.close();
	}

}
