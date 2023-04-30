package com.spring.core.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NotificationContainer {
	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Notification notification = ac.getBean("notification",Notification.class);
		System.out.println("-------------------------");
		int appl_no = notification.sendApplication(1000,"SBM");
		System.out.println("Application No is : "+appl_no);
		try{
			notification.throwEx(1213);
		}catch (Exception e) {
			System.out.println("---------------------------------"+e.getMessage());
			e.printStackTrace();
		}
	}
}
