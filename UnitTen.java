package com.bridgelabz;

public class UnitTen {

	public static void main(String[] args) {
		long num=1101001000;
		
		long unit=(num%10);
		long tens=(num/10)%10;
		long hunred=(num/100)%10;
		
		System.out.println("The units place is:"+ unit);
		System.out.println("The tens place is:"+ tens);
		System.out.println("The hundreds place is:"+ hunred);

	}
}
