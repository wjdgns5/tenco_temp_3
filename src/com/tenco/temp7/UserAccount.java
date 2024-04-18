package com.tenco.temp7;

public class UserAccount {
	//유저 어카운트 파일이 뱅크 어카운트 파일과 동일해져서 유저의 계좌말고 실제 가지고 있는 금액으로 생각 해주시면 됩니다,
	//userAccount --> userWallet으로 생각 하면 편합니다.
	
	private int id;
	private String name; // 유저 이름
	private int balance; // 잔액
	
	public UserAccount(int id) {
		this.id = id; //각 객체의 벼열 포지션을 나타냅니다.
		name = "유저" +id; // 이름은 유저+ 배열 포지션 
		balance = 10_000; //모든 유저는 프로 그램 시작시 10_000이라는 금액을 가지고 시작합니다.
		

	}

	// 입금 
	public void deposit(int money) {
		balance -= money; //맨 상단에 안내한것처럼 지갑에서 현금을 입금 또는 사용 했다고 생각하면 편합니다. 여기서는 입금
		
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
