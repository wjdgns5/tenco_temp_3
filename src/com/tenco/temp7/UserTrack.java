package com.tenco.temp7;

import java.util.Set;

public class UserTrack {

	private String name;
	private String userId;
	private int balance;
	
	public void userTrack(String name) { 
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
