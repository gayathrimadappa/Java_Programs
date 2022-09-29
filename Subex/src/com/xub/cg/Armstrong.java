package com.xub.cg;

/**
 * This is a Class Number where the operations of 
 * the number are taken place
 * @param args
 */
public class Armstrong {
	
	private int number;
	
	/**
	 * This is a Constructor Armstrong Class where the 
	 * number is initialized
	 * @param inputNumber
	 * @return 
	 */
	public Armstrong(int inputNumber)
	{
		this.number=inputNumber;
	}
	
	public boolean isArmstrongNumber()
	{
		int TotalSum = 0;
		if(this.number<0)
		{
			return false;
		}
		else if(this.number==0)
		{
			return true;
		}
		else 
		{
			if(this.number>6562)
			{
				return false;
			}
			else
			{
				String s=Integer.toString(this.number);
                for(int i = 0;i < s.length(); i++) 
                {
                         char CurrentChar = s.charAt(i); 
                         int CurrentNumber = Character.getNumericValue(CurrentChar); 
                         int CubeOfValues = CurrentNumber*CurrentNumber*CurrentNumber;
                         TotalSum += CubeOfValues;
                }
                if(TotalSum==this.number)
                {
                	return true;
                }
			}
		}
		return false;
	}

	public int getNumber()
	{
		return this.number;
	}
	
	/**
	 * This is the main method where the output will be printed.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int range=1000000;
		for(int i=0;i<range;i++)
		{
			Armstrong num= new Armstrong(i);
			if(num.isArmstrongNumber())
			{
				System.out.println(num.getNumber() + " is an Armstrong Number");
			}
			
		}
	}

}
