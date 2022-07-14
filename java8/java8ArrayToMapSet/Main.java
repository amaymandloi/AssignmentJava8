package com.assignment.java8ArrayToMapSet;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args)
	{

		// create a list
		List<Employee> lt = new ArrayList<>();

		// add the member of list
		lt.add(new Employee(1, "amay"));
		lt.add(new Employee(2, "amit"));
		lt.add(new Employee(3, "manish"));
		lt.add(new Employee(4, "Anshul"));
		lt.add(new Employee(5, "Gurvinder"));
		lt.add(new Employee(6, "Shruti"));
		lt.add(new Employee(7, "Dharmesh"));
		lt.add(new Employee(8, "ramesh"));
		lt.add(new Employee(9, "jamunda"));
		lt.add(new Employee(10, "Suresh"));
		lt.add(new Employee(10, "rajesh"));


		LinkedHashMap<Integer, String>
			map = lt.stream()
					.collect(
						Collectors
							.toMap(
									Employee::getId,
									Employee::getName,
								(x, y)
									-> x + ", " + y,
								LinkedHashMap::new));

		// print map
		map.forEach(
			(x, y) -> System.out.println(x + "=" + y));
	}
}
