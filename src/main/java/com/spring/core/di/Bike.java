package com.spring.core.di;

public class Bike implements Engine {

	@Override
	public void start() {
		System.out.println("Bike has been started...");
	}
}
