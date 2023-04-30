package com.spring.core.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

	
	@Pointcut("execution(* com.spring.core.aop.Notification.sendApplication(..))")
	public void myPointCuts() {}
	
	@Before("myPointCuts()")
	public void authBeforeSentApplication(JoinPoint j) {
		System.out.println("Authenticate successfully!");
	}
	
	@After("myPointCuts()")
	public void afterSendApplSentNotification(JoinPoint j) {
		System.out.println("Notification sent!");
		System.out.println("Class : "+j.getTarget().getClass().getSimpleName());
		System.out.println("Signature : "+j.getSignature().getName());
		System.out.print("first index parameter : ");this.printArgs(j.getArgs());System.out.println();
		System.out.println("Pointcute Expression : "+j.getStaticPart());
	}
	
	public void printArgs(Object arr[]) {
		for (Object i : arr) {
			System.out.print(i);
		}
	}
	
	@AfterReturning(pointcut = "execution(* com.spring.core.aop.Notification.sendApplication(..))",returning = "rv")
	public void afterReturningAdvice(JoinPoint jp,int rv) {
		System.out.println("After Returning for "+jp.getSignature().getName()+" Method : "+rv);
	}
	
//	@AfterThrowing(value="execution(* com.spring.core.aop.Notification.throwEx(..))",throwing="ex")  
	public void afterThrowingAdvice(Exception ex,JoinPoint jp) {
		System.out.println("After throwing Exception : "+jp.getSignature().getName());
	}
	
	/*
	 @Around("execution(* com.spring.core.aop.Notification.sendApplication(..))")
	public Object aroundAdvice(ProceedingJoinPoint jp) {
		Object[] obj = jp.getArgs();
		obj[0] = Integer.parseInt(obj[0]+"") - 50;
		obj[1] = "BSK";
		try {
			jp.proceed(obj);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return obj[0];//Integer.parseInt(obj[0]+"");
	}*/
	
//	@After("execution(* com.spring.core.*.*.*(..))")
//	public void logging() {
//		System.out.println("call after every method");
//	}
}
