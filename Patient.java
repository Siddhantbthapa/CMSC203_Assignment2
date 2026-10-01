package assignment2;

public class Patient {
	// fields
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNum;
	private String emergName;
	private String emergNum;

	// no-arg constructor
	public Patient() {
		firstName = "";
		middleName = "";
		lastName = "";
		streetAddress = "";
		city = "";
		state = "";
		zipCode = "";
		phoneNum = "";
		emergName = "";
		emergNum = "";
	}

	// parameterized constructor
	public Patient(String firstName, String middleName, String lastName) {
		this();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public Patient(String firstName, String middleName, String lastName, String streetAddress, String city,
			String state, String zipCode, String phoneNum, String emergName, String emergNum) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNum = phoneNum;
		this.emergName = emergName;
		this.emergNum = emergNum;
	}

	// accessor
	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String getEmergName() {
		return emergName;
	}

	public String getEmergNum() {
		return emergNum;
	}

	// mutator
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void setEmergName(String emergName) {
		this.emergName = emergName;
	}

	public void setEmergNum(String emergNum) {
		this.emergNum = emergNum;
	}

	/* method to make and return full name */
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}

	/** method that make and return full address name */
	public String buildAddress() {
		return streetAddress + " " + city + " " + state + " " + zipCode;
	}

	/** method to make full information of emergency contact */
	public String buildEmergencyContact() {
		return emergName + " " + emergNum;
	}

	/**
	 * made another method to return all the information about patient in each line
	 * with tab
	 */
	public String toString() {
		return String.format("Patient info:\n\tName: %s\n\tAddress: %s\n\tPhone: %s\n\tEmergencyContact: %s",
				buildFullName(), buildAddress(), phoneNum, buildEmergencyContact());
	}
}
