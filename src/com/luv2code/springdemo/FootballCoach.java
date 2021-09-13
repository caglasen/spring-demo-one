package com.luv2code.springdemo;

public class FootballCoach implements Coach{
	
	private FortuneService fortuneService;
	private RandomFortuneService randomFortuneService;
	
	public FootballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "what can i do?... sometimes";
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
