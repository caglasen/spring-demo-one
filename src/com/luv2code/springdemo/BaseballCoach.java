package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//define a private field for dependency
	private FortuneService fortuneService;
	private RandomFortuneService randomFortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	public BaseballCoach(RandomFortuneService randFortune) {
		randomFortuneService = randFortune;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on battling practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return randomFortuneService.getRandomFortune();
	}

}
