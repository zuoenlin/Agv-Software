package com.secondlevelexercise;

public class MyThread extends Thread {
	private static int value;
    
	@Override
	public void run() {
		super.run();
		while(value<=20){
			System.out.println("ThreadName:"+Thread.currentThread()+";value="+value);
			value++;
		}
	}
}
