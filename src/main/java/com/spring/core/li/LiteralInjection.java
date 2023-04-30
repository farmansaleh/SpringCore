package com.spring.core.li;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.abc.Config;

public class LiteralInjection {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);//ClassPathXmlApplicationContext("beans.xml");
		Employee employee = ac.getBean("employee",Employee.class);
		System.out.println(employee);
	}
}
