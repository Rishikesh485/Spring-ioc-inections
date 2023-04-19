package com.jsp.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDriver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Myconfig.class);
	Car car=(Car)applicationContext.getBean("car");
	car.printCar();
}
}
