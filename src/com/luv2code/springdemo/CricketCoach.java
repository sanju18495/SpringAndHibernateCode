package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String teamName;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("insdie setter method - emailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		System.out.println("insdie setter method - teamName");
		this.teamName = teamName;
	}

	public CricketCoach() {
		System.out.println("inside no-arg constructor");
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("insdie setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "practice fast bowling";
	}

	@Override
	public String dailyFortune() {
		return fortuneService.getFortune();
	}
}
