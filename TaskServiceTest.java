/*
 * Matthew Maciak
 * CS 320 Module Four Milestone
 * SNHU
 * 5/29/2026
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskServiceTest {

	@Test
	void testAddTask() {
		TaskService tester = new TaskService();
		tester.addTask("1", "Matthew", "This is the description");
		assertFalse(tester.taskList.isEmpty());
		
	}
	
	@Test
	void testUniqueTaskID() {
		TaskService tester = new TaskService();
		tester.addTask("1", "Matthew", "This is the description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			tester.addTask("1", "Maciak", "asdf");
		});
	}
	
	@Test
	void testDeleteTask() {
		TaskService tester = new TaskService();
		tester.addTask("1", "Matthew", "This is the description");
		tester.deleteTask("1");
		assertTrue(tester.taskList.isEmpty());
	}
	
	@Test
	void testUpdateName() {
		TaskService tester = new TaskService();
		tester.addTask("1", "Matthew", "This is the description");
		tester.updateName("1", "Maciak");
		assertTrue(tester.taskList.get(0).getName().equals("Maciak"));
	}
	
	@Test
	void testUpdateDescription() {
		TaskService tester = new TaskService();
		tester.addTask("1", "Matthew", "This is the description");
		tester.updateDescription("1", "New description");
		assertTrue(tester.taskList.get(0).getDescription().equals("New description"));
	}

}
