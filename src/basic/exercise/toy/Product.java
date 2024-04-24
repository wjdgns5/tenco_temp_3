package basic.exercise.toy;

public class Product {
	String name;
	
	public Product(String name) {
		this.name = name;
		}
	
	public void susses(Product p) {
		if(p instanceof Lion) {
			System.out.println(this.name+"이 "+p.name+"을 뽑았습니다.");
			((Lion) p).count--;
			System.out.println("사자 상품" +((Lion) p).count+"개 남음");
		}else if(p instanceof Bear) {
			System.out.println(this.name+"이 "+p.name+"을 뽑았습니다.");
			((Bear) p).count--;
			System.out.println("곰 상품" +((Bear) p).count+"개 남음");
		}else if(p instanceof Airpod) {
			System.out.println(this.name+"이 "+p.name+"을 뽑았습니다.");
			((Airpod) p).count--;
			System.out.println("에어팟 상품" +((Airpod) p).count+"개 남음");
		}
	}
	public void fail() {
		System.out.println(this.name+"이 상품을 뽑는데 실패 했습니다.");
	}
}
