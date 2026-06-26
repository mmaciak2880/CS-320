import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppointmentTest {

	
	@Test
	void testAppointmentClass() {
		Date date = new Date();
		
		Appointment test = new Appointment("1", date, "This is the description");
		assertTrue(test.getAppointmentID().equals("1"));
		assertTrue(test.getAppointmentDate().equals(date));
		assertTrue(test.getDescription().equals("This is the description"));
	}
	
	@Test
	void testAppointmentIDNull() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, date, "This is the description");
		});
	}
	
	@Test
	void testAppointmentIDTooLong() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("11111111111", date, "This is the description");
		});
	}
	
	@Test
	void testAppointDateNull() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1", null, "This is the description");
		});
	}
	
	@Test
	void testAppointmentDateBefore() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2020);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1", date, "This is the description");
		});
	}
	
	@Test
	void testDescriptionNull() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1", date, null);
		});
	}
	
	@Test
	void testDescriptionTooLong() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1", date, "This description is longer than the fifty character limit");
		});
	}
	
	@Test
	void testSetDescription() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		Appointment test = new Appointment("1", date, "description");
		test.setDescription("new description");
		assertTrue(test.getDescription().equals("new description"));
	}
	
	@Test
	void testSetDate() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		Appointment test = new Appointment("1", date, "description");
		test.setAppointmentDate(new Date());
		assertTrue(test.getAppointmentDate().equals(new Date()));
	}
	
	@Test
	void testGetID() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		Appointment test = new Appointment("1", date, "description");
		assertTrue(test.getAppointmentID().equals("1"));
	}
	
	@Test
	void testGetDate() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		Appointment test = new Appointment("1", date, "description");
		assertTrue(test.getAppointmentDate().equals(date));
	}
	
	@Test
	void testGetDescription() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		Appointment test = new Appointment("1", date, "description");
		assertTrue(test.getDescription().equals("description"));
	}

}
