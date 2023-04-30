package com.spring.core.aop;

import org.springframework.stereotype.Component;

@Component
public class Notification {
	public int sendApplication(int application_no,String application_name) {
		System.out.println("Application No - "+application_no+" is sended with name is : "+application_name);
		return application_no;
	}
	
	public void throwEx(int appl_no) throws Exception {
		throw new Exception("Application not found!");
	}
}
