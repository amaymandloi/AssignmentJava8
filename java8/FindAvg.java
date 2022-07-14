package com.assignment.java8;

import java.util.Scanner;

public class FindAvg {
public static void main(String args[]) {
		
		int avgMarks;
		int totalMarks=0;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a Number  ");
		int n=scanner.nextInt();
		int number[]= new int[n];
		System.out.println("Enter "+ n +" numbers");
	    for(int i=0;i<n;i++)
	    {
	        number[i]=scanner.nextInt();
	    }
	
		for(int i=0;i<n;i++)
		{
		    
			totalMarks= totalMarks+ number[i];
			
		}
		avgMarks=totalMarks/n;
		System.out.print("average marks is"+"  "+avgMarks);
		
		
		
		
	}

}


