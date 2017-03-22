package com.pschaefer.springdemo.Model;

import com.pschaefer.springdemo.Service.FortuneService;

public class HockeyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public HockeyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Go get in a bar fight.  And win.";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
