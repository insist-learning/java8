package com.dj.thinkingInJava;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TestStack {
	public static void main(String[] args) {
		/**
		 * stack �Ƚ����
		 * push():�����ͷ������ջ����ͷ�����룩
		 * peek():ȡͷ��
		 * pop():��ͷ���Ƴ������ߣ���ͷ����ȥ��
		 */
//		Stack<String> stack = new Stack<String>();
//		for (String s: "My dogs has files".split(" "))
//			stack.push(s);
//		while (!stack.empty()) 
//			System.out.println(stack.pop());
		
		
		/**
		 * Set ��õķ�����contains,containsAll
		 * Random(47)��47 �ǲ����������һ�����ӣ����������ʱ��Ҫһ�����ӣ����û��˵����Ĭ��ȡϵͳ�ĵ�ǰʱ��
		 * SortedSet ��TreeSet ��һ��ʵ�֣����ԶԽ����������
		 */
//		SortedSet<Integer> intset = new TreeSet<Integer>();
//		Random rand = new Random(47);
//		Set<Integer> intset = new HashSet<Integer>();
		
//		for (int i = 0; i < 100000; i++) {
//			intset.add(rand.nextInt(30));
//		}
//		System.out.println(intset);
		
		Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		Collections.addAll(words, "C B A a".split(" "));
		System.out.println(words);
		
	}
}
