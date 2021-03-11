package com.cg.cla.ui;

import java.util.Arrays;

public class Exercise3 {
	
	static int [] getSorted(int [] array) {
		for(int i=0;i<array.length;i++) {
			String rev="",integerString=String.valueOf(array[i]);
			for(int j=0;j<integerString.length();j++) {
				rev+=integerString.charAt(j);
			}
			array[i]=Integer.parseInt(rev);
		}
		Arrays.sort(array);
		return array;
	}

	public static void main(String[] args) {
		int [] array= {4,5,89,64,123};
		int [] sortedArray=getSorted(array);
		for(int val:sortedArray) {
			System.out.println(val);
		}
	}
}
