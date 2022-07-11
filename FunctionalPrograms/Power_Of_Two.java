package com.bridgelabz.corePrograms;

import java.util.Scanner;
public class Power_Of_Two {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Power Number : " );
		int num1 = s.nextInt();
		int num = 2;
		double Power_of_Two = Math.pow(num, num1);
		System.out.println("Power of 2^ " + num1+ " = "+ Power_of_Two );
	
	}

}
