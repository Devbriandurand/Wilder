package com.company;

public class Wilder {
String firstname;
boolean aware;
	
	public Wilder(String firstname, boolean aware) {
		this.firstname = firstname;
		this.aware	   = aware;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setAware(boolean aware) {
		this.aware = aware;
	}
	
	public boolean getAware() {
		return aware;
	}
	
	
	public  void whoAmI() {
		if(this.aware == true) {
		System.out.println("Je m'appelle " + getFirstname() + " et je suis aware, un vrai fifou XD");
	} else {
		System.out.println("Je m'appelle " + getFirstname() + " et je ne suis pas aware, par contre... je suis une belle raclure ! Top cet exo ^^");
		}
	
	}
	

}
