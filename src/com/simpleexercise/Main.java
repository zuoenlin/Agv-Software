package com.simpleexercise;

public class Main {

	public static void main(String[] args) {//Ĭ��������߳�ִ��˳���ǲ�һ�µ�
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
