package com.pschaefer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.pschaefer.service.FortuneService;

@Component
public class DrinkingCoach implements Coach {
	
	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;
	
	public DrinkingCoach(){
		System.out.println(">> DrinkingCoach: inside default construstor");
	}

	@Override
	public String getDailyWorkout() {
		return "Take a shot for every touchdown made today";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	
/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> DrinkingCoach: inside setFortuneService()");
		this.fortuneService = fortuneService;
	}*/

}
