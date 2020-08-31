import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Driver {

    // instance variables (add more as needed)
	public static Scanner scnr = new Scanner(System.in);
    private static ArrayList<Ship> shipList = new ArrayList();
    private static ArrayList<Cruise> cruiseList = new ArrayList();
    private static ArrayList<Passenger> passengerList = new ArrayList();


    public static void main(String[] args) {

        initializeShipList();       // initial ships
        initializeCruiseList();     // initial cruises
        initializePassengerList();  // initial passengers
        // add loop and code here that accepts and validates user input
        // and takes the appropriate action. include appropriate
        // user feedback and redisplay the menu as needed
        displayMenu();
        String userInput = scnr.next().toUpperCase();
        scnr.nextLine();
        
        while (!userInput.equals("X")) {
        	try {
        		// switch statement is easier since it catches exceptions better
        		switch(userInput) {
        			case "1":
        				addShip();
        				break;
        			case "2":
        				editShip();
        				break;
        			case "3":
        				if (shipAvailability()) {
        					addCruise();
        				}
        				else {
        					System.out.println("There are no available ships to add a cruise.");
        				}
        				break;
        			case "4":
        				editCruise();
        				break;
        			case "5":
        				addPassenger();
        				break;
        			case "6":
        				editPassenger();
        				break;
        			case "A":
        				printShipList("name");
        				break;
        			case "B":
        				printShipList("active");
        				break;
        			case "C":
        				printShipList("full");
        				break;
        			case "D":
        				printCruiseList("list");
        				break;
        			case "E":
        				printCruiseList("details");
        				break;
        			case "F":
        				printPassengerList();
        				break;
        			case "X":
        				break;
        			default:
        				throw new Exception("Invalid entry, please enter again.");
        		}
        	}
        	catch (Exception e) {
        		System.out.println(e.getMessage());
        	}
        	
        	displayMenu();
        	userInput = scnr.next().toUpperCase();
        	scnr.nextLine();
        }
        System.out.println("Thank you for using Luxury Ocean Cruise Outing. Goodbye!");
        scnr.close();


    }

    // hardcoded ship data for testing
    // Initialize ship list
    public static void initializeShipList() {
        add("Candy Cane", 20, 40, 10, 60, true);
        add("Peppermint Stick", 10, 20, 5, 40, true);
        add("Bon Bon", 12, 18, 2, 24, false);
        add("Candy Corn", 12, 18, 2, 24, false);
    }

    // hardcoded cruise data for testing
    // Initialize cruise list
    public static void initializeCruiseList() {
        Cruise newCruise = new Cruise("Southern Swirl", "Candy Cane", "Miami", "Cuba", "Miami");
        cruiseList.add(newCruise);
    }

    // hardcoded cruise data for testing
    // Initialize passenger list
    public static void initializePassengerList() {
        Passenger newPassenger1 = new Passenger("Neo Anderson", "Southern Swirl", "STE");
        passengerList.add(newPassenger1);

        Passenger newPassenger2 = new Passenger("Trinity", "Southern Swirl", "STE");
        passengerList.add(newPassenger2);

        Passenger newPassenger3 = new Passenger("Morpheus", "Southern Swirl", "BAL");
        passengerList.add(newPassenger3);
    }

    // custom method to add ships to the shipList ArrayList
    public static void add(String tName, int tBalcony, int tOceanView,
                           int tSuite, int tInterior, boolean tInService) {
        Ship newShip = new Ship(tName, tBalcony, tOceanView, tSuite, tInterior, tInService);
        shipList.add(newShip);
    }


    public static void printShipList(String listType) {
        // printShipList() method prints list of ships from the
        // shipList ArrayList. There are three different outputs
        // based on the listType String parameter:
        // name - prints a list of ship names only
        // active - prints a list of ship names that are "in service"
        // full - prints tabbed data on all ships

        if (shipList.size() < 1) {
            System.out.println("\nThere are no ships to print.");
            return;
        }
        if (listType == "name") {
            System.out.println("\n\nSHIP LIST - Name");
            for (int i = 0; i < shipList.size(); i++) {
                System.out.println(shipList.get(i));
            }
        // if listType is active, search for active ships in shipList
        } else if (listType == "active") {
        	int activeShipCount = 0;
            System.out.println("\n\nSHIP LIST - Active");
            for (int i = 0; i < shipList.size(); i++) {
            	if(shipList.get(i).getInService() == true) {
            		System.out.println(shipList.get(i).toString());
            		activeShipCount++;
            	}
            }
            if (activeShipCount < 1) {
            	System.out.println("There are no active Ships in the Ship list.");
            }


        } else if (listType == "full") {
            System.out.println("\n\nSHIP LIST - Full");
            System.out.println("-----------------------------------------------");
            System.out.println("                    Number of Rooms     In");
            System.out.print("SHIP NAME           Bal OV  Ste Int     Service");
            System.out.println("\n-----------------------------------------------");
            for (Ship eachShip: shipList)
                eachShip.printShipData();

        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printCruiseList(String listType) {
        if (cruiseList.size() < 1) {
            System.out.println("\nThere are no cruises to print.");
            return;
        }
        if (listType == "list") {
            System.out.println("\n\nCRUISE LIST");
            for (int i=0; i < cruiseList.size(); i++) {
                System.out.println(cruiseList.get(i));
            }
        } else if (listType == "details") {
            System.out.println("\n\nCRUISE LIST - Details");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("                                      |----------------------PORTS-----------------------|");
            System.out.print("CRUISE NAME         SHIP NAME           DEPARTURE           DESTINATION         RETURN");
            System.out.println("\n-----------------------------------------------------------------------------------------");
            for (Cruise eachCruise: cruiseList)
                eachCruise.printCruiseDetails();
        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printPassengerList() {
        if (passengerList.size() < 1) {
            System.out.println("\nThere are no passengers to print.");
            return;
        }
        System.out.println("\n\nPASSENGER LIST");
        System.out.println("-----------------------------------------------------");
        System.out.print("PASSENGER NAME      CRUISE              ROOM TYPE");
        System.out.println("\n-----------------------------------------------------");
        for (Passenger eachPassenger: passengerList)
            eachPassenger.printPassenger();
    }

    // display text-based menu
    public static void displayMenu() {

        System.out.println("\n\n");
        System.out.println("\t\t\tLuxury Ocean Cruise Outings");
        System.out.println("\t\t\t\t\tSystem Menu\n");
        System.out.println("[1] Add Ship            [A] Print Ship Names");
        System.out.println("[2] Edit Ship           [B] Print Ship In Service List");
        System.out.println("[3] Add Cruise          [C] Print Ship Full List");
        System.out.println("[4] Edit Cruise         [D] Print Cruise List");
        System.out.println("[5] Add Passenger       [E] Print Cruise Details");
        System.out.println("[6] Edit Passenger      [F] Print Passenger List");
        System.out.println("[x] Exit System");
        System.out.println("\nEnter a menu selection: ");
    }

    // Add a New Ship
    public static void addShip() {
    	String tName = "";
    	int tBalcony = 0;
    	int tOceanView = 0;
    	int tSuite = 0;
    	int tInterior = 0;
    	String validInService = "";
    	boolean tInService = false;
    	boolean isValid;
    	// initialize all variable names for the creation of the ship
    	// add variable for validation named isValid
    	// create a do while loop with exception handling
		System.out.println("\nCreate a new Ship");
    	do {
    		isValid = true;
    		try {
    			// prompt user to create a name
    			System.out.print("Please enter the ship name: ");
    			// stores string value of ship
    			tName = scnr.nextLine();
    			// loops through shipList to find duplicates
    			for (int i = 0; i < shipList.size(); i++) {
    				// if ship already exists, throws an exception
    				if (tName.equalsIgnoreCase(shipList.get(i).getShipName())) {
    					throw new Exception("Ship name already exists: Please enter a unique ship name");
    				}
    			}
    			// if entry is empty or blank, throws an exception
    			if (tName.isEmpty() || tName.isBlank()) {
    				throw new Exception("Input error: Please enter a ship name.");
    			}
    		} 
    		// catches all other exceptions and throws exception values
    		catch (Exception e) {
    			System.out.println("Exception: " + e.getMessage());
    			isValid = false;
    		}
    	// while not valid
    	} while (!isValid);
    	
    	// validates all user input for room numbers, assigns value
		tBalcony = validateRoomInput(scnr, "balcony");
		tOceanView = validateRoomInput(scnr, "ocean view");
		tSuite = validateRoomInput(scnr, "suite");
		tInterior = validateRoomInput(scnr, "interior");
		
		// do while loop for prompting cruise service
		do {
			try {
				// prompts user whether ship is available for cruise
				System.out.print("Is this ship available for a cruise? (Y/N): ");
				// stores entry as a string value
				validInService = scnr.nextLine();
				// checks whether entry is either Y or N, throws an exception otherwise
				if (!validInService.equalsIgnoreCase("Y") && !validInService.equalsIgnoreCase("N")) {
					throw new Exception("Enter only the values Y or N");
				}
				// if entry is Y, makes inService value true
				if (validInService.equalsIgnoreCase("Y")) {
					tInService = true;
				}
				// else makes inService value false
				else {
					tInService = false;
				}
			}
			// catches all other errors and exception errors
			catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
				isValid = false;
			}
			
		} while (!isValid);
		// use custom add method for creating a new ship
		add(tName, tBalcony, tOceanView, tSuite, tInterior, tInService);
    }

    // Edit an existing ship
    public static void editShip() {

        // This method does not need to be completed
        System.out.println("The \"Edit Ship\" feature is not yet implemented.");

    }

    // Add a New Cruise
    public static void addCruise() {
    	// instance variables
    	String tCruiseName = "";
    	String tShipName = "";
    	String tDeparture = "";
    	String tDestination = "";
    	String tReturn = "";
    	boolean inService = false; 
    	boolean hasCruise = false;
    	boolean isValid;

    	// validation for cruise ship name
    	// do while loop for error handling
    	do {
    		isValid = true;
    		try {
    			// validates cruise ship name
    			tCruiseName = validateStringInput(scnr, "cruise name");
    			// for loop that checks cruise list for matching cruise name
    			for (int i = 0; i < cruiseList.size(); i++) {
    				if (tCruiseName.equalsIgnoreCase(cruiseList.get(i).getCruiseName())) {
    					// throws an error if name already exists
    					throw new Exception ("Cruise name already exists. Please enter a unique cruise name.");
    				}
    			}
    			// if entry is blank or empty, throws an exception
    			if (tCruiseName.isEmpty() || tCruiseName.isBlank()) {
    				throw new Exception ("Cruise name cannot be blank, please try again");
    			}
    		// exception handling
    		} catch (Exception e) {
    			System.out.println("Invalid entry. " + e.getMessage());
    			isValid = false;
    		}
    		
    	} while (!isValid);
    	
    	// assigns departure, destination, and return as valid strings
    	tDeparture = validateStringInput(scnr, "departure port");
    	tDestination = validateStringInput(scnr, "cruise destination");
    	tReturn = validateStringInput(scnr, "return port");
    	
    	
    	// do while loop for validation
    	do {
    		isValid = true;
    		try {
    			// validates ship name string value
    			tShipName = validateStringInput(scnr, "cruise ship name");
    			// search through ship list for existing ship name, if in service throw an error
    			for (int i = 0; i < shipList.size(); i++) {
    				if (tShipName.equalsIgnoreCase(shipList.get(i).getShipName())) {
    					// if ship is in service, make true
    					if (shipList.get(i).getInService()) {
    						inService = true;
    					}
    					// otherwise remain false
    					else {
    						inService = false;
    					}
    					for (int j = 0; j < cruiseList.size(); j++) {
    	    				// if ship name equals the cruise ship name
    	    				if (tShipName.equalsIgnoreCase(cruiseList.get(j).getCruiseShipName())) {
    	    					// ship has cruise
    	    					hasCruise = true;
    	    				}
    	    				// otherwise ship does not have cruise
    	    				else {
    	    					hasCruise = false;
    	    				}
    	    			}
    				}
    			}
    			// search through cruise ship list for cruise ship name
    			// checks to see if ship not in service, throws exception
    			if (!inService) {
    				throw new Exception ("Ship is not in service. Please enter a valid ship.");
    			}
    			// check to see if ship has a cruise, throws an exception
    			else if (hasCruise) {
    				throw new Exception ("Ship has a cruise. Please enter a different ship.");
    			}
    		// exception handling
    		} catch (Exception e) {
    			System.out.println("Invalid entry. " + e.getMessage());
    			isValid = false;
    		}
    		
    	} while (!isValid);
    	// creates a new cruise
        Cruise newCruise = new Cruise(tCruiseName, tShipName, tDeparture, tDestination, tReturn);
        // adds new cruise to the cruise list
        cruiseList.add(newCruise);
    }

    // Edit an existing cruise
    public static void editCruise() {

        // This method does not need to be completed
        System.out.println("The \"Edit Cruise\" feature is not yet implemented.");

    }

    // Add a New Passenger
    public static void addPassenger() {

        Scanner newPassengerInput = new Scanner(System.in);
        System.out.println("Enter the new passenger's name: ");
        String newPassengerName = newPassengerInput.nextLine();

        // ensure new passenger name does not already exist
        for (Passenger eachPassenger: passengerList) {
            if (eachPassenger.getPassengerName().equalsIgnoreCase(newPassengerName)) {
                System.out.println("That passenger is already in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }

        // get cruise name for passenger
        System.out.println("Enter cruise name: ");
        String newCruiseName = newPassengerInput.nextLine();

        // ensure cruise exists
        for (Cruise eachCruise: cruiseList) {
            if (eachCruise.getCruiseName().equalsIgnoreCase(newCruiseName)) {
                // cruise does exist
            } else {
                System.out.println("That cruise does not exist in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }

        // get room type
        System.out.println("Enter Room Type (BAL, OV, STE, or INT: ");
        String room = newPassengerInput.nextLine();
        // validate room type
        if ((room.equalsIgnoreCase("BAL")) || (room.equalsIgnoreCase("OV")) ||
                (room.equalsIgnoreCase("STE")) || (room.equalsIgnoreCase("INT"))) {
            // validation passed - add passenger
            Passenger newPassenger = new Passenger(newPassengerName, newCruiseName, room.toUpperCase());
            passengerList.add(newPassenger);
        } else {
            System.out.println("Invalid input. Exiting to menu...");
            return; // quits addPassenger() method processing
        }
    }

    // Edit an existing passenger
    public static void editPassenger() {

        // This method does not need to be completed
        System.out.println("The \"Edit Passenger\" feature is not yet implemented.");

    }

    // Method to check if input is a number
    public static boolean isANumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false)
                return false;
        }
        return true;
    }
    
    // validates room input data entered by user for int values
    public static int validateRoomInput (Scanner scnr, String roomType) {
    	// validation variable
    	boolean isValid;
    	// integer variable for holding integer input
    	int count = 0;
    	// holds string value of integer
    	String countString;
    	
    	// do while loop for continues entry while not valid
    	do {
    		// assigns is valid to true
    		isValid = true;
    		try {
    			// prompts user for integer data entry
    			System.out.print("Please enter the number of " + roomType + " rooms: ");
    			// stores integer as string
    			countString = scnr.nextLine();
    			// parses string to an integer
    			count = Integer.parseInt(countString);
    			// catches values below 0
    			if (count < 0) {
    				throw new Exception("Room value cannot be below 0. Please enter a value above 0.");
    			}
    		// catches all other errors for data entry
    		}
    		catch (Exception e) {
    			System.out.println("Value is not valid Exception: " + e.getMessage());
    			isValid = false;
    			
    		}
    	// while isValid is false
    	} while (!isValid);
    	// returns parsed integer value
    	return count;
    }
    
    
    // validates user input
    public static String validateStringInput (Scanner scnr, String strName) {
    	boolean isValid;
    	String input = "";
    	
    	// do while loop for validation
    	do {
    		isValid = true;
    		
    		try {
    			// prompt user for input
    			System.out.print("Please enter " + strName + ": ");
    			// store entire user input 
    			input = scnr.nextLine();
    			// check if user input is blank or empty, throws an exception
    			if (input.isBlank() || input.isEmpty()) {
    				throw new Exception("Input cannot be empty");
    			}
    		// catches all other exceptions
    		} catch (Exception e) {
    			System.out.println("Value is not valid Exception: " + e.getMessage());
    		}
    	// while not valid, continue to loop
    	} while (!isValid);
    	// returns valid input
    	return input;
    }
    
    // method for checking ship cruise availability
    public static boolean shipAvailability() {
    	// instance variables for checking availability
    	boolean available = true;
    	boolean assigned = false;
    	
    	// loop through ship checking for a ship in service
    	for (int i = 0; i < shipList.size(); i++) {
    		if (shipList.get(i).getInService()) {
    			// loop through cruiseList to check if ship has the cruise name
    			for (int j = 0; j < cruiseList.size(); j++) {
    				// if cruise name and ship name match in each list, the cruise is available
    				if (shipList.get(i).getShipName().equalsIgnoreCase(cruiseList.get(j).getCruiseShipName())) {
    					assigned = true;
    					available = false;
    				}
    				// else the cruise is available, returns the availablility
    				else {
    					available = true;
    					return available;
    				}
    			}
    		}
    	}
    	return available;
    	
    }

}


