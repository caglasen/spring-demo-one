package com.luv2code.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor.");
	}
	
	//setter method for setter injection dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService.");
		this.fortuneService = fortuneService;
	}
	
	

	public String getEmailAddress() {
		System.out.println("CricketCoach: inside setter method - getEmail.");
		return emailAddress;
	}

	public String getTeam() {
		System.out.println("CricketCoach: inside setter method - getTeam.");
		return team;
	}

	public void setEmailAddress(String email) {
		System.out.println("CricketCoach: inside setter method - setTeam.");
		this.emailAddress = email;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam.");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
