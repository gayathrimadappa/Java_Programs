package com.xub.cg;

import java.util.Scanner;

public class Prime {
	
	private static void check_number(int number_to_check)
	{
		int i,count=0;
		for(i=1;i<=number_to_check;i++)
		{
			if(number_to_check%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(number_to_check+" is a prime number");
		}
		else
		{
			System.out.println(number_to_check+" is a not prime number");
		}
		
	}
	public static void main(String args[])
	{
		int number_to_check,count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to be checked");
		number_to_check = sc.nextInt();
		check_number(number_to_check);
		
	}
}
