package com.bridgelabz;

import java.util.Scanner;
import java.lang.Math.*;

public class Quadratic {

	public void qd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		System.out.println("Enter c:");
		int c=sc.nextInt();
		
		double d=(b*b - 4.0*a*c);
		//double sqrtval=Math.abs(d);
		//double sqrt=Math.sqrt(sqrtval);
		if(d>0)
		{
			double r1=-b + Math.sqrt(d)/(2*a) ;
			double r2 = -b - Math.sqrt(d)/(2*a);
			System.out.println("The roots are: "+ r1 + " and "+ r2);
		}
		else
		{
			System.out.println("Roots are imainary");
		}
		
		
		
	}
	public static void main(String[] args) {
		Quadratic obj=new Quadratic();
		obj.qd();
	}
}
