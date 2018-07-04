package com.springcore.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String args[]) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Restaraunt obj1 = (Restaraunt)context.getBean("restarauntBean");
		obj1.setWelcomeNote("Object1 welcome note");
		obj1.greetCustomer();
		
		Restaraunt obj2 = (Restaraunt)context.getBean("restarauntBean");
		obj2.greetCustomer();
	}
}
