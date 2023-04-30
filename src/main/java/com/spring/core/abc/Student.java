package com.spring.core.abc;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int id;
	private String name;
	@Autowired
	private StudentAdd address;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(StudentAdd address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
