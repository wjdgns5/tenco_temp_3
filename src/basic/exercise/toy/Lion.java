package basic.exercise.toy;

public class Lion extends Product{

	static int count;
	
	public Lion(String name) {
		super(name);
		
		count++;
	}
}
