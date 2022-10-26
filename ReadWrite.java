package com.bridgelabz;

import java.util.Scanner;

public class ReadWrite {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a single Digit Number:");
		int no=sc.nextInt();
		
		int no1=5;
		//String str1="Five";
		if(no==no1)
		{
			System.out.println("The Number is Five");
		}
		else
		{
			System.out.println("Invalid number");
		}
		
		sc.close();
	}
}
