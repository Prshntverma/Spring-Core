package com.rays.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rays.test.Person;

public class TestOrder {

public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Order p = context.getBean("order", Order.class);
		
		p.makeOrder(3);

		
}
}