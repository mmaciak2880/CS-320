/*
 * Matthew Maciak
 * CS 320 Module Three Milestone
 * SNHU
 * 5/22/2026
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	@Test 
	void testAddContact() {
		ContactServices tester = new ContactServices();
		tester.addContact("1", "Matthew", "Maciak", "1111111111", "123 home drive");
		assertFalse(tester.contactList.isEmpty());
	}
	
	@Test
	void testDeleteContact() {
		ContactServices tester = new ContactServices();
		tester.addContact("1", "Matthew", "Maciak", "1111111111", "123 home drive");
		tester.deleteContact(tester.contactList.get(0).getContactID());
		assertTrue(tester.contactList.isEmpty());
	}

	@Test
	void testUpdateFirstName() {
		ContactServices tester = new ContactServices();
		tester.addContact("1", "Matthew", "Maciak", "1111111111", "123 home drive");
		tester.updateFirstName(tester.contactList.get(0).getContactID(), "Dave");
		assertTrue(tester.contactList.get(0).getFirstName().equals("Dave"));
	}
	
	@Test
	void testUpdateLastName() {
		ContactServices tester = new ContactServices();
		tester.addContact("1", "Matthew", "Maciak", "1111111111", "123 home drive");
		tester.updateLastName(tester.contactList.get(0).getContactID(), "Dave");
		assertTrue(tester.contactList.get(0).getLastName().equals("Dave"));
	}
	
	@Test
	void testUpdatePhone() {
		ContactServices tester = new ContactServices();
		tester.addContact("1", "Matthew", "Maciak", "1111111111", "123 home drive");
		tester.updatePhone(tester.contactList.get(0).getContactID(), "2222222222");
		assertTrue(tester.contactList.get(0).getPhone().equals("2222222222"));
	}
	
	@Test
	void testUpdateAdress() {
		ContactServices tester = new ContactServices();
		tester.addContact("1", "Matthew", "Maciak", "1111111111", "123 home drive");
		tester.updateAddress(tester.contactList.get(0).getContactID(), "456 house drive");
		assertTrue(tester.contactList.get(0).getAddress().equals("456 house drive"));
	}

}
