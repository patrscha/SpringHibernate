package com.pschaefer.springdemo.Service;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {"First fortune so you'e lucky", "You gonna get lucky soon!", "Fate will serve you well."};

	@Override
	public String getFortune() {
		return fortunes[new Random().nextInt(fortunes.length)]; // get a random fortune
	}

}
