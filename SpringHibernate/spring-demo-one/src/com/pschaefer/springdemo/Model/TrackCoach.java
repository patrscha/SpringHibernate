package com.pschaefer.springdemo.Model;

import com.pschaefer.springdemo.Service.FortuneService;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run around in big circles.";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
	public void startUp() {
		System.out.println("TrackCoach: inside startUp");
	}

	public void cleanUp() {
		System.out.println("TrackCoach: inside cleanUp");
	}
}
