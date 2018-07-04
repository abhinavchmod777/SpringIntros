package com.springcore.first;

public class Restaraunt 
{
	private String welcomeNote;
	
	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer() {
		System.out.println(welcomeNote);
	}
	
	public void init(){
		System.out.println("Restaraunt bean is initailized");
	}
	public void destroy() {
		System.out.println("Restaraunt bean is deatroyed");
	}
	
}
