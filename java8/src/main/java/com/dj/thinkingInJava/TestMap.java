package com.dj.thinkingInJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TestMap {
	/*��̬�����������ļ��ض�ִ�У�����ִֻ��һ��*/
	static {
		
	}
	public static void main(String[] args) {
		// �� map ��ͳ�� key ���ֵĴ���
		/**
		 * map.values():���� values �ļ���
		 */
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		Random rd = new Random();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < 10000; i++) {
			int r = rd.nextInt(20);
			Integer count = map.get(r);
			map.put(r, count==null?1:count+1);
		}
		System.out.println(map);
		System.out.println(map.values());
		fun1();
	}
	private static void fun1() {
		System.out.println(1);
		fun2(null);
	}
	private static void fun2(String str) {
		System.out.println(2);
		int i = 1;
		System.out.println(i);
	}
}
