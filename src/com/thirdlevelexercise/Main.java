package com.thirdlevelexercise;
public class Main {

	public static void main(String[] args) {
        Thread th1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<=100;i++){
					MyObject obj=MyObject.getInstance();
					obj.delet();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
        Thread th2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<=100;i++){
					MyObject obj=MyObject.getInstance();
					obj.delet();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
        
        Thread th3=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<=100;i++){
					MyObject obj=MyObject.getInstance();
					obj.watch();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
        
		th1.start();
		th2.start();
		th3.start();

	}

}
