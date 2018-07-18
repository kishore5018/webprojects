package com.java;

public class student

{
	
	
	private String name;
	
	private String email;

	private int num;

	private String address;
	
	public String getAddress() {
		return address;
	}
	
	public String study;

	public String getStudy() {
		return study;
	}

	public void setStudy(String study) {
		this.study = study;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void display()
	{
		System.out.println("......Hello Spring Project......");
		
		System.out.println("My Name is:"+name);
		
		System.out.println("I am from :"+address);
		
		System.out.println("My highest Qulification is:"+study);
	}
	
	public void show()
	{	
		System.out.println("My Email Id:"+email);
	
		System.out.println("My Mobile Number:"+num);
	}

}
