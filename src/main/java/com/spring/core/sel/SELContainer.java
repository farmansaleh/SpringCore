package com.spring.core.sel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SELContainer {

	@Autowired
	SpringExpressionLangEX springExpressionLangEX;
	
	public void setProp() {
		System.out.println("Length : "+springExpressionLangEX.l);
		System.out.println("Object created by SEL: "+springExpressionLangEX.cObj);
		System.out.println("Math.sqrt method call by SEL : "+springExpressionLangEX.sqrt);
		System.out.println("Math.PI var call by SEL : "+springExpressionLangEX.pi);
		System.out.println("Boolean Expression by SEL : "+springExpressionLangEX.flag);
	}
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");//new AnnotationConfigApplicationContext(Config.class);
		SELContainer sel = ac.getBean("SELContainer",SELContainer.class);
		sel.setProp();
	}
}