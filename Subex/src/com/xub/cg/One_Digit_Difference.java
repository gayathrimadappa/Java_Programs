package com.xub.cg;

public class One_Digit_Difference {
    
	/**
	 * Checks whether the number is an odd consecutive or not
	 * @param str
	 * @return True if consecutive else false
	 */
	public static boolean check_for_odd(int number) {
		
	
		int before=-1;
		while(number>0) {
			int present=number%10;
			if(before!=-1)
			{
				if(Math.abs(present-before)!=1)
					return false;
			}
			number=number/10;
			before=present;
		}
		return true;
	}
		
	
	/**
	 * This method checks for the number whether it is prime or not
	 * @param number
	 * @return true if prime number else false
	 */
	public static boolean check_for_prime(int number)
	{
		int count=0;
		for(int k=1;k<=number;k++)
		{
			if(k%10==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * The main funtion where the program starts to run.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int result=0;
		int start=0,end=10000000;
		for(int i=start;i<=end;i++)
		{
			if(check_for_odd(i))
			{
				System.out.println(i+ " ");
				if(check_for_prime(i))   //checking for prime
				{
					result++;   //result increase by 1 if prime
				}	
				
			}
					     
		}
		System.out.println("The count is "+result);
	}

}
