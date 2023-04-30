package com.spring.core.li;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // = <bean class="com.spring.core.li.Employee" id="employee">
public class Employee {

	@Value("${employee.id}")
	private int id;
	@Value("${employee.name}")
	private String name;
	@Value("${employee.salary}")
	private int salary;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
