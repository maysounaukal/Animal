package Animal;

public class App {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();// de object zoo om de constructor van de klasse Zoo aan te roepen
	
		Animal bear1 = new Bear();
		Animal bear2 = new Bear();
		Animal giraffe1 = new Giraffe();
		Animal giraffe2 = new Giraffe();
		Animal lion1 = new Lion();
		Animal lion2 = new Lion();
		Animal monkey1 = new Monkey();
		Animal monkey2 = new Monkey();
		Monkey monkey3 = new Monkey();
		
		monkey3.setAge(2);
		
		bear1.setName("Bear");
		bear1.setAge(23);
		bear1.setWeight(45);
		
		giraffe1.setName("Giraffe");
		giraffe1.setAge(12);
		giraffe1.setWeight(34);
		
		lion1.setName("Lion");
		lion1.setAge(89);
		lion1.setWeight(90);
		
		zoo.addAnimal(giraffe1);
		zoo.addAnimal(lion1);
		zoo.addAnimal(bear1);
		
		
		zoo.printZoo();
		
		

	}

}
