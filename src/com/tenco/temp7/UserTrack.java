package com.tenco.temp7;

public class UserTrack {

	private String name;

	public void userTrack(String name) {
		
		Bank bank = new Bank();
		Bank.userInfo[1].GetName();
		UserInfo userInfo = new UserInfo();
		this.name = userInfo.getName;
		boolean flag = this.name.equals(name); // 방어적 코드
		if (flag == true) {
			System.out.println("이름 : " + userInfo.getName);
			System.out.println("계좌 번호 : " + userInfo.getId);
			System.out.println("잔액 : " + userInfo.getMoney);
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}
}
