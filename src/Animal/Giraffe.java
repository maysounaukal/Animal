package Animal;

public class Giraffe extends Animal{
private int neckLength;




public Giraffe() {
	super();
	
}

public Giraffe(String name, double weight, int age) {
	super(name, weight, age);
}

@Override
protected void move() {
	System.out.println("Pretty dang fast on those skinny legs");
	
}

@Override
protected void makeNoise() {
	
	System.out.println();
}

@Override
public String toString() {
	return "Giraffe [getName()=" + getName() + ", getWeight()=" + getWeight() + ", getAge()=" + getAge()
			+ "]";
}









}
