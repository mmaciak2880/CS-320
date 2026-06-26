

import java.util.ArrayList;
import java.util.Date;

public class AppointmentService {
	
	//Creates an array to hold Appointment objects
	public ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
	
	//Method to create a Appointment object and add to the appointmentList array
	public void addAppointment(String appointmentID, Date date, String description) {
		for (int i = 0; i < appointmentList.size(); i++) {
			if (appointmentList.get(i).getAppointmentID().equals(appointmentID)) {
				throw new IllegalArgumentException("Invalid appointmentID");
			}
		}
		
		Appointment appointment = new Appointment(appointmentID, date, description);
		appointmentList.add(appointment);
	}
	
	//Method to delete an appointment per the appointmentID
	public void deleteAppointment(String appointmentID) {
		for (int i = 0; i < appointmentList.size(); i++) {
			if (appointmentList.get(i).getAppointmentID().equals(appointmentID)) {
				appointmentList.remove(i);
				break;
			}
		}
	}

		
	//Method to update appointment description per appointmentID
	public void updateDescription(String appointmentID, String description) {
		for (int i = 0; i < appointmentList.size(); i++) {
			if (appointmentList.get(i).getAppointmentID().equals(appointmentID)) {
				appointmentList.get(i).setDescription(description);
				break;
			}
		}
	}
	
	//Method to update appointment date per appointmentID
	public void updateAppointmentDate(String appointmentID, Date date) {
		for (int i = 0; i < appointmentList.size(); i++) {
			if (appointmentList.get(i).getAppointmentID().equals(appointmentID)) {
				appointmentList.get(i).setAppointmentDate(date);
				break;
			}
		}
	}

}
