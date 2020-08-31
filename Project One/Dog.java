// Dog class inherited from Pet class
public class Dog extends Pet {
	// instance variables declared
	public int dogSpaceNbr;
	public double dogWeight;
	public boolean grooming;
	
	// Dog class constructor
	public Dog(String newPetType, String newPetName, int newPetAge, int newDaysStay, double newAmountDue, int dogSpaceNbr, double dogWeight, boolean grooming) {
		super(newPetType, newPetName, newPetAge, newDaysStay, newAmountDue);
		this.dogSpaceNbr = dogSpaceNbr;
		this.dogWeight = dogWeight;
		this.grooming = grooming;
	}
	
	// methods for Dog class, non-static -> related to a specific dog
	// set dog double-value weight method
	public void setDogWeight (double newDogWeight) {
		// sets specific dog object weight value
		this.dogWeight = newDogWeight;
	}
	
	// set dog grooming boolean value method
	public void setGrooming (boolean newGrooming) {
		// sets specific dog object grooming value
		this.grooming = newGrooming;
	}
	
	// get dog double-value weight method
	public double getDogWeight () {
		// returns specific dog object weight value
		return (this.dogWeight);
	}
	
	// get dog grooming boolean value method
	public boolean getGrooming () {
		// returns specific dog object grooming value
		return (this.grooming);
	}
}
