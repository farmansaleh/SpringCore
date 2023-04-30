package com.spring.core.abc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SoftwareEngineer implements Engineer {
	@Override
	public void development() {
		System.out.println("Software development..?");
	}
}
