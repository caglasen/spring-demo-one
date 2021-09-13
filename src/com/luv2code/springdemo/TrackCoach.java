package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	private RandomFortuneService randomFortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach(RandomFortuneService randFortune) {
		this.randomFortuneService = randFortune;
	}
	
	@Override
	public String getDailyWorkout() {
		return "run 5 km";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it:" + fortuneService.getFortune();
	}

	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return randomFortuneService.getRandomFortune();
	}
	
	//init method - it is a custom hook
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStratupStuff");
	}
	
	//destroy method - it is a custom hook
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
}
