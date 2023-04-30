package com.spring.core.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBsdConfig {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		Student student = ac.getBean("student",Student.class);
		System.out.println(student);
		
		Company company = ac.getBean("company",Company.class);
		company.comInfo();
		company.engineer.development();
	}
}
