package com.bridgelabz;

import java.util.Scanner;

public class Palindrome {

	public void palin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int i=0;
		int rem=0;
		int rev=0;
		int digit=num;//digit is taken so as to keep original no safe;
		while(i<3)
		{
			rem=digit%10;
			rev=rev*10+rem;
			digit=digit/10;
			i++;
		}
		
		System.out.println("The reverse of number is:"+ rev);
		
		if(rev==num)
		{
			System.out.println("yes it is palindrome");
		}
		else
		{
			System.out.println("No , it is not a palindrome");
		}
	}
	public static void main(String[] args) {
		Palindrome obj=new Palindrome();
		obj.palin();
		
		
	}
}
