package com.fourthlevelexercise;

public class MyObject {
	private static MyObject myobj=new MyObject();
	private int value=100;
	
	public static MyObject getInstance(){
		return myobj;
	}
	
	public   void add(){
		value++;
		System.out.println("value++="+value);
	}
	
	public  void delet(){
		System.out.println("ThreadName="+Thread.currentThread()+"当前value="+value);
		value--;
		System.out.println("ThreadName="+Thread.currentThread()+"剩余value--="+value);
	}
	
	public int getvalue(){
		return value;
	}
	
	public  void watch(){
		System.out.println("ThreadName="+Thread.currentThread()+"watcher当前value="+value);
	}

}
