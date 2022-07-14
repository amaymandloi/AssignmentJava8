package com.assignment.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeStream {
	public static void main(String[] args) {
		List < String > employees = new ArrayList < String > ();
  try(Scanner sc= new Scanner(System.in)){
	  System.out.println("enter the name of employees");
	  for(int i=0;i<5;i++)
	  {
		  employees.add(sc.next());
	  }
  }
        // sort employee by salary in ascending order
        
      

        
        List < String > employeesSortedList2 = employees.stream()
            .sorted().distinct().collect(Collectors.toList()); //ascending order
        System.out.println("the name of distint employeesamay");
        System.out.println(employeesSortedList2);
    }	
}


