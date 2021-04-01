package Exercise2;

public class Main {

	public static void main(String[] args) {
		
		ClassAnimal Eagle = new ClassAnimal();
		
		System.out.println("*** Bird States***");
		System.out.println("Animal: Bird" + "\nType: " + Eagle.type[0] + "\nColour: " + Eagle.colour[0] + "\nSize: " + Eagle.size[0]);
		System.out.println();
		
		System.out.println("+++ Bird Behavior+++");
		Eagle.printFly();
		Eagle.printEat();
		Eagle.printSleep();
		Eagle.printLayEgg();
		System.out.println();
		
		ClassAnimal Persian = new ClassAnimal();
		
		System.out.println("***Cat States***");
		System.out.println("Animal: Cat" + "\nBreed: " + Persian.breed[1] + "\nColour: " + Persian.colour[3] + "\nSize: " + Persian.size[1]);
		System.out.println();
		
		System.out.println("+++Cat Behavior+++");
		Persian.printEat();
		Persian.printJump();
		Persian.printRun();
		Persian.printScratch();
		Persian.printSleep();
		
	}

}
