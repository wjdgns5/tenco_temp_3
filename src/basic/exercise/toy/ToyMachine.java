package basic.exercise.toy;

import java.util.Random;

//클래스 - 인형 뽑기
//상품들이 존재가능
//사자인형, 곰인형, 에어팟
//요구조건 
//배열활용
public class ToyMachine {

	public static void main(String[] args) {

		Product[] product = new Product[10];
		User[] user = new User[10];

		for (int i = 0; i < user.length; i++) {
			user[i] = new User("사람" + i);
		}
		
		product[0] = new Lion("사자1");
		product[1] = new Bear("Bear1");
		product[2] = new Lion("사자2");
		product[3] = new Airpod("에어팟1");
		product[4] = new Lion("사자3");
		product[5] = new Bear("Bear2");
		product[6] = new Lion("사자4");
		product[7] = new Airpod("에어팟2");
		product[8] = new Bear("Bear3");
		product[9] = new Lion("사자5");

		for (int j = 0; j < 10; j++) {
			Random pdt = new Random();
			int productNum = pdt.nextInt(10);
			
			if (product[productNum] != null) {
				user[j].susses(product[productNum]);
				
				product[productNum] = null;

			} else {
				user[j].fail();
			}
			System.out.println();
		}
		

	}

}
