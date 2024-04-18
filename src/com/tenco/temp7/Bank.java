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

	public static void main(String[] args) {

		// user와 유저account 객체를 10개씩 생성후 배열로 저장
		for (int i = 0; i < 10; i++) {
			userInfo[i] = new UserInfo(i);
			userA[i] = new UserAccount(i);
		}

		userChoice();

		// 물품 종류 및 가액은 하나로 통일 귀찮.... 3500원으로 ㄱㄱ
		// 다른 유저 선택기능 4번으로 만들어야 하는데 길어질거같다... 일단은 유저 한번 선택하면 계속..

		do {
			System.out.println();
			System.out.println(userA[CHOOSED_PERSON].getName() + "의 행동을 선택해주세요.");
			System.out.println("1.물품 구매 | 2. 현금 입금 | 3.계좌 출금");
			CHOOSED_MENU = sc.nextInt();
			if (CHOOSED_MENU < 1 || CHOOSED_MENU > 3) {
				System.out.println("잘못된 범위를 선택 했습니다. 다시 선택해주세요.");
			} else if (CHOOSED_MENU == SPEND_MONEY) {

				userA[CHOOSED_PERSON].SpendCash(3500);
				userA[CHOOSED_PERSON].showCash();

			} else if (CHOOSED_MENU == DEPOSIT_MONEY) {
				userA[CHOOSED_PERSON].showCash();
				userA[CHOOSED_PERSON].deposit(setvalue());

			} else if (CHOOSED_MENU == WIDTHDRAW_MONEY) {
				userA[CHOOSED_PERSON].showBalance();
				userA[CHOOSED_PERSON].withdraw();
			}

		} while (WHILE_TRACKING);

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
