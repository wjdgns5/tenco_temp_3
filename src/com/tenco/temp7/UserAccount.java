package com.tenco.temp7;

public class UserAccount {

	private String name; // 유저 이름
	private int balance; // 잔액

	// 입금
	public void deposit(int money) {
		balance = balance + money;
	}

	// 출금 
	public int withdraw(int money) {
		// 방어적 코드 작성
		if (balance < money) {
			System.out.println("잘못된 요청입니다!");
			return 0;
		}
		balance = balance - money;
		return money;
	}
	// 유저의 총 잔액 출력.
	public void showInfo() {
		System.out.println( name +"님의 현재 잔액은 :" + this.balance + "입니다.");
	}

}
