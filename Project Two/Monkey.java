import java.util.Scanner;

public class Monkey extends RescueAnimal {

	// Instance Variables
	Scanner scnr = new Scanner(System.in);
	private char userin;
	public float tailLength;
	public float height;
	public float bodyLength;
	public String species;
	public float measureTorso;
	public float measureSkull;
	public float measureNeck;
	
	
	// default constructor
	
	public Monkey () {
		super();
		this.tailLength = 0;
		this.height = 0;
		this.bodyLength = 0;
		this.species = "None";
		this.measureTorso = 0;
		this.measureSkull = 0;
		this.measureNeck = 0;
	}
	
	// alternative constructor
	
	public Monkey (float tailLength, float height, float bodyLength, String species, float measureTorso, float measureSkull, float measureNeck) {
		super();
		this.tailLength = tailLength;
		this.height = height;
		this.bodyLength = bodyLength;
		this.species = species;
		this.measureTorso = measureTorso;
		this.measureSkull = measureSkull;
		this.measureNeck = measureNeck;
	}
	
	// Accessors below
	
	public float getTailLength () {
		return (this.tailLength);
	}
	
	public float getHeight () {
		return (this.height);
	}
	
	public float getBodyLength () {
		return (this.bodyLength);
	}
	
	public String getSpecies () {
		return (this.species);
	}
	
	public float getMeasureTorso () {
		return (this.measureTorso);
	}
	
	public float getMeasureSkull () {
		return (this.measureSkull);
	}
	
	public float getMeasureNeck () {
		return (this.measureNeck);
	}
	
	
	// Mutators below
	
	public void setTailLength (float tailLength) {
		this.tailLength = tailLength;
	}
	
	public void setHeight (float height) {
		this.height = height;
	}
	
	public void setBodyLength (float bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	public void setSpecies (String species) {
		this.species = species;
	}
	
	public void setMeasureTorso (float measureTorso) {
		this.measureTorso = measureTorso;
	}
	
	public void setMeasureSkull (float measureSkull) {
		this.measureSkull = measureSkull;
	}
	
	public void setMeasureNeck (float measureNeck) {
		this.measureNeck = measureNeck;
	}
	
	// update monkey information method
	public void updateMonkey() {
		// while update method runs continuously
		while (true) {
			// print available update options to user
			System.out.println("Please enter the corresponding number to what data you would like to update on the monkey");
			System.out.println("1: tail length");
			System.out.println("2: height");
			System.out.println("3: body length");
			System.out.println("4: species");
			System.out.println("5: torso measurement");
			System.out.println("6: skull measurement");
			System.out.println("7: neck measurement");
			System.out.println("q or Q: exits update method");
			
			// get user input for selection
			userin = scnr.next().charAt(0);
			
			// check user input with matching selection, tail length
			if (userin == '1') {
				System.out.print("Please enter the new tail length for monkey: ");
				// updates tail length using mutator
				setTailLength(scnr.nextFloat());
				System.out.println("Monkey tail length updated: " + this.tailLength + "\n");
			}
			// check user input with matching selection, height
			else if (userin == '2') {
				System.out.print("Please enter the new height for monkey: ");
				// updates height using mutator
				setHeight(scnr.nextFloat());
				System.out.println("Monkey height updated: " + this.height + "\n");
			}
			// check user input with matching selection, body length
			else if (userin == '3') {
				System.out.print("Please enter the new body length for monkey: ");
				// updates body length using mutator
				setBodyLength(scnr.nextFloat());
				System.out.println("Monkey body length updated: " + this.bodyLength + "\n");
			}
			// check user input with matching selection, species
			else if (userin == '4') {
				scnr.nextLine();
				System.out.print("Please enter the new species for monkey: ");
				// updates species using mutator
				setSpecies(scnr.nextLine());
				System.out.println();
				System.out.println("Monkey species updated: " + this.species + "\n");
			}
			// check user input with matching selection, torso measurement
			else if (userin == '5') {
				System.out.print("Please enter the new torso measurement for monkey: ");
				// updates torso measurement using mutator
				setMeasureTorso(scnr.nextFloat());
				System.out.println("Monkey torso measurement updated: " + this.measureTorso + "\n");
			}
			// check user input with matching selection, skull measurement
			else if (userin == '6') {
				System.out.print("Please enter the new skull measurement for monkey: ");
				// updates skull measurement using mutator
				setMeasureSkull(scnr.nextFloat());
				System.out.println("Monkey skull measurement updated: " + this.measureSkull + "\n");
			}
			// check user input with matching selection, neck measurement
			else if (userin == '7') {
				System.out.print("Please enter the new neck measurement for monkey: ");
				// updates neck measurement using mutator
				setMeasureNeck(scnr.nextFloat());
				System.out.println("Monkey neck measurement updated: " + this.measureNeck + "\n");
			}
			// check user input with matching selection, q or Q quits method/while loop
			else if (userin == 'q' || userin == 'Q') {
				System.out.print("No longer updating monkey");
				break;
			}
			// user input did not match any selections, print error
			else {
				System.out.print("ERROR: Please enter a valid number[1 - 7] for your monkey update choice");
			}
		}
	}
	
}
