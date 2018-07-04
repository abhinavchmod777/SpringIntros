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
	
}
