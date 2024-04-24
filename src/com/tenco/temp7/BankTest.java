package com.tenco.temp7;

import java.util.Iterator;

public class BankTest {

	public static void main(String[] args) {


		UserAccount[] accounts = new UserAccount[10];
		UserAccount choiceUserAccout = null; 
			
		for (int j = 0; j < accounts.length; j++) {
			accounts[j] = new UserAccount(j);
		}

		// 테스트 값 --> : 4
		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i].getId() == 3) {
				choiceUserAccout = accounts[i];
				
			}
		}
		
		System.out.println(choiceUserAccout.getName());
		

	}

}
