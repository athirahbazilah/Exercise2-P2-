package Exercise2;

public class Main {

	public static void main(String[] args) {
		
		ClassBird a = new ClassBird();
		
		System.out.println("*** Bird States***");
		System.out.println(a.type);
		System.out.println(a.colour);
		System.out.println(a.size);
		
		System.out.println("+++ Bird Behavior+++");
		a.printFly();
		a.printEat();
		a.printSleep();
		a.printLayEggs();
		System.out.println();
		
		ClassCat c = new ClassCat();
		
		System.out.println("***Cat States***");
		System.out.println(c.breed);
		System.out.println(c.colour);
		System.out.println(c.size);
		
		System.out.println("+++Cat Behavior+++");
		c.printEat();
		c.printJump();
		c.printRun();
		c.printScratch();
		c.printSleep();
		
	}

}
