package com.tenco.temp7;

import java.util.Scanner;

public class Bank {

	static Scanner sc = new Scanner(System.in);
	static UserInfo[] userInfo = new UserInfo[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		for (int i = 0; i < 10; i++) {
			
			userInfo[i] = new UserInfo(i);
		}
		
		choice1();// 돈을 쓸지 저금을 할지 선택
		
		
		 
	}
	
	
	static void choice1(){
		boolean flag = true;
		while(flag)
		System.out.println("1. 소비 2. 저금 | 선택 ㄱ ㄱ");
		sc.nextInt();
		
	}

}
