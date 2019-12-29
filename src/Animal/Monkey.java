package Animal;

public class Monkey extends Animal{

	public Monkey() {
		super();
	}

	public Monkey(String name, double weight, int age) {
		super(name, weight, age);
	}
	

	@Override
	protected void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void makeNoise() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Monkey [getName()=" + getName() + ", getWeight()=" + getWeight() + ", getAge()=" + getAge()
				+ "]";
	}
	
	

}
