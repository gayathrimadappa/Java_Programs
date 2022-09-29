package com.xub.cg;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,i,count=10,len=2,number;
		int arr[]=new int[20];
		arr[0]=n1;
		arr[1]=n2;
		Scanner sc=new Scanner(System.in);
		System.out.println(n1);
		System.out.println(n2);
		for(i=2;i<count;i++)
		{
			n3=n1+n2;
			arr[i]=n3;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			len++;
		}
		System.out.println("Array elements are");
		for(int k=0;k<=len;k++)
		{
			System.out.println(arr[k]);
		}
		System.out.println("Enter the NUmber");
		number=sc.nextInt();
		boolean is_fibonacci = false;
		for(int j=0;j<len;j++)
		{
			
			if(arr[j]==number)
			{
				is_fibonacci = true;
			}
		}
		System.out.println(number + " is" + (is_fibonacci ? " " : " not ")  + "a fibinocci number");
	}

}
