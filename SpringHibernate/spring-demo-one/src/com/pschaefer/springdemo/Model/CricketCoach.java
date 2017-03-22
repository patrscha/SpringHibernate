package com.pschaefer.springdemo.Model;

import com.pschaefer.springdemo.Service.FortuneService;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String teamName;
	
	public CricketCoach() {
			System.out.println("CricketCoach: Inside constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Pretend to be a cricket";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside fortuneService setter method");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside emailAddress setter method");
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		System.out.println("CricketCoach: Inside teamName setter method");
		this.teamName = teamName;
	}
}
