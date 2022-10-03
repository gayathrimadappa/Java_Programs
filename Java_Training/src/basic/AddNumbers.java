package basic;

import java.util.*;

public class AddNumbers {
	int a;
	int b;
	int c;
	
	//int a=20;
	//int b=50;
	//int c;
	
	public int sum(int a,int b)
	{
		this.a = a;
		this.b = b;
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		
		AddNumbers obj = new AddNumbers();
		Scanner sc = new Scanner(System.in);
		obj.a=sc.nextInt();
		obj.b=sc.nextInt();
		
		System.out.println("Total is: "+obj.sum(obj.a,obj.b));
		
		//int total = obj.sum(obj.a,obj.b);
		//System.out.println("Sum is: "+total);
	}

}
