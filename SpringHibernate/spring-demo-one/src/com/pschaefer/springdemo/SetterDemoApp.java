package com.pschaefer.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pschaefer.springdemo.Model.CricketCoach;

public class SetterDemoApp {

	public static void main(String[] args) {

		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeamName());
		
		//close the context
		context.close();
	}

}
