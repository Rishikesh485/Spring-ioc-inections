package com.jsp.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDriver {
public static void main(String[] args) {
	ApplicationContext applicationContext= new AnnotationConfigApplicationContext(Myconfig.class);
	Pen pen=(Pen)applicationContext.getBean("pen");
	pen.printDetails();
}
}
