package Animal;

public class Bear extends Animal{

	public Bear() {
		super();
		}

	public Bear(String name, double weight, int age) {
		super(name, weight, age);
	}

	@Override
	protected void move() {
		System.out.println("Climbining up a tree");
		
	}

	@Override
	protected void makeNoise() {
		System.out.println("Graaaaaaaaughwww");
		
	}

	@Override
	public String toString() {
		return "Bear [getName()=" + getName() + ", getWeight()=" + getWeight() + ", getAge()=" + getAge()
				+ "]";
	}

	
	
	

}
