package com.cg.cla.ui;

import java.util.Scanner;

import com.cg.cla.model.Exercise6;

public class Exercise6App {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=Exercise6.calculateDifference(n);
		System.out.println("Difference of sum of square and squares of sum : "+sum);
		scan.close();
	}

}
