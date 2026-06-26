/*
 * Matthew Maciak
 * CS 320 Module Four Milestone
 * SNHU
 * 5/29/2026
 */

import java.util.ArrayList;

public class TaskService {
	
	//Creates an array to hold Tasks
	public ArrayList<Task> taskList = new ArrayList<Task>();
	
	//Method to create a Task object and add to the taskList array
	public void addTask(String taskID, String name, String description) {
		for (int i = 0; i < taskList.size(); i++) {
			if (taskList.get(i).getTaskID().equals(taskID)) {
				throw new IllegalArgumentException("Invalid taskID");
			}
		}
		Task task = new Task(taskID, name, description);
		taskList.add(task);
	}
	
	//Method to delete a task per the taskID
	public void deleteTask(String taskID) {
		for (int i = 0; i < taskList.size(); i++) {
			if (taskList.get(i).getTaskID().equals(taskID)) {
				taskList.remove(i);
				break;
			}
		}
	}
	
	//Method to update task name per taskID
	public void updateName(String taskID, String name) {
		for (int i = 0; i < taskList.size(); i++) {
			if (taskList.get(i).getTaskID().equals(taskID)) {
				taskList.get(i).setName(name);
				break;
			}
		}
	}
	
	//Method to update task description per taskID
	public void updateDescription(String taskID, String description) {
		for (int i = 0; i < taskList.size(); i++) {
			if (taskList.get(i).getTaskID().equals(taskID)) {
				taskList.get(i).setDescription(description);
				break;
			}
		}
	}

}
