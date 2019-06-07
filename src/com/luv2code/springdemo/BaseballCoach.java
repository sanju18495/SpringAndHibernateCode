package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	private String CoachName;

	public String getCoachName() {
		return CoachName;
	}

	public void setCoachName(String coachName) {
		System.out.println("inside setter method");
		CoachName = coachName;
	}

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "spend 30 mins on batting practice";
	}

	@Override
	public String dailyFortune() {
		return fortuneService.getFortune();
	}

	public void doMyStartUpStuff() {
		System.out.println("Inside Baseball Coach : Doing the startUpStuff");
	}

	public void doMyCleanUpStuff() {
		System.out.println("Inside Baseball Coach : Doing the cleanUpStuff");
	}

}
