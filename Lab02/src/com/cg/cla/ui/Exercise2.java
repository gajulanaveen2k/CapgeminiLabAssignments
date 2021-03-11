package com.cg.cla.ui;

import java.util.Arrays;

public class Exercise2 {
	
	static String [] sortString(String [] array) {
		Arrays.sort(array);
		return array;
	}
	public static void main(String[] args) {
		String [] array= {"naveen","bunny","sunny","Kumar"};
		String [] sortedArray=sortString(array);
		System.out.println("Sorted String Element in array is ");
		for(String val:sortedArray) {
			System.out.println(val);
		}

	}

}
