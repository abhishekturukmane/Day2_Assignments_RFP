package com.bridgelabz;

import java.util.Scanner;

public class WhileNaturalNumber {
	Scanner sc= new Scanner(System.in);
	int i=1;
	int sum=0;
	public void sum()
	{
		System.out.println("Enter natural number from 1 to 5:");
		while(i<=5)
		{
			sum+=sc.nextInt();
			i++;
		}
		System.out.println("The sum is :" + sum);
		
	}
	public static void main(String[] args) {
		WhileNaturalNumber obj=new WhileNaturalNumber();
		obj.sum();
		
		
	}
}
