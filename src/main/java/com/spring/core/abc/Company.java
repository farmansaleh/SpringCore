package com.spring.core.abc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	
	@Value("ICT")
	private String companyName;
	
	@Autowired
//	@Qualifier("softwareEngineer") - by primary annotation
	Engineer engineer;

	public void comInfo() {
		System.out.println("Company name : "+companyName);
	}
	
}
