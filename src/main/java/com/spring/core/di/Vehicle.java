package com.spring.core.di;

public class Vehicle {

	public static void main(String[] args) {
		new Key().run(new Car());
	}
}

class Key{
	public void run(Engine engine) {
		engine.start();
	}
}