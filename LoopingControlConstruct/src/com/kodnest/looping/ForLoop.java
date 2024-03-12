package com.kodnest.looping;
import java.util.Scanner;
public class ForLoop {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("User!! Please enter the n value:");
		int n=scan.nextInt();
		System.out.println("The first n natural numbers are:");
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}

}
