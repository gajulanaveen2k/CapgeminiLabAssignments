package com.cg.cla.ui;

import java.util.Arrays;
//import java.util.Scanner;

public class Exercise1 {
	
	static int getSecondSmallest(int [] array) {
		Arrays.sort(array);
		int secondSmallest=array[1];
		return secondSmallest;
	}

	public static void main(String[] args) {
		int [] array= {1,52,41,12,89,02,56,99};
		int secondSmallest=getSecondSmallest(array);
		System.out.println("Second Smallest Element in array is "+secondSmallest);
	}

}
