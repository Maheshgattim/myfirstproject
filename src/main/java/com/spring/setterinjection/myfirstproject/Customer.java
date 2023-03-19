package com.spring.setterinjection.myfirstproject;

import java.util.Properties;

public class Customer {

	private String name;
	private String contact;
	private Properties address;
	
	public Customer(String name,String contact,Properties address){
		this.name = name;
		this.contact = contact;
		this.address = address;
		
		
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}
}
