package assignment2;

public class Procedure {
	// field for procedure
	private String nameOfProcedure;
	private String dateOfProcedure;
	private String nameOfPractitioner;
	private double charges;

	// no-arg
	public Procedure() {
		nameOfProcedure = "";
		dateOfProcedure = "";
		nameOfPractitioner = "";
		charges = 0.0;
	}

	// parameterized constructor
	public Procedure(String nameOfProcedure, String dateOfProcedure) {
		this();
		this.nameOfProcedure = nameOfProcedure;
		this.dateOfProcedure = dateOfProcedure;
	}

	public Procedure(String nameOfProcedure, String dateOfProcedure, String nameOfPractitioner, double charges) {
		this.nameOfProcedure = nameOfProcedure;
		this.dateOfProcedure = dateOfProcedure;
		this.nameOfPractitioner = nameOfPractitioner;
		this.charges = charges;
	}

	// accessor
	public String getNameOfProcedure() {
		return nameOfProcedure;
	}

	public String getDateOfProcedure() {
		return dateOfProcedure;
	}

	public String getNameOfPractitioner() {
		return nameOfPractitioner;
	}

	public double getCharges() {
		return charges;
	}

	// mutator
	public void setNameOfProcedure(String nameOfProcedure) {
		this.nameOfProcedure = nameOfProcedure;
	}

	public void setDateOfProcedure(String dateOfProcedure) {
		this.dateOfProcedure = dateOfProcedure;
	}

	public void setNameOfPractitioner(String nameOfPractitioner) {
		this.nameOfPractitioner = nameOfPractitioner;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	/**
	 * method to display all the information related to the procedures one in each
	 * line with tab
	 */
	public String toString() {
		return String.format("\tProcedure: %s\n\tProcedureDate: %s\n\tPractitioner: %s\n\tCharge: %s", nameOfProcedure,
				dateOfProcedure, nameOfPractitioner, charges);
	}

}
