package com.spring.core.di;

public class Car implements Engine {

	@Override
	public void start() {
		System.out.println("Car has been started...");
	}
	
	public void init() {
		System.out.println("Init called for "+this.getClass().getSimpleName());
	}
	public void destroys() {
		System.out.println("Destroy calledfor "+this.getClass().getSimpleName());
	}
}
