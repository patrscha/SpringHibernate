package com.pschaefer.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pschaefer.springdemo.Model.Coach;

public class BeanLifecycleApp {

	// used to test bean scoping
	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		//retrieve beans from spring container
		Coach coach1 = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach1.getDailyWorkout());
		
		// be nice and close the context
		context.close();
	}

}
