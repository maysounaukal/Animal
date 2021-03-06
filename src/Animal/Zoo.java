package Animal;

import java.util.Arrays;

public  class Zoo {


	Bear[] bears = new Bear[0]; 

	Giraffe[] giraffes = new Giraffe[0];

	Snake[] snakes = new Snake[0];

	Lion[] lions = new Lion[0];

	Monkey[] monkeys = new Monkey[0];



	public void addAnimal(Animal animal) {



		if (animal instanceof Bear) {

			addBear((Bear) animal);

		}

		if (animal instanceof Lion) {

			addLion((Lion) animal);

		}

		if (animal instanceof Monkey) {

			addMonkey((Monkey) animal);

		}

		if (animal instanceof Snake) {

			addSnake((Snake) animal);

		}

		if (animal instanceof Giraffe) {

			addGiraffe((Giraffe) animal);

		}



	}



	private void addSnake(Snake animal) {

		Snake[] temp = Arrays.copyOf(snakes, snakes.length +1);

		temp[snakes.length] = animal;

		snakes = temp;

		}



	private void addMonkey(Monkey animal) {

		Monkey[] temp = Arrays.copyOf(monkeys, monkeys.length +1);

		temp[monkeys.length] = animal;

		monkeys = temp;



	}



	private void addLion(Lion animal) {

		Lion[] temp =  Arrays.copyOf(lions, lions.length +1);

		temp[lions.length] = animal;

		lions = temp;



	}



	private void addGiraffe(Giraffe animal) {

		Giraffe[] temp =  Arrays.copyOf(giraffes, giraffes.length +1);

		temp[giraffes.length] = animal;

		giraffes = temp;



	}



	private void addBear(Bear animal) {

		Bear[] temp = Arrays.copyOf(bears, bears.length +1);

		temp[bears.length] = animal;

		bears = temp;

	}
	public void printZoo() {
		if(bears.length > 0) {
			
			for(int i = 0 ; i < bears.length ; i++) {
				System.out.println(bears[i]);
			}
		}
		else System.out.println("er is geen bears");
	
	if(giraffes.length > 0) {
		for(int i = 0; i < giraffes.length; i++) {
			System.out.println(giraffes[i].toString());
		}
	}
	
	else System.out.println("er is geen giraffes");
	if(lions.length > 0) {
		for(int i = 0; i < lions.length; i++) {
			System.out.println(lions[i].toString());
		}

	}
	else System.out.println("er is geen lios");
	if(monkeys.length > 0) {
		for(int i = 0; i < monkeys.length; i++) {
			System.out.println(monkeys.toString());
	}}
	else System.out.println("er is geen monkeys");
	if(snakes.length > 0) {
		for(int i = 0 ; i < snakes.length ; i++) {
			System.out.println(snakes.toString());
		}
	}
	else System.out.println("er is geen snakes");
}



	@Override
	public String toString() {
		return "Zoo [bears=" + Arrays.toString(bears) + ", giraffes=" + Arrays.toString(giraffes) + ", snakes="
				+ Arrays.toString(snakes) + ", lions=" + Arrays.toString(lions) + ", monkeys="
				+ Arrays.toString(monkeys) + "]";
	}
	
	
}