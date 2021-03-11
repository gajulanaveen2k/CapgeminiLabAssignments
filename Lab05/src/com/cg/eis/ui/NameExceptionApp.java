package com.cg.eis.ui;

import java.util.Scanner;

import com.cg.eis.exception.NameException;

public class NameExceptionApp {

	public static void main(String[] args) throws NameException {
		try(Scanner scan=new Scanner(System.in)){
			
			String firstName="";
			String lastName="";
			
			if((firstName.isEmpty() && lastName.isEmpty())) {
				throw new NameException("Full Name is not valid, It should be not blank");
			}else {
				System.out.println("Full Name is Valid "+firstName+" "+lastName);
			}
		}catch(NameException exp) {
			System.out.println(exp.getMessage());
		}

	}

}
