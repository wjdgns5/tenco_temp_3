package basic.exercise.toy;

public class Bear extends Product{
	static int count;
	public Bear(String name) {
		super(name);
		
		count++;
	}
	
}
