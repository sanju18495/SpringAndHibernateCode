package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", BaseballCoach.class);
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.dailyFortune());
		context.close();
	}

}
