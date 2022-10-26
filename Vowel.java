package com.bridgelabz;

import java.util.Scanner;

public class Vowel {

	public void vow() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a vowel or consonant: ");
		char alpha=sc.next().charAt(0);//next().charAt(0) --method to take char input;
		switch(alpha)
		{
		case 'a': System.out.println("vowel");
				  break;
		case 'e': System.out.println("vowel");
		  		  break;
		case 'i': System.out.println("vowel");
		  		  break;
		case 'o': System.out.println("vowel");
		  		  break;
		case 'u': System.out.println("vowel");
		  		  break;
		default: System.out.println("consonant");
		  		  break;
		}
		
	}
	public static void main(String[] args) {
		Vowel obj=new Vowel();
		obj.vow();
	}
}
