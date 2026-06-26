/*
 * Matthew Maciak
 * CS 320 Module Three Milestone
 * SNHU
 * 5/22/2026
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact("1", "Matthew", "Maciak", "1111111111", "123 home drive");
		assertTrue(contact.getContactID().equals("1"));
		assertTrue(contact.getFirstName().equals("Matthew"));
		assertTrue(contact.getLastName().equals("Maciak"));
		assertTrue(contact.getPhone().equals("1111111111"));
		assertTrue(contact.getAddress().equals("123 home drive"));
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "qwertyuiopa", "Maciak", "1111111111", "123 home drive" );
		});
	}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", null, "Maciak", "1111111111", "123 home drive" );
		});
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Matthew", "qwertyuiopa", "1111111111", "123 home drive" );
		});
	}
	
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Matthew", null, "1111111111", "123 home drive" );
		});
	}
	
	@Test
	void testPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Matthew", "Maciak", "11111111111", "123 home drive" );
		});
	}
	
	@Test
	void testPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Matthew", "Maciak", "1", "123 home drive" );
		});
	}
	
	@Test
	void testNonDigitPhone() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Matthew", "Maciak", "123456789h", "123 home drive" );
		});
	}
	
	@Test
	void testPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Matthew", "Maciak", null, "123 home drive" );
		});
	}
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Matthew", "Maciak", "1111111111", "this is longer than thirty characters" );
		});	
	}
	
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Matthew", "Maciak", "1111111111", null);
		});
	}
	
	@Test
	void testGetContactID() {
		Contact test = new Contact("1", "Matthew", "Maciak", "1234567891", "123 home drive" );
		assertTrue(test.getContactID().equals("1"));
	}
	
	@Test
	void testGetFirstName() {
		Contact test = new Contact("1", "Matthew", "Maciak", "1234567891", "123 home drive" );
		assertTrue(test.getFirstName().equals("Matthew"));
	}
	
	@Test
	void testGetLastName() {
		Contact test = new Contact("1", "Matthew", "Maciak", "1234567891", "123 home drive" );
		assertTrue(test.getLastName().equals("Maciak"));
	}
	
	@Test
	void testGetPhone() {
		Contact test = new Contact("1", "Matthew", "Maciak", "1234567891", "123 home drive" );
		assertTrue(test.getPhone().equals("1234567891"));
	}
	
	@Test
	void testGetAddress() {
		Contact test = new Contact("1", "Matthew", "Maciak", "1234567891", "123 home drive" );
		assertTrue(test.getAddress().equals("123 home drive"));
	}
	
	@Test
	void testSetFirstName() {
		Contact test = new Contact("1", "Matthew", "Maciak", "1234567891", "123 home drive" );
		test.setFirstName("name");;
		assertTrue(test.getFirstName().equals("name"));
	}
	
	@Test
	void testSetLastName() {
		Contact test = new Contact("1", "Matthew", "Maciak", "1234567891", "123 home drive" );
		test.setLastName("last");
		assertTrue(test.getLastName().equals("last"));
	}
	
	@Test
	void testSetPhone() {
		Contact test = new Contact("1", "Matthew", "Maciak", "1234567891", "123 home drive" );
		test.setPhone("1111111111");
		assertTrue(test.getPhone().equals("1111111111"));
	}
	
	@Test
	void testSetAddress() {
		Contact test = new Contact("1", "Matthew", "Maciak", "1234567891", "123 home drive" );
		test.setAddress("new address");
		assertTrue(test.getAddress().equals("new address"));
	}




}
