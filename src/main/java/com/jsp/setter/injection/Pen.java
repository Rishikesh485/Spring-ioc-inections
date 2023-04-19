package com.jsp.setter.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen {
	private String name;
	private String colour;
	public String getName() {
		return name;
	}
	@Value(value="trimax")
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	
	@Value(value="black")
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void printDetails() {
		System.out.println(this.name);
		System.out.println(this.colour);
	}
}
