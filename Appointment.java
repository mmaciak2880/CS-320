

import java.util.Date;

public class Appointment {
	
	/*
	 * String variable for appointmentID shall be unique
	 * Can not be longer that 10 characters
	 * Can not be updated and shall not be NULL
	 */
	private final  String appointmentID;
	//Date object for the appointmentDate variable can not be in the past and shall not be NULL
	private Date appointmentDate;
	//Appointment description string variable can not be NULL and no longer than 50 characters
	private String description;
	
	//Appointment constructor
	public Appointment(String appointmentID, Date appointmentDate, String description) {
		
		//appointmentID validation
		if (appointmentID == null || appointmentID.length() > 10) {
			throw new IllegalArgumentException("Invalid appointmentID");
		}
		else {
			this.appointmentID = appointmentID;
		}
		
		//appointmentDate validation
		if(appointmentDate == null || appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("Invalid appointmentDate");
		}
		else {
			this.appointmentDate = appointmentDate;
		}
		
		//description validation
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		else {
			this.description = description;
		}
		
	}
	
	/*
	 * Setters for Appointment objects
	 * All follow same validation as in the constructor
	 * appiontmentID can not be updated
	 */
	
	//Set appointmentDate
	public void setAppointmentDate(Date appointmentDate){
		
		if(appointmentDate == null || appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("Invalid appointmentDate");
		}
		else {
			this.appointmentDate = appointmentDate;
		}
		
	}
	
	//Set description
	public void setDescription(String description) {
		
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		else {
		this.description = description;
		}
		
	}
	
	/*
	 * Getters for all Appointment object parameters
	 */
	
	//Get appointmentID
	public String getAppointmentID() {
		return appointmentID;
	}
	
	//Get appointmentDate
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	//Get description
	public String getDescription() {
		return description;
	}

}
