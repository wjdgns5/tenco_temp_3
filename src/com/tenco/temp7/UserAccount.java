package com.tenco.temp7;

import java.util.Scanner;

public class UserAccount {
	// 유저 어카운트 파일이 뱅크 어카운트 파일과 동일해져서 유저의 계좌 실제 가지고 있는 금액으로 생각 해주시면 됩니다,
	// userAccount --> userWallet으로 생각 하면 편합니다.

	private int id;
	private String name; // 유저 이름
	private int balance; // 잔액
	private int cash; // 유저 현금
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//Scanner sc = new Scanner(System.in);
	BankAccount bankAccount = new BankAccount();
	Bank bank = new Bank();

	public UserAccount(int id) {
		this.id = id; // 각 객체의 벼열 포지션을 나타냅니다.
		name = "유저" + id; // 이름은 유저+ 배열 포지션
		balance = 10_000;// 모든 유저는 프로 그램 시작시 10_000이라는 금액을 계좌에 가지고 시작합니다.
		cash = 0;

	}

	public void SpendCash(int v) {// 유저가 현금을 사용하여 상품을 구매할떄
		if ((cash + balance) - v < 0) {
			System.out.println("파산만이 답입니다.");
			Bank.WHILE_TRACKING = false;
		} else if (cash - v < 0) {
			System.out.println("현금이 부족합니다. 계좌에서 출금 해주세요");
		} else {
			System.out.println("성공적으로 구매 완료~");
			cash -= v;
		}

	}

	// 입금
	public void deposit(int money) { // 음수값에 대한 방어적 코드 필요함
		cash -= money; // 맨 상단에 안내한것처럼 지갑에서 현금을 입금 또는 사용 했다고 생각하면 편합니다. 여기서는 입금
		balance += money; // 유저 계좌에 입금 금액만큼 추가하
		bankAccount.setBalance(money);// bankAccount의 세터를 통해 main 으로부터 전달받은 금액을 bankaccount로전달
	}

	// 출금
	public void withdraw() {
		// 방어적 코드 작성/main 에서 방어적 코드 작성을 할려고 했으나 이미 스캐너를 공용으로 사용중이어서 해당 함수에서 스캐너 사용
		boolean flag = true;
		do {
			//int money = bank.sc.nextInt(); 이 두개 왜 안되는지 모르겠음......... main scanner public static 으로 .. 해도 안
			System.out.println("얼마를 출금 할까요?");
			int money = bank.sc.nextInt();
			if (money > balance) {
				System.out.println("잘못된 요청입니다!");
			} else {
				bankAccount.setBalance(-money);
				balance -= money;
				cash += money;
				System.out.println("성공적으로 나의 계좌에서 " + money + "원 만큼 출금했습니다.");
				System.out.println(name + "의 현재 보유 현금 : " + cash + "원");
				System.out.println(name + "의 현재 계좌 잔액 : " + balance + "원");
				flag = false;
			}
		} while (flag);
	

	}

	// 유저의 총 잔액 출력.
	public void showBalance() {
		System.out.println(name + "님의 현재 계좌 잔액은 :" + this.balance + "입니다.");
	}
	public void showCash() {
		System.out.println(name + "님의 현재 보유 현금은 :" + this.cash + "입니다.");
	}

	public String getName() {
		return this.name;
	}
	

}
