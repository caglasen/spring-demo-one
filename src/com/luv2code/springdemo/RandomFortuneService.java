package com.luv2code.springdemo;

public class RandomFortuneService {
	private String[] fortunes = {"3 vakte kadar evleneceksin",
								"3 vakte kadar bi yerden para gelecek",
								"3 vakte kadar kariyerinde yükseleceksin"};
	
	public String getRandomFortune() {
		return fortunes[(int)Math.random()*3];

	}
}
