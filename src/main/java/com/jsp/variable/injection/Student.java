package com.jsp.variable.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	
	@Value(value = "xyz")
	String name;
	@Value(value = "xyz@gmail.com")
	String email;
	
	public void printStudent() {
		System.out.println(name);
		System.out.println(email);
	}

}
