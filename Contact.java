/*
 * Matthew Maciak
 * CS 320 Module Three Milestone
 * SNHU
 * 5/22/2026
 */

import java.util.Arrays;
import java.util.List;

public class Contact {
	
	//private variables for Contact object none shall be NULL
	
	//final String contactID that can not be changed; <= 10 characters
	private final String contactID;
	// <= 10 characters
	private String firstName;
	// <= 10 characters
	private String lastName;
	//Must be 10 digits
	private String phone;
	//List for phone number validation
	private List<Character> numbers = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'); 
	// <= 30 characters
	private String address;
	
	/*CONSTRUCTOR for Contact object taking a contact ID, first name, last name, phone number, and address as parameters
	 * No variables shall be NULL if they are or longer than the character limit an exception will be thrown
	 */
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		
		//contactID validation
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid appointmentID");
		}
		else {
			this.contactID = contactID;
		}
		
		//firstName validation
		//if firstName is NULL or empty an exception is thrown
		if (firstName == null || firstName.isEmpty() || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		else {
			this.firstName = firstName;
		}
		
		//lastName validation
		//if LastName is NULL or empty an exception is thrown
		if (lastName == null || lastName.isEmpty() || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		else {
			this.lastName = lastName;
		}
		
		//phone validation
		//if phone is NULL or empty or less than or greater than 10 characters an exception is thrown
		if(phone == null || phone.isEmpty() || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		else {
			for (int i = 0; i < phone.length(); i++) {
				if(!numbers.contains(phone.charAt(i))) {
					throw new IllegalArgumentException("Invalid Phone Number");
				}
			}
			this.phone = phone;
		}
		
		//address validation
		//if address is NULL, empty, or longer than the character limit an exception is thrown
		if (address == null || address.isEmpty() || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		else {
			this.address = address;
		}
	}
	
	/*
	 * SETTERS for Contact object
	 * All setters follow the same rules as the constructor parameters
	 */
	
	//Sets first name
	public void setFirstName(String firstName) {
		//if firstName is NULL or empty an exception is thrown
		if (firstName == null || firstName.isEmpty() || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		else {
			this.firstName = firstName;
		}
	}
	
	//sets last name
	public void setLastName(String lastName) {
		//if LastName is NULL or empty an exception is thrown
		if (lastName == null || lastName.isEmpty() || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		else {
			this.lastName = lastName;
		}
	}
	
	//sets phone
	public void setPhone(String phone) {
		//if phone is NULL or empty or less than or greater than 10 characters an exception is thrown
		if(phone == null || phone.isEmpty() || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		else {
			this.phone = phone;
		}	
	}
	
	//sets address
	public void setAddress(String address) {
	//if address is NULL or empty place holder is added
		if (address == null || address.isEmpty()) {
			this.address = "ADDRESS";
		}
		//if address is NULL, empty, or longer than the character limit an exception is thrown
		if (address == null || address.isEmpty()) {
			throw new IllegalArgumentException("Invalid Address");
		}
		else {
			this.address = address;
		}
	}
	
	/*
	 * GETTERS
	 */
	
	//Gets contact ID
	public String getContactID() {
		return contactID;
	}
	//Gets first name
	public String getFirstName(){
		return firstName;
	}
	
	//Gets last name
	public String getLastName() {
		return lastName;
	}
	
	//gets phone
	public String getPhone() {
		return phone;
	}
	
	//Gets address
	public String getAddress() {
		return address;
	}
}
