import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppointmentServiceTest {

	@Test
	void testAddAppointment() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		AppointmentService test = new AppointmentService();
		test.addAppointment("1", date, "description");
		assertFalse(test.appointmentList.isEmpty());
	}
	
	@Test
	void testUniqueID() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		AppointmentService test = new AppointmentService();
		test.addAppointment("1", date, "description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			test.addAppointment("1", date, "description");
		});
		
	}
	
	@Test
	void testDeleteAppointment() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		AppointmentService test = new AppointmentService();
		test.addAppointment("1", date, "description");
		test.deleteAppointment("1");
		assertTrue(test.appointmentList.isEmpty());
	}
	
	@Test
	void testUpdateDescription() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		AppointmentService test = new AppointmentService();
		test.addAppointment("1", date, "description");
		test.updateDescription("1", "new description");
		assertTrue(test.appointmentList.get(0).getDescription().equals("new description"));
	}
	
	@Test
	void testUpdateDate() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date date = c.getTime();
		
		AppointmentService test = new AppointmentService();
		test.addAppointment("1", date, "description");
		
		Calendar b = Calendar.getInstance();
		c.set(Calendar.YEAR, 2026);
		c.set(Calendar.MONTH, 8);
		c.set(Calendar.DAY_OF_MONTH, 5);
		Date newDate = c.getTime();
		
		test.updateAppointmentDate("1", newDate);
		assertTrue(test.appointmentList.get(0).getAppointmentDate().equals(newDate));
	}

}
