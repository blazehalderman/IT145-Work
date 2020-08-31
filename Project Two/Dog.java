
import java.util.Scanner;

public class Dog extends RescueAnimal {

    // Instance variable
	Scanner scnr = new Scanner(System.in);
	private char userin;
    public String breed;

    // Constructor
    public Dog() {
    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        this.breed = dogBreed;
    }
    
    // update dog information method
    public void updateDog() {
    	// while update method runs continuously
    	while (true) {
    		// print available update options to user
			System.out.println("Please enter the corresponding number to what data you would like to update on the dog");
			System.out.println("1: breed");
			System.out.println("q or Q: exits update method");
			
			// get user input for selection
			userin = scnr.next().charAt(0);
			
			// check user input with matching selection, breed
			if (userin == '1') {
				scnr.nextLine();
				System.out.print("\nPlease enter the new breed for dog: ");
				// updates breed using mutator
				setBreed(scnr.nextLine());
				System.out.println("Dog breed updated: " + this.breed + "\n");
			}
			// check user input with matching selection, q or Q quits method/while loop
			else if (userin == 'q' || userin == 'Q') {
				System.out.println("No longer updating dog\n");
				break;
			}
			// user input did not match any selections, print error
			else {
				System.out.println("ERROR: Please enter a valid number[1] for your dog update choice");
			}
    	}
    }
}
