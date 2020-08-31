// Pet class
public class Pet {
	
	// instance variables for Pet objects
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpace = 30;
	private int catSpace = 12;
	private int daysStay;
	private double amountDue;
	
	// default constructor
	public Pet () {
		this.petType = "None";
		this.petName = "None";
		this.petAge= -1;
		this.daysStay = -1;
		this.amountDue = -1.00;
	}
	
	// parameterized constructor
	public Pet (String petType, String petName, int petAge, int daysStay, double amountDue) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
		this.daysStay = daysStay;
		this.amountDue = amountDue;
	}
	
	/* Setters
	 * no return type for methods since assigning directly to object
	 * takes argument of set type
	 */
	
	public void setPetType (String newPetType) {
		this.petType = newPetType;
	}
	
	public void setPetName (String newPetName) {
		this.petName = newPetName;
	}
	
	public void setPetAge (int newPetAge) {
		this.petAge = newPetAge;
	}
	
	public void setDogSpace (int newDogSpace) {
		this.dogSpace = newDogSpace;
	}
	
	public void setCatSpace (int newCatSpace) {
		this.catSpace = newCatSpace;
	}
	
	public void setDaysStay (int newDaysStay) {
		this.daysStay = newDaysStay;
	}
	
	public void setAmountDue (double newAmountDue) {
		this.amountDue = newAmountDue;
	}
	
	
	/* Getters
	 * the return type is the data type of the get method
	 * take no arguments and return attribute values of an object
	 */
	
	public String getPetType () {
		return (this.petType);
	}
	
	public String getPetName () {
		return (this.petName);
	}
	
	public int getPetAge () {
		return (this.petAge);
	}
	
	public int getDogSpace () {
		return (this.dogSpace);
	}
	
	public int getCatSpace () {
		return (this.catSpace);
	}
	
	public int getDaysStay () {
		return (this.daysStay);
	}
	
	public double getAmountDue () {
		return (this.amountDue);
	}
	
	// methods on Pet class object
	
	// checks a Pet into the PetBag system
	public void checkIn () {}
	
	// checks a Pet out of the PetBag system
	public void checkOut () {}
	
	// creates a new Pet object
	public void createPet () {}
	
	// updates an existing Pet object
	public void updatePet () {}
	
	// gets a Pet object
	public void getPet () {}

}
