package labs;

public class AppleTester {
	public static void main(String[] args) {
		System.out.println("Welcome to the apple tester");
		
		//creates a default apple
		System.out.println("Creating a default apple");
		System.out.println("Printing the apple's default value");
		Apple Apple = new Apple();
		System.out.println(Apple.toString());;
		System.out.println("");
		
		//Creates another apple
		System.out.println("Creating another apple");
		System.out.println("Setting the new apple's values to the following, valid values:");
		System.out.println("Granny Smith 0.75 0.99");
		Apple Apple2 = new Apple("Granny Smith", 0.75, 0.99);
		System.out.println(Apple2.toString());
		System.out.println("");
		
		//Creates a third apple
		System.out.println("Creating another apple");
		System.out.println("Setting the new apple's values to the following, invalid values:");
		System.out.println("iPad 2.5 -200");
		System.out.println("Printing the newest apple's values which should not have changed from the default values");
		Apple Apple3 = new Apple("iPad", 2.5, -200);	
		System.out.println(Apple3.toString());
		System.out.println("");
		
		//Checks if the values are equal.
		System.out.println("Checking if the first and last apple have the same values");
		System.out.println(Apple.equals(Apple3));
	}
}
