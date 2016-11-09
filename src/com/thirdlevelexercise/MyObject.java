package com.thirdlevelexercise;

public class MyObject {
	private static MyObject myobj=new MyObject();
	private int value=100;
	
	public static MyObject getInstance(){
		return myobj;
	}
	
	public  synchronized void add(){
		value++;
		System.out.println("value++="+value);
	}
	
	public synchronized void delet(){
		System.out.println("ThreadName="+Thread.currentThread()+"��ǰvalue="+value);
		value--;
		System.out.println("ThreadName="+Thread.currentThread()+"value--="+value);
	}
	
	public synchronized void watch(){
		System.out.println("ThreadName="+Thread.currentThread()+"watcher��ǰvalue="+value);
	}

}
