package com.dj.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.dj.bean.User;

public class Test {

	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setName("zhangsan");
		User user2 = new User();
		System.out.println(user2);
		user2.setName("zhangsan2");
		User user3 = new User();
		user3.setName("zhangsan3");
		list.add(user);
		list.add(user2);
		list.add(user3);
		List<String> collect = list.stream().map(User::getName).collect(Collectors.toList());
		fun1(list);
		System.out.println(1);
		fun2();
		fun2();
		fun2();
		fun2();
		fun2();
		fun2();
	}
	public static String fun1(List<User> list) {
		if (list.size() > 0) {
			return "list";
		}
		return "1"; 
	}
	public static String fun2() {
		return "2"; 
	}

}
