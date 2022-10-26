package com.bridgelabz;

import java.util.Scanner;

public class ReadWrite1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the single digit number:");
		int num=sc.nextInt();
		if(num==1)
		{
			System.out.println("one");
		}
		else if(num==2)
		{
			System.out.println("Two");
		
		}
		else if(num==3)
		{
			System.out.println("Three");
		
		}
		else if(num==4)
		{
			System.out.println("Four");
		
		}
		else if(num==5)
		{
			System.out.println("Five");
		
		}
		else
		{
			System.out.println("Invalid number");
		}
		
		sc.close();
	}
}
