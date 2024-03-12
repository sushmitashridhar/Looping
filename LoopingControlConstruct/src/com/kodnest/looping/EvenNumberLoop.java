package com.kodnest.looping;
import java.util.Scanner;
public class EvenNumberLoop {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("User!! Please enter the n value:");
		int n=scan.nextInt();
		System.out.println("The first n even numbers are:");
		for(int i=0;i<=n;i=i+2)
		{
			System.out.println(i);
		}
	}

}