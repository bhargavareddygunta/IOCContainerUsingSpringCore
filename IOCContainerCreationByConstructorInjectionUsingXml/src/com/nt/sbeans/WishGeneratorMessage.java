package com.nt.sbeans;

import java.time.LocalTime;

public class WishGeneratorMessage {
	
	private LocalTime time;
	
	public  WishGeneratorMessage(LocalTime time) {
		this.time= time;
	}
	
	//b.methods
	
	public String showMessage(String name) {
		int hour = time.getHour();
		
		if(hour <=12) 
			return "Good morning "+name;
		else if(hour<16)
			return "Good afternoon "+name;
		else if(hour<20)
			return "Good evening "+name;
		else
			return "Good night "+name;
	}
}
