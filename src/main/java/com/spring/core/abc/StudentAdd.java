package com.spring.core.abc;

import org.springframework.beans.factory.annotation.Value;

public class StudentAdd {
	@Value("${std.add.city}")
	private String city;
	@Value("${std.add.pincode}")
	private String pincode;
	
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public void setPincode(String pincode) {
//		this.pincode = pincode;
//	}
	
	@Override
	public String toString() {
		return "StudentAdd [city=" + city + ", pincode=" + pincode + "]";
	}
	
}
