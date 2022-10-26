package com.bridgelabz;
import java.math.*;
public class Distance {


	public static void main(String[] args) {
		double x1=Integer.parseInt(args[0]);
		double y1=Integer.parseInt(args[1]);
		
		//int x2=Integer.parseInt(args[2]);
		//int y2=Integer.parseInt(args[3]);
		double sqrt;
		double distance = Math.sqrt(x1*x1+y1*y1);
		System.out.println("calculated distance :" +distance);
	}
}
