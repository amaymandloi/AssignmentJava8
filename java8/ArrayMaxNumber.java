package com.assignment.java8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxNumber {
public static void main(String args[]) {
		
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a Number  ");
		int n=scanner.nextInt();
		int number[]= new int[n];
		System.out.println("Enter "+ n +" numbers");
	    for(int i=0;i<n;i++)
	    {
	        number[i]=scanner.nextInt();
	    }
	
		int max = Arrays.stream(number)
                        .max()
                        .getAsInt();
		 System.out.println("Max element is " + max);
	}

}


