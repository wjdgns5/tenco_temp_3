package com.tenco.temp7;

public class BankAccount {

	private String name; //은행이름
	private int balance; //잔액
	
	public BankAccount() {
		name ="농협";
		
	}

	// 입금
	public void deposit(int money) {
		balance = balance + money;
	}
	
	// 출금
	public int withdraw(int money) {
		// 방어적 코드 
		if(balance < money) {
			System.out.println("잘못된 요청입니다.");
			return 0; 
		}
		balance = balance - money;
		return money;
	}

	
	//잔액출력
	public void showInfo() {
		System.out.println("현재 잔액은 : " + this.balance + "입니다.");
	} 
	
	
	
}
