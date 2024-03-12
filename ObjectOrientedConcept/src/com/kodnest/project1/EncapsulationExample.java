package com.kodnest.project1;

public class EncapsulationExample {
	
	
	public static void main(String[] args)
	{
		Student s=new Student();
		s.setName("Arav");
		s.setId(10);
		System.out.println(s.getName());
		System.out.println(s.getId());
	}

}
