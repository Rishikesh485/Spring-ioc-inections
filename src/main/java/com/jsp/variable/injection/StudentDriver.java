package com.jsp.variable.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.setter.injection.Myconfig;

public class StudentDriver {
public static void main(String[] args) {
	ApplicationContext applicationContext= new AnnotationConfigApplicationContext(com.jsp.variable.injection.Myconfig.class);
	Student student=(Student)applicationContext.getBean("student");
	
	student.printStudent();

}
}
