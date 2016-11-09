package com.fourthlevelexercise;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {// 使用锁对象来避免线程冲突
		ExecutorService pool = Executors.newFixedThreadPool(1000);
		Thread watcher = new Thread(new Runnable() {
			@Override
			public void run() {
				long LastTime=System.currentTimeMillis();
				while(true){
					if(System.currentTimeMillis()-LastTime>1000){
						MyObject obj = MyObject.getInstance();
							synchronized (obj) {
								Date date=new Date();
								System.out.println("当前时间："+String.format("%tr",date));
								obj.watch();
								LastTime=System.currentTimeMillis();
							}
							try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
					}
				}
			}
		});
		watcher.setPriority(8);
		pool.execute(watcher);

		for (int k = 0; k <= 1000; k++) {
			
			Thread thread=new Thread(new Runnable() {

				@Override
				public void run() {
					MyObject obj = MyObject.getInstance();
					while (true) {
						synchronized (obj) {
							if (obj.getvalue() <= 0) {
								System.out.println("当前线程"
										+ Thread.currentThread() + "退出");
								break;
							}
							obj.delet();
						}
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			});
			pool.execute(thread);
		}

	}

}
