package com.bridgelabz.corePrograms;
 
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		int Year;
		System.out.println("Enter The Year In 4 Digit");
		Scanner LP = new Scanner (System.in);
		Year = LP.nextInt();
		
		if ( Year % 100 == 0 && Year % 400 == 0 )
		{
	        System.out.println( "Year "+Year+" is leap year ");
		}
		
		else if (Year % 100 != 0 && Year % 4 == 0 )
		{
		    System.out.println("Year "+Year+" is not leap year ");
		}
	}
}
