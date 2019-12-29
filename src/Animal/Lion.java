package Animal;

public class Lion extends Animal{

	public Lion() {
		super();
		
	}

	public Lion(String name, double weight, int age) {
		//super(name, weight, age);
		super.setName(name);
		super.setAge(age);
		super.setWeight(weight);
		
	}

	@Override
	protected void move() {
		System.out.println("Doing fuck all, all day long");
		
	}

	@Override
	protected void makeNoise() {
		System.out.println("Rwwwwwwwwaaaaaarw");
		
	}

	@Override
	public String toString() {
		return "Lion [getName()=" + getName() + ", getWeight()=" + getWeight() + ", getAge()=" + getAge()
				+ "]";
	}

	
	
	

}
