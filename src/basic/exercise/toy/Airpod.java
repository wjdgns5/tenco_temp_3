package basic.exercise.toy;

public class Airpod extends Product{
	static int count;
	public Airpod(String name) {
		super(name);
		
		count++;
	}
}
