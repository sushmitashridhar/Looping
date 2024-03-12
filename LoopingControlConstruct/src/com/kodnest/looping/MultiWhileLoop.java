package com.kodnest.looping;
import java.util.Scanner;
public class MultiWhileLoop {
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("User!! Please enter the n value:");
			int n=scan.nextInt();
			System.out.println("The first n natural numbers are:");
			int i=1;
			while(i<=10)
			{
				System.out.println(n + "X" + i+ "="+ (n*i));
				i++;
			}
		}

	}
