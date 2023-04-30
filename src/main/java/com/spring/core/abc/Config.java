package com.spring.core.abc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.spring.core")
@PropertySource({"classpath:employee-info","student-add-info"})
public class Config {
	
	@Bean
	public StudentAdd studentAdd() {
//		StudentAdd s = new StudentAdd();
//		s.setCity("Basu");
//		s.setPincode("385520");
		return new StudentAdd();
	}
	
	@Bean
	public Student student() {
		Student student = new Student();
		student.setId(101);
		student.setName("Farman");
//		student.setAddress(studentAdd());
		return student;
	}
	
//	@Bean
//	public Company company() {
//		Company company = new Company();
//		company.setEngineer(new HardwareEngineer());
//		return company;
//	}
	
//	@Bean
//	public Engineer engineer() {
//		return new SoftwareEngineer();
//	}
}
