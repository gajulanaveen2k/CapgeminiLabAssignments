package com.cg.cla.ui;

import com.cg.cla.model.Account;
import com.cg.cla.model.CurrentAccount;
import com.cg.cla.model.Person;
import com.cg.cla.model.SavingsAccount;

public class Exercise1 {

	public static void main(String[] args) {
		Person smith=new Person("smith",20);
		Account smithAccount=new Account(3668987292L,2000.0,smith);
		
		Person kathy=new Person("Kathy",22);
		Account kathyAccount=new Account(3668987301L,3000.0,kathy);
		
		smithAccount.deposit(2000.0);
		if(!kathyAccount.withdraw(2000.0)) {
			System.out.println("Balance is low to withdraw");
		}else {
			System.out.println("Balance in kathy Account : "+kathyAccount.getBalance());
		}
		System.out.println("Balance in smith Account : "+smithAccount.getBalance());
		System.out.println("-----------------------------------------");
		
		Account acc1=new SavingsAccount();
		acc1.setAccountHolder(smith);
		acc1.setAccNum(32568495671L);
		acc1.setBalance(5000.0);
		if(acc1.withdraw(4200.0)) {
			System.out.println("Withdraw Succesfull "+"Balance : "+acc1.getBalance());
		}else {
			System.out.println("Withdraw Fail");
		}
		
		System.out.println("-----------------------------------------");
		
		Account acc2=new CurrentAccount();
		acc2.setAccountHolder(kathy);
		acc2.setAccNum(32568495420L);
		acc2.setBalance(5000.0);
		for(Double i=2000.0;i<10000.0;i+=1000.0) {
			if(acc2.withdraw(i)) {
				System.out.println("Withdraw Succesfull "+"overdraft limit pending : "+ acc2.getOverdraft());
			}else {
				System.out.println("Withdraw Fail due to overdraft limit reached");
			}
		}
		
		System.out.println("-----------------------------------------");
		
		Person naveen=new Person("Naveen",23);
		Account acc3=new CurrentAccount();
		acc3.setAccountHolder(naveen);
		acc3.setAccNum(325684912345L);
		acc3.setBalance(60000.0);
		for(Double i=2000.0;i<10000.0;i+=1000.0) {
			if(acc3.withdraw(i)) {
				acc3.deposit(1000.0);
				System.out.println("Withdraw Succesfull "+"overdraft limit pending : "+ acc3.getOverdraft());
			}else {
				System.out.println("Withdraw Fail due to overdraft limit reached");
			}
		}
	}

}
