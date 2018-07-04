package com.springcore.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String args[]) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		((AbstractApplicationContext)context).registerShutdownHook();
		
		Restaraunt obj1 = (Restaraunt)context.getBean("restarauntBean");
		obj1.setWelcomeNote("Object1 welcome note");
		obj1.greetCustomer();
		
		
		Tea t = (Tea)context.getBean("teaBean");
		t.prepareHotDrink();
	}
}
