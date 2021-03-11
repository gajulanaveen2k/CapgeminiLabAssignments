package com.cg.cla.ui;

import com.cg.cla.threads.TimerThread;


public class Exercise2 {

	public static void main(String[] args) {
		TimerThread timer=new TimerThread();
		Thread t1=new Thread(timer);
		t1.start();
		
		
	}

}
