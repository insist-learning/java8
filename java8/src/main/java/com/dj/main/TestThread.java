package com.dj.main;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class TestThread {


	public static void main(String[] args) throws Exception{
		ConcurrentHashMap<String, Boolean> map = new ConcurrentHashMap<String, Boolean>(1);

		// 吊转小车1
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (this) {
					try {
						Thread.currentThread().wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("执行线程2");

			}
		});
		// 变轨小车
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("执行线程1");
				Thread.currentThread().notify();
//				while (true) {
//					System.out.println("执行线程1");
//					map.put("action", true);
//					try {
//						Thread.currentThread().sleep(650);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
			}

		});

		thread.start();
		thread2.start();

	}

}
