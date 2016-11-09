package com.simpleexercise;

public class Main {

	public static void main(String[] args) {//默认情况下线程执行顺序是不一致的
		Thread thread1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i=0;
				while(i<=100){
					System.out.println("ThreadName:"+Thread.currentThread()+";value="+i);
					i++;
				}
				
			}
		});
		
		Thread thread2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i=0;
				while(i<=100){
					System.out.println("ThreadName:"+Thread.currentThread()+";value="+i);
					i++;
				}
				
			}
		});
		
		thread1.start();
		thread2.start();

	}

}
