package com.assignment.java8;

import java.util.ArrayList;
import java.util.List;

public class NumberSeries {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();

	int[] arr = { 1, 2, 3, 6, 7, 9, 10, 11, 12, 13, 14, 17, 18, 19, 20 };
	for (int i = 0; i < arr.length; i++) {
		int first = arr[i];
		int lastN = 0;
		for (int j = i; j < arr.length; j++) {
	
			int array = arr[j] + 1;

			if (arr.length == j + 1) {
				lastN = arr[j];
				i = j;
				break;
			} else {
				if (array == arr[j + 1]) {
				
					continue;
				} else {
					lastN = arr[j];
					i = j;
					break;
				}

			}

		}

		list.add(first + "-" + lastN);

	}
	System.out.println(list);

}

}
