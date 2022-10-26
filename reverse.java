package com.bridgelabz;

public class reverse {

	int num=123;
	int rem;
	static int rev=0;
	public void reverse() 
	{
		for(int i=1;i<=3;i++)
		{
		
			rem=num%10;//3,2,1
			rev=rev*10+rem;//0*10+3=3,  3*10+2=32 , 32*10+1=321
			num=num/10;//12,1,0
			
		}
		
	}
	public static void main(String[] args) {
		
		reverse obj=new reverse();
		obj.reverse();
		System.out.println("The reverse of number 123 is:"+ rev);
	}
}
