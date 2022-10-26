package com.bridgelabz;

import java.util.Scanner;

public class WhileReverse {

	
	
	public void rev()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num =sc.nextInt();
		int rev=0;
		int rem=0;
		int i=0;
		while(i<3)// we can also use condition(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			i++;
			
		}
		System.out.println("The reverse of number is:"+ rev);
		
	}
	public static void main(String[] args) {
		WhileReverse obj=new WhileReverse();
		obj.rev();
		
	}
}
