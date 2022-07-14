package com.assignment.java8;


	import java.util.Scanner;
	import java.util.Arrays;
	public class MaxLengthOfString {
		public static void main(String args[]) {
			
			String str;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a String  ");
    	String str1= scanner.next();
   	System.out.println(str1.lastIndexOf(""));
			
	}
	            	public static int getLength(String str)
	            	{
	            	    int i=0;
	            	    try{
	            	    
	            	    while(true)
	            	    {
	            	        str.charAt(i);
	            	        i++;
	            	    }
	            	    }
	            	    catch(IndexOutOfBoundsException e)
	            	    
	            	    {
	            	     return i;   
	            	    }
	            	}


	}
