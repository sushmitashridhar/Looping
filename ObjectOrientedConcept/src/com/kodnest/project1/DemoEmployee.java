package com.kodnest.project1;
//import java.util.Scanner;

public class DemoEmployee {
	public static void main(String[] args)
	{
		Employee e=new Employee("smita",10);
		//Scanner scan=new Scanner(System.in);
		//System.out.println("Enter the name:");
		//e.setName(scan.nextLine());
	//	System.out.println("Enter the id:");
		//e.setAge(scan.nextInt());
		//scan.close();
		System.out.println(e.getName());
		System.out.println(e.getId());
	}

}
