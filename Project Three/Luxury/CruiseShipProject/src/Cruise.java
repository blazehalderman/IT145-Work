public class Cruise {

    // Instance Variables
    private String cruiseName;
    private String cruiseShipName;
    private String departurePort;
    private String destination;
    private String returnPort;

    // Constructor - default
    Cruise() {
    }

    // Constructor - full
    Cruise(String tCruiseName, String tShipName, String tDeparture, String tDestination, String tReturn) {
        cruiseName = tCruiseName;
        cruiseShipName = tShipName;
        departurePort = tDeparture;
        destination = tDestination;
        returnPort = tReturn;
    }

    // Accessors
    public String getCruiseName() {
        return cruiseName;
    }

    public String getCruiseShipName() {
        return cruiseShipName;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public String getDestination() {
        return destination;
    }

    public String getReturnPort() {
        return returnPort;
    }

    // Mutators
    public void setCruiseName(String tVar) {
        cruiseName = tVar;
    }

    public void setCruiseShipName(String tVar) {
        cruiseShipName = tVar;
    }

    public void setDeparturePort(String tVar) {
        departurePort = tVar;
    }

    public void setDestination(String tVar) {
        destination = tVar;
    }

    public void setReturnPort(String tVar) {
        returnPort = tVar;
    }

    // print cruise details
    public void printCruiseDetails() {
    	// starting space arrays
    	String[] spaceArray = {"", "", "", "", ""};
    	int[] spaceCountData = new int[5];
    	
    	// fill spaceCountArray with space data
    	spaceCountData[0] = 20 - this.cruiseName.length();
    	spaceCountData[1] = 20 - this.cruiseShipName.length();
    	spaceCountData[2] = 20 - this.departurePort.length();
    	spaceCountData[3] = 20 - this.destination.length();
    	spaceCountData[4] = 20 - this.returnPort.length();
    	
    	// loop through spaceArray and add extra spaces from spaceCount values
    	for (int i = 0; i < spaceArray.length; ++i) {
    		for (int j = 0; j < spaceCountData[i]; j++) {
    			spaceArray[i] += " "; 
    		}
    	}
    	// print spaces and data for cruise ship
    	System.out.println(this.cruiseName + spaceArray[0] + this.cruiseShipName + spaceArray[1] + this.departurePort + 
    	spaceArray[2] + this.destination + spaceArray[3] + this.returnPort);

    }

    // method added to print ship's name vice memory address
    @Override
    public String toString() {
        return cruiseName;
    }
}
