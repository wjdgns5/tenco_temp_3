package com.tenco.temp7;

import java.util.Scanner;

public class Bank {

	static Scanner sc = new Scanner(System.in);
	static UserInfo[] userInfo = new UserInfo[10];
	static UserAccount[] userA = new UserAccount[10];
	static BankAccount bankA = new BankAccount();
	static int personNum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < 10; i++) {//user와 유저account 객체 10개씩 생성후 배열로 저
 
			userInfo[i] = new UserInfo(i);
			userA[i] = new UserAccount(i);
		}
		
		while (bankA.getBalance() != 0) {
			personNum = choiceWho();
		choice1();// 돈을 쓸지 저금을 할지 선택
		}
		

	}

	static void choice1() {
		boolean flag = true;
		while (flag) {
			System.out.println("1. 소비 2. 저금 | 선택 ㄱ ㄱ");
			int a = sc.nextInt();
			if (a == 1) {
				flag = false;
				// setvalue();
				int x =setvalue();
				userA[personNum].withdraw(x);
				bankA.withdraw(x);

			} else if (a == 2) {
				flag = false;
				int x = setvalue();
				userA[personNum].deposit(setvalue());
				bankA.deposit(x);
			} else {
				System.out.println("잘못된 선택 다시 ㄱ ㄱ");
			}

		}
	}

	static int setvalue() {
		System.out.println("얼마??????????");
		return sc.nextInt();

	}

	static int choiceWho() {
		System.out.println("누구?????????? 0~9 사이 선택");
		return sc.nextInt();
	}

}
