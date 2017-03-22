package com.pschaefer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pschaefer.service.FortuneService;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//@Autowired	// move injection to method
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Smack a ball around.";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff()");
		this.fortuneService = fortuneService;
	}

}
