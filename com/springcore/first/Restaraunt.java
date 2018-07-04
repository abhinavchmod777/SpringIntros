package com.springcore.first;

import java.util.ArrayList;
import java.util.Collection;

public class Restaraunt 
{
	Collection<String> waitersList = new ArrayList<String>();

	public void setWaitersList(Collection<String> waitersList) {
		this.waitersList = waitersList;
	}
	public void displayWaitersList(){
		System.out.println("Waiters list = "+ waitersList);
	}
	
}
