package com.bridgelabz.corePrograms;

import java.util.Scanner;
public class Swap_Two_Numbers {

	public static void main(String[] args) {
		int x;
		int y;
        int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thr value of X and Y: ");
		
	    x = sc.nextInt();
		y = sc.nextInt();
		
	    System.out.println("Before swapping numbers:"+x+" "+y);

        a=x;
        x=y;
        y=a;

        System.out.println("After swapping: "+x+" "+y);

        System.out.println();
        
		

     }

}


