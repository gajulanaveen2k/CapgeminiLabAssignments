package com.cg.cla.ui;

import com.cg.cla.threads.CopyDataThread;

public class FileProgram {

	public static void main(String[] args) {
		CopyDataThread copy=new CopyDataThread("D:/venka/workclass/labBookAssignment/Lab8/source.txt","destination.txt");
		copy.start();
	}

}
