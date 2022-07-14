package com.assignment.java8;
import java.util.Arrays; 
public class Simple {
	   public static void main(String[] args) {   
	        int[] arr = {5,8,1,0,6,9,50,-3};   

	        for (int i : arr) { 
	            System.out.print(i+" "); 
	        }   
	        Arrays.parallelSort(arr,0,3); 
	        for (int i : arr) { 
	            System.out.print(i+" "); 

	        } 

	   }
}
