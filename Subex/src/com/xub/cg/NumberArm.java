package com.xub.cg;

/**
 * This is a Class Number where the operations of 
 * the number are taken place
 * @param args
 */
public class Armstrong {
	
	private int number;
	
	/**
	 * This is a ArmstrongNumber Class where the 
	 * @param number
	 * @return
	 */
	
	public int ArmstrongNumber(int number)
	{
		String s=Integer.toString(this.number);
		for(int i=0;i<s.length();i++)
		{
			char CurrentChar=s.charAt(i);
			String CurrentCharAsString=Character.toString(CurrentChar);
			int CurrentNumber=Integer.parseInt(CurrentCharAsString);
			int CubeOfCurrentNumber=CurrentNumber*CurrentNumber*CurrentNumber;
			
		}
	}
	
	public boolean IsArmstrongNumber(int checknumber)
	{
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
				for(int i=0;i<s.length();i++)
				{
					char currentChar=s.charAt(i);
					
					int currentNumber=Integer.parseInt(currentChar);
				}
				return false;
			}
		}
	}

	public int getNumber()
	{
		return this.number;
	}
	
	public int SumofDigits(int NumberToAdd)
	{
		int TotalSum;
		TotalSum += NumberToAdd;
	}
	
	/**
	 * This is the main method where the output will be printed.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int range=10000;
		for(int i=0;i<range;i++)
		{
			Armstrong num= new Armstrong(i);
			if(num.IsArmstrongNumber())
			{
				System.out.println(num.getNumber() + "is an Armstrong Number");
			}
			else
			{
				System.out.println(num.getNumber() + "is not an Armstrong Number");
			}
		}
	}

}
