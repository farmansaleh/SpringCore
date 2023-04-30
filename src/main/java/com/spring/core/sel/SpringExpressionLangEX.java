package com.spring.core.sel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringExpressionLangEX {
	
	@Value("#{'Spring'.length()}")   // call method by Expression Language  -- internally work like constructor code
	public int l;
	
	@Value("#{new String('Hello')}")   //create object
	public String cObj;
	
	@Value("#{T(java.lang.Math).sqrt(16)}")  // call static method
	public double sqrt;
	
	@Value("#{T(java.lang.Math).PI}")  // call static variable
	public double pi;
	
	@Value("#{10>8?true:false}")   // Boolean expression
	public boolean flag;
	
	public int number;
	
	public int cube(int n) {
		return n*n*n;
	}
	
	public SpringExpressionLangEX() {
		SpelExpressionParser sep = new SpelExpressionParser();
		Expression expression = sep.parseExpression("'Spring'.length()");
		System.out.println("String.length() by Constructor : "+expression.getValue());
		System.out.println("Math.Power by Constructor : "+sep.parseExpression("T(java.lang.Math).pow(2,3)").getValue());
		
		StandardEvaluationContext sec = new StandardEvaluationContext(this);
		sep.parseExpression("number").setValue(sec, "5");  // value store in variable by using SEL
		System.out.println("Cube is : "+this.cube(number));  
	}
	
	
}
