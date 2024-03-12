package com.kodnest.project1;

import java.util.Scanner;

public class Employee {
	private String name;
	private int id;
	public Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
}

