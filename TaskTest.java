/*
 * Matthew Maciak
 * CS 320 Module Four Milestone
 * SNHU
 * 5/29/2026
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {

	@Test
	void testTaskClass() {
		Task task = new Task("1", "Matthew", "This is the description");
		assertTrue(task.getTaskID().equals("1"));
		assertTrue(task.getName().equals("Matthew"));
		assertTrue(task.getDescription().equals("This is the description"));
	}
	
	@Test
	void testTaskIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Matthew", "This is the description");
		});
	}
	
	@Test
	void testTaskIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("11111111111", "Matthew", "This is the description");
		});
	}
	
	@Test
	void testNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1", null, "This is the description");
		});
	}
	
	@Test
	void testNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1", "this is longer than twenty charachters", "This is the description");
		});
	}
	
	@Test
	void testDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1", "Matthew", null);
		});
	}
	
	@Test
	void testDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1", "Matthew", "This description is longer than the fifty character limit");
		});
	}
	
	@Test
	void testGetName() {
		Task task = new Task("1", "Matthew", "This is the description");
		assertTrue(task.getName().equals("Matthew"));
	}
	
	@Test
	void testGetDescription() {
		Task task = new Task("1", "Matthew", "This is the description");
		assertTrue(task.getDescription().equals("This is the description"));
	}
	
	@Test
	void testGetTaskID() {
		Task task = new Task("1", "Matthew", "This is the description");
		assertTrue(task.getTaskID().equals("1"));
	}
	
	@Test
	void testSetName() {
		Task task = new Task("1", "Matthew", "This is the description");
		task.setName("Maciak");
		assertTrue(task.getName().equals("Maciak"));
	}
	
	@Test
	void testSetDescription() {
		Task task = new Task("1", "Matthew", "This is the description");
		task.setDescription("New description");
		assertTrue(task.getDescription().equals("New description"));
	}

}
