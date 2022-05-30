package com.springbasics;

public class Emplyee{
	private int id;  
	private String name;  
	private Address address;
	
	public Emplyee() { 
		System.out.println("def cons");
		}  
	  
	public Emplyee(int id, String name, Address address) { 
		super();
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	  
	void show(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address.toString());  
	} 
}
