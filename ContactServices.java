/*
 * Matthew Maciak
 * CS 320 Module Three Milestone
 * SNHU
 * 5/22/2026
 */

import java.util.ArrayList;

public class ContactServices {
	//Creates an array to hold Contact objects
	public ArrayList<Contact> contactList = new ArrayList<Contact>(); 
	
	//Method to create a new Contact object and add to the Contact list
	public void addContact(String contactID, String firstName,String lastName,String phone,String address) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				throw new IllegalArgumentException("Invalid appointmentID");
			}
		}
		Contact contact = new Contact(contactID, firstName, lastName, phone, address);
		contactList.add(contact);
	}
	
	//Method to delete a Contact object using the contactID
	public void deleteContact(String contactID) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				contactList.remove(i);
				break;
			}
		}
	}
	
	/*
	 * Methods to update contact fields using the Contact's contactID
	 */
	
	//Update first name
	public void updateFirstName(String contactID, String firstName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				contactList.get(i).setFirstName(firstName);
				break;
			}
		}
	}
	
	//Update last name
	public void updateLastName(String contactID, String lastName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				contactList.get(i).setLastName(lastName);
				break;
			}
		}
	}
	
	//Update phone
	public void updatePhone(String contactID, String phone) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				contactList.get(i).setPhone(phone);
				break;
			}
		}
	}
	
	//Update address
	public void updateAddress(String contactID, String address) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				contactList.get(i).setAddress(address);
				break;
			}
		}
	}
}
