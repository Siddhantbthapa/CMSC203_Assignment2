package assignment2;

import java.util.Scanner;

public class PatientDriverApp {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		// asking user information and storing in respective variables
		System.out.println("Enter the first name of the patient:");
		String firstName = keyboard.nextLine();
		System.out.println("Enter the middle name of the patient:");
		String middleName = keyboard.nextLine();
		System.out.println("Enter the last name of the patient:");
		String lastName = keyboard.nextLine();

		System.out.println("Enter the street address:");
		String streetAddress = keyboard.nextLine();
		System.out.println("Enter the city:");
		String city = keyboard.nextLine();
		System.out.println("Enter the state:");
		String state = keyboard.nextLine();
		System.out.println("Enter the ZIP code:");
		String zipCode = keyboard.nextLine();

		System.out.println("Enter the phone number (example 301-123-4567):");
		String phoneNum = keyboard.nextLine();

		System.out.println("Emergency info");
		System.out.println("Enter the emergency contact name:");
		String emergName = keyboard.nextLine();
		System.out.println("Enter the emergency contact phone number:");
		String emergNum = keyboard.nextLine();
		// made an object class using all parameterized constructor
		Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNum,
				emergName, emergNum);
		// making an object using no arg constructor
		Procedure procedure1 = new Procedure();

		System.out.println("Procedure 1 -enter the name of the procedure:");
		String procedureName1 = keyboard.nextLine();
		System.out.println("Procedure 1 -enter the date (example 06/12/2023):");
		String procedureDate1 = keyboard.nextLine();
		System.out.println("Procedure 1 -enter the practitioner's name:");
		String namePractitioner1 = keyboard.nextLine();
		System.out.println("Procedure 1 -enter the charge:");
		double charge1 = keyboard.nextDouble();
		// added this line to get rid of buffer
		keyboard.nextLine();

		// storing user input to procedure1 using setter
		procedure1.setNameOfProcedure(procedureName1);
		procedure1.setDateOfProcedure(procedureDate1);
		procedure1.setNameOfPractitioner(namePractitioner1);
		procedure1.setCharges(charge1);

		System.out.println("Procedure 2 -enter the name of the procedure:");
		String procedureName2 = keyboard.nextLine();
		System.out.println("Procedure 2 -enter the date (example 06/12/2023):");
		String procedureDate2 = keyboard.nextLine();

		// making new constructor using para-constructor to store the values for
		// procedure 2
		Procedure procedure2 = new Procedure(procedureName2, procedureDate2);

		System.out.println("Procedure 2 -enter the practitioner's name:");
		String namePractitioner2 = keyboard.nextLine();
		System.out.println("Procedure 2 -enter the charge:");
		double charge2 = keyboard.nextDouble();
		// added this line to get rid of buffer
		keyboard.nextLine();

		// storing values to procedure 2 using the setter
		procedure2.setNameOfPractitioner(namePractitioner2);
		procedure2.setCharges(charge2);

		// asking user for the values of procedure 3
		System.out.println("Procedure 3 -enter the name of the procedure:");
		String procedureName3 = keyboard.nextLine();
		System.out.println("Procedure 3 -enter the date (example 06/12/2023):");
		String procedureDate3 = keyboard.nextLine();
		System.out.println("Procedure 3 -enter the practitioner's name:");
		String namePractitioner3 = keyboard.nextLine();
		System.out.println("Procedure 3 -enter the charge:");
		double charge3 = keyboard.nextDouble();
		// added this line to get rid of buffer
		keyboard.nextLine();

		// made another object for the procedure 3 using all instances constructor
		Procedure procedure3 = new Procedure(procedureName3, procedureDate3, namePractitioner3, charge3);

		// calling bottom methods to display the whole informations to user
		System.out.println();
		System.out.println("Patient Information");
		displayPatient(patient);
		System.out.println();
		System.out.println("Procedure 1");
		displayProcedure(procedure1);
		System.out.println();
		System.out.println("Procedure 2");
		displayProcedure(procedure2);
		System.out.println();
		System.out.println("Procedure 3");
		displayProcedure(procedure3);
		System.out.println();

		// calling total method from bottom, storing in a variable and displaying in the
		// required format
		double total = calculateTotalCharges(procedure1, procedure2, procedure3);
		String formatted = String.format("$%,.2f", total);
		System.out.println("Total Charges: " + formatted);

		System.out.println();
		System.out.println("The program was developed by a Student: Siddhant (09/29/2026)");

		keyboard.close();

	}

	// method to display patient info to user using parameter as patient object from
	// the patient class
	public static void displayPatient(Patient patient) {
		System.out.println(patient.toString());
	}

	// method to display procedure info to user using parameter as procedure object
	// from the procedure
	// class
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure.toString());
	}

	// calculating total by passing parameter of three procedures objects and
	// returning total charges
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
	}

}
