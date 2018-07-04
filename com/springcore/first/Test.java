package com.springcore.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Restaraunt obj = (Restaraunt)context.getBean("restarauntBean");
		obj.displayWaitersList();
	}
}
