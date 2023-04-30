package com.spring.core.autowired;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowire {
	
	public static void main(String[] args) {
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Company company = ac.getBean("company",Company.class);
		company.companyWork();
		ac.close();
	}
	
}
