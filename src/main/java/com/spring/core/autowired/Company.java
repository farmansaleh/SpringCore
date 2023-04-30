package com.spring.core.autowired;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Company implements InitializingBean,DisposableBean {
	
	@Autowired
	Dept dept;
	
//	public Company(Dept dept) {
//		this.dept=dept;
//		System.out.println("constructor");
//	}
//	
//	public void setDept(ITDept dept) {
//		this.dept = dept;
//		System.out.println("setter");
//	} 

	public void companyWork() {
		if(dept == null) {
			System.out.println("No client No work");
		}else {
			dept.work();
		}
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet :: Init method called for "+this.getClass().getSimpleName());	
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroyed bean for "+this.getClass().getSimpleName());
	}
}
