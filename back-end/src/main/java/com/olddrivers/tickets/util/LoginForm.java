package com.olddrivers.tickets.util;

public class LoginForm {
	
	private String name;
	private String password;
	
	public LoginForm(String name, String password) {
		super();
		
		this.name = name;
		this.password = password;
	}
	

	public String getData1() {
		return name;
	}
	
	public void setData1(String name) {
		this.name = name;
	}
	
	public String getData2() {
		return password;
	}

	public void setData2(String password) {
		this.password = password;
	}

}
