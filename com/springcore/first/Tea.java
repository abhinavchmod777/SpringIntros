package com.springcore.first;

public class Tea implements IHotDrink {

	public void prepareHotDrink() {
		System.out.println("tea is made");
	}

	public void init(){
		System.out.println("Tea bean is initailized");
	}
	public void destroy2() {
		System.out.println("Tea bean is destroyed");
	}

}
