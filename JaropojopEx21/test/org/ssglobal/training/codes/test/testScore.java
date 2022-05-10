package org.ssglobal.training.codes.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ssglobal.training.codes.Score;

public class testScore {
	
	private Score score;
	
	@BeforeEach
	public void setup() {
		
		score = new Score("Smith","John",70);
		score = new Score("Doe","Mary",85); 
		score = new Score("Page","Alice",82);
		score = new Score("Cooper","Jill",97); 
		score = new Score("Flintstone","Fred",66); 
		score = new Score("Rubble","Barney",80); 
		score = new Score("Smith","Judy",48); 
		score= new Score("Dean","James",90); 
		score = new Score("Russ","Joe",55); 
		score = new Score("Wolfe","Bill",73); 
		score = new Score("Dart","Mary",54); 
		score = new Score("Rogers","Chris",78); 
		score = new Score("Toole","Pat",51); 
		score = new Score("Khan","Omar",93); 
		score = new Score("Smith","Ann",95);

	}
	
	@AfterEach
	public void teardown() {
		score = null;
	}
	@Test
	public void testGetScoresData() {
		
		score.getNumScores();
	}
	
	@Test
	public void testGetNumberAListersTestData() {
		score.getNumberAListers();
	}
	
	@Test
	public void testGetFailingStudentListTestData() {
		score.getFailingStudents();
	}
	
	@Test
	public void testPrintPassingStudentsTestData() {
		score.printPassingStudents();
	}
	
	@Test
	public void testDisplayAllStudentsTestData() {
		score.displayAllStudents();
	}
	
	@Test
	public void testGetStudentRecords() {
		score.getStudentRecords();
	}
}
