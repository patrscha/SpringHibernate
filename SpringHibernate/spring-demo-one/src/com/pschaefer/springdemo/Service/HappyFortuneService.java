package com.pschaefer.springdemo.Service;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Happy fortune service says you shall be happy!";
	}

}
