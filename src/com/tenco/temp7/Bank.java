package com.tenco.temp7;

import java.util.Scanner;

public class Bank {

	static Scanner sc = new Scanner(System.in);
	static UserInfo[] userInfo = new UserInfo[10];
	static UserAccount[] userA = new UserAccount[10];
	static BankAccount bankA = new BankAccount();
	static int personNum;

	static int CHOOSED_PERSON = 0; // 0~9번 까지 총 10명중 1명을 선택가능
	static int CHOOSED_MENU = 0; // 1~3번 까지

	final static int SPEND_MONEY = 1;
	final static int DEPOSIT_MONEY = 2;
	final static int WIDTHDRAW_MONEY = 3;

	static boolean WHILE_TRACKING = true;

	
	
	

	public static UserAccount[] getUserA() {
		return userA;
	}

	public static void setUserA(UserAccount[] userA) {
		Bank.userA = userA;
	}



	static void userChoice() {

		do {
			System.out.println("1~10번 사이의 유저를 선택해주세요");
			CHOOSED_PERSON = sc.nextInt();
			if (CHOOSED_PERSON <= 0 || CHOOSED_PERSON > 10) {
				System.out.println("잘못된 범위를 선택 했습니다. 다시 선택해주세요.");
			} else {
				WHILE_TRACKING = false;
				CHOOSED_PERSON--;
			}
		} while (WHILE_TRACKING);

		WHILE_TRACKING = true;
	}

	static int setvalue() {
		System.out.println("얼마??????????");
		return sc.nextInt();

	}
}
