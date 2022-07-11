package com.bridgelabz.corePrograms;

import java.util.Scanner;
public class Even_Or_Odd {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner (System. in);
		System.out.println("Enter the number:");
		n = s.nextInt();
		
		if(n % 2 == 0)
		{
			System.out.println("The given number "+n+" is Even");
		}
		else
		{
			System.out.println("The given number "+n+" is Odd");
		}
	}

}
