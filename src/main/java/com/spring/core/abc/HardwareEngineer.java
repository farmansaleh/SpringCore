package com.spring.core.abc;

import org.springframework.stereotype.Component;

@Component
public class HardwareEngineer implements Engineer {
	@Override
	public void development() {
		System.out.println("Hardware development..?");
	}
}
