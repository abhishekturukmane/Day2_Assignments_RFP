package com.bridgelabz;

import java.util.Scanner;

public class MinMaxOperators {

	public void minMax()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		System.out.println("Enter c:");
		int c=sc.nextInt();
		System.out.println("Enter the Number of operation you want to perform:");
		int d;
		int op=sc.nextInt();
		switch(op)
		{
		 case 1 : d=a+b*c;
		 		  System.out.println("The result is:"+ d);
		 		  break;
		 case 2: d=c+a/b;
		 		  System.out.println("The result is:"+ d);
		 		  break;
		 case 3: d=a%b+c;
	 			  System.out.println("The result is:"+ d);
	 			  break;
		 case 4: d=a*b+c;
			      System.out.println("The result is:"+ d);
			      break;
		 case 5: if(a>b && a>c)
		 			{
			 			System.out.println("A is max");
		 			}
		 			else if(b>c && b>a)
		 			{
		 				System.out.println("B is max");
		 			}
		 			else
		 			{
		 				System.out.println("C is max");
		 				
		 			}
		 			break;
		 case 6: if(a<b && a<c)
				{
	 			System.out.println("A is min");
				}
				else if(b<c && b<a)
				{
				System.out.println("B is min");
				}
				else
				{
				System.out.println("C is min");
				
				}
		 		break;
		default: System.out.println("Enter valid number");

		}
	}
	
	public static void main(String[] args) {
		MinMaxOperators obj=new MinMaxOperators();
		obj.minMax();
	}
	
}
