package Animal;

public class Snake extends Animal{

	public Snake() {
		super();
		
	}

	public Snake(String name, double weight, int age) {
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
		return "Snake [getName()=" + getName() + ", getWeight()=" + getWeight() + ", getAge()=" + getAge()
				+ "]";
	}
	
	

}
