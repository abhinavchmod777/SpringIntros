package com.springcore.first;

public class Restaraunt 
{
	IHotDrink hotDrink;
	public void setHotDrink(IHotDrink hotDrink)
	{
		this.hotDrink=hotDrink;
	}
	
	public void prepareHotDrink()
	{
		hotDrink.prepareHotDrink();
	}
}
