package com.spring.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleContainer {
	
	public static void main(String ar[]) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		Engine engine = ac.getBean("engine",Engine.class);
//		new Key().run(engine);
		
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Engine engine = ac.getBean("engine",Engine.class);
		new Key().run(engine);
		ac.close();    //for call destroy method we have to close container and close method exist in ConfigurableApplicationContext Interface
	}
	
}
