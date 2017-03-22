package com.pschaefer.service;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	private String[] fortunes = {
		"You will get lucky soon.",
		"Free drugs soon!",
		"Look down and you will find money",
		"A new venture is soon to be upon you",
		"Your ex will go to prison",
		"An amazing lover will enter into your life",
		"Furry friends are in your future",
		"Make a large bet on your favorite team.."
	};
	
	@Override
	public String getFortune() {
		return fortunes[(new Random()).nextInt(fortunes.length)];
	}

}
