package com.itwill.shop.user;

public class UserServiceTestMain {

	public static void main(String[] args) throws Exception{
		UserService userService=new UserService();
		System.out.println(userService.memberRegist(new User("ddd","ddd", "씨씨씨", "c@c.co.kr")));

	}

}
