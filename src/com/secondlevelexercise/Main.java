package com.secondlevelexercise;

public class Main {

	public static void main(String[] args) {//�����߳���������
		MyThread th1=new MyThread();
		MyThread th2=new MyThread();
		th1.start();
		th2.start();

	}

}
