package com.pschaefer.springdemo.Model;

import com.pschaefer.springdemo.Service.FortuneService;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins in batting cage.";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
}
