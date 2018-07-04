package com.springcore.first;

public class Restaraunt 
{
	IHotDrink hotDrink;
	Restaraunt(IHotDrink hotDrink)
	{
		this.hotDrink=hotDrink;
	}
	
	public void prepareHotDrink()
	{
		hotDrink.prepareHotDrink();
	}
}
