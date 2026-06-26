/*
 * Matthew Maciak
 * CS 320 Module Four Milestone
 * SNHU
 * 5/29/2026
 */

public class Task {
	
	//String variable for the task ID shall not be NULL and can not be longer than 10 characters
	private final String taskID;
	//String variable for name shall not be NULL and can not be longer than 20 characters
	private String name;
	//String variable for the task description shall not be NULL and can not be longer than 50 characters
	private String description;
	
	//Task constructor with String ID, String name, and String description for parameters.
	public Task(String taskID, String name, String description) {
		//taskID validation
		if (taskID == null || taskID.length() > 10) {
			throw new IllegalArgumentException("Invalid taskID");
		}
		else {
			this.taskID = taskID;
		}
		
		//name validation
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		else {
			this.name = name;
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
	 * SETTER methods for Task objects
	 * All methods follow the same rules as the parameters for the Task constructor
	 * The taksID CANNOT be updated
	 */
	
	//set name
	public void setName(String name) {
		
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		else {
			this.name = name;
		}
	}
	
	//set description
	public void setDescription(String description) {
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		else {
			this.description = description;
		}
	}
	
	/*
	 * GETTER methods
	 */
	
	//Get taskID
	public String getTaskID() {
		return taskID;
	}
	
	//Get name
	public String getName() {
		return name;
	}
	
	//Get description
	public String getDescription() {
		return description;
	}

}
