package com.spring.core.di;

public class Aeroplane implements Engine {

	@Override
	public void start() {
		System.out.println("Aeroplane has been started...");
	}
}
