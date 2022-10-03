package basic;

public class Conditional {
	public static void main(String[] args) {
		
		int arr[] = new int[30];
		int n=10;
		System.out.println("First 10 numbers are: ");
		for(int i=1;i<=n;i++)
		{
			arr[i]=i;
			System.out.println(arr[i]);
		}
		System.out.println("Number greater than 5");
		//int a=5;
		for(int num:arr)
		{
			if(num>5)
			{
				System.out.println(num);
			}
		}	
	}
}