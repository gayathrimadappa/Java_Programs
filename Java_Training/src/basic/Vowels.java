package basic;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		char letter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		
		int n=10;
		while(n!=0)
		{
			letter=sc.next().charAt(0);
			switch(letter)
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.println(letter+" is a vowel");
					break;
				default:
					System.out.println(letter+ " is a Consonent");			
			}
			n--;
		}
	}
}