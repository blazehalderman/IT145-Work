

import java.text.SimpleDateFormat;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private SimpleDateFormat acquisitionDate;
    private SimpleDateFormat statusDate;
    private String acquisitionSource;
    private Boolean reserved;

    private String trainingLocation;
    private SimpleDateFormat trainingStart;
    private SimpleDateFormat trainingEnd;
    private String trainingStatus;

    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

    // Constructor
    public RescueAnimal() {
    	
    }

    // Add Accessor Methods here
    public String getName () {
    	return (this.name);
    }
    
    public String getType () {
    	return (this.type);
    }
    
    public String getGender () {
    	return (this.gender);
    }
    
    public int getAge () {
    	return (this.age);
    }
    
    public float getWeight () {
    	return (this.weight);
    }
    
    public SimpleDateFormat getAcquisitionDate () {
    	return (this.acquisitionDate);
    }
    
    public SimpleDateFormat getStatusDate () {
    	return (this.statusDate);
    }
    
    public String getAcquisitionSource () {
    	return (this.acquisitionSource);
    }
    
    public Boolean getReserved () {
    	return (this.reserved);
    }

    public String getTrainingLocation () {
    	return (this.trainingLocation);
    }
    
    public SimpleDateFormat getTrainingStart () {
    	return (this.trainingStart);
    }
    
    public SimpleDateFormat getTrainingEnd () {
    	return (this.trainingEnd);
    }
    
    public String getTrainingStatus () {
    	return (this.trainingStatus);
    }
    
    public String getInServiceCountry () {
    	return (this.inServiceCountry);
    }
    
    public String getInServiceCity () {
    	return (this.inServiceCity);
    }
    
    public String getInServiceAgency () {
    	return (this.inServiceAgency);
    }
    
    public String getInServicePOC () {
    	return (this.inServicePOC);
    }
    
    public String getInServiceEmail () {
    	return (inServiceEmail);
    }
    
    public String getInServicePhone () {
    	return (this.inServicePhone);
    }
    
    public String getInServicePostalAddress () {
    	return (this.inServicePostalAddress);
    }
    
    // Add Mutator Methods here
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setType (String type) {
    	this.type = type;
    }
    
    public void setGender (String gender) {
    	this.gender = gender;
    }
    
    public void setAge (int age) {
    	this.age = age;
    }
    
    public void setWeight (float weight) {
    	this.weight = weight;
    }
    
    public void setAcquisitionDate (SimpleDateFormat acquisitionDate) {
    	this.acquisitionDate = acquisitionDate;
    }
    
    public void setStatusDate (SimpleDateFormat statusDate) {
    	this.statusDate = statusDate;
    }
    
    public void setAcquisitionSource (String acquisitionSource) {
    	this.acquisitionSource = acquisitionSource;
    }
    
    public void setReserved (Boolean reserved) {
    	this.reserved = reserved;
    }
    
    public void setTrainingLocation (String trainingLocation) {
    	this.trainingLocation = trainingLocation;
    }
    
    public void setTrainingStart (SimpleDateFormat trainingStart) {
    	this.trainingStart = trainingStart;
    }
    
    public void setTrainingEnd (SimpleDateFormat trainingEnd) {
    	this.trainingEnd = trainingEnd;
    }
    
    public void setTrainingStatus (String trainingStatus) {
    	this.trainingStatus = trainingStatus;
    }
    
    public void setInServiceCountry (String inServiceCountry) {
    	this.inServiceCountry = inServiceCountry;
    }
    
    public void setInServiceCity (String inServiceCity) {
    	this.inServiceCity = inServiceCity;
    }
    
    public void setInServiceAgency (String inServiceAgency) {
    	this.inServiceAgency = inServiceAgency;
    }
    
    public void setInServicePOC (String inServicePOC) {
    	this.inServicePOC = inServicePOC;
    }
    
    public void setInServiceEmail (String inServiceEmail) {
    	this.inServiceEmail = inServiceEmail;
    }
    
    public void setInServicePhone (String inServicePhone) {
    	this.inServicePhone = inServicePhone;
    }
    
    public void setInServicePostalAddress (String inServicePostalAddress) {
    	this.inServicePostalAddress = inServicePostalAddress;
    }


}
