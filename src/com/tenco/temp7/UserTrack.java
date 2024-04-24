package com.tenco.temp7;

import java.util.Arrays;
import java.util.Iterator;

public class UserTrack {

	private String name;

<<<<<<< HEAD
	public void userTrack(String name) {
		
		Bank bank = new Bank();
		Bank.userInfo[1].GetName();
=======
	public void userTrack(int i) {
		Bank bank = new Bank();
		String name;
		name = Bank.userInfo[i].GetName;
		
		
>>>>>>> branch 'main' of https://github.com/wjdgns5/tenco_temp_3.git
		UserInfo userInfo = new UserInfo();
		this.name = userInfo.getName;
		boolean flag = this.name.equals(name); // 방어적 코드
		if (flag == true) {
			System.out.println("이름 : " + userInfo[i].GetName);
			System.out.println("계좌 번호 : " + userInfo.GetId);
			UserAccount.showInfo();
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}
}
