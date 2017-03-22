package com.pschaefer.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pschaefer.springdemo.Model.Coach;

public class BeanScopeApp {

	// used to test bean scoping
	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve beans from spring container
		Coach coach1 = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach", Coach.class);
		Coach coach3 = context.getBean("baseballCoach", Coach.class);
		Coach coach4 = context.getBean("baseballCoach", Coach.class);
		
		//check if they are the same
		boolean result = (coach1 == coach2);
		System.out.println("\nPointing to the same object?: " + result);
		System.out.println("\nMemory location for coach1: " + coach1.toString()); // default toString() displays memorry address
		System.out.println("\nMemory location for coach1: " + coach2.toString());
		
		result = (coach3 == coach4);
		System.out.println("\nPointing to the same object?: " + result);
		System.out.println("\nMemory location for coach3: " + coach3.toString()); // default toString() displays memorry address
		System.out.println("\nMemory location for coach4: " + coach4.toString());
		
		// be nice and close the context
		context.close();
	}

}
