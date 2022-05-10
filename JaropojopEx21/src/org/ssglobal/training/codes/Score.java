package org.ssglobal.training.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Score {
	
	private ScoreInfo si;
	
	
	public Score(String lname, String fname, int s) {
		si = new ScoreInfo(lname, fname, s);
	}
	
	List<ScoreInfo> numStudents = new ArrayList<ScoreInfo>(Arrays.asList(si));
	Stream<ScoreInfo> numStud = numStudents.stream();
	
	Supplier<ScoreInfo> getNumScores = () -> {
		int num = (int) (Math.random() * 100);
		return null;
	};
	
	Consumer<ScoreInfo> getAverage = (s) -> {
		for(int i = 0; i < s.getScore(); i++) {
			
		}
		
	};
	
	Predicate<ScoreInfo> filterNumberAListers = (s) -> {
		if (s.getScore() >= 90 ) {
			return true;
		}
		return false;
	};
	
	Predicate<ScoreInfo> filterFailingStudents = (s) -> {
		if (s.getScore() < 70 ) {
			return true;
		}
		return false;
	};
	
	Predicate<ScoreInfo> printPassingStudents = (s) -> {
		if (s.getScore() >= 70 ) {
			return true;
		}
		return false;
	};
	
	Comparator<ScoreInfo> sortedAscLastName = (o1, o2) -> {
		if (o1.getLastName().compareTo(o2.getLastName()) == 0) {
			return 0;
		} else if (o1.getLastName().compareTo(o2.getLastName()) > 0) {
			return 2;
		}else {
			return -2;
		}
	};
	
	
	Function<ScoreInfo, String> displayAllStudents = (s) -> {
		return String.join(" ", s.getFirstName(), s.getLastName(), String.valueOf(s.getScore()));
		
	};
	
	public void getNumScores() {
		
	}
	
	public void getAverage() {
		
	}
	

	@SuppressWarnings("unchecked")
	public List<ScoreInfo> getNumberAListers() {

		List<ScoreInfo> studentAList= (List<ScoreInfo>) numStud.filter(filterNumberAListers)
									.sorted(sortedAscLastName).map(displayAllStudents);
		return studentAList;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<ScoreInfo> getFailingStudents() {
		List<ScoreInfo> studentFail= (List<ScoreInfo>) numStud.filter(filterFailingStudents)
				.sorted(sortedAscLastName).map(displayAllStudents);
		return studentFail;
	}
	
	@SuppressWarnings("unchecked")
	public void printPassingStudents() {
		List<ScoreInfo> studentPassed= (List<ScoreInfo>) numStud.filter(printPassingStudents).map(displayAllStudents);
		System.out.println(studentPassed);
	}
	
	@SuppressWarnings("unchecked")
	public void displayAllStudents() {
		List<ScoreInfo> allStud= (List<ScoreInfo>) numStud.sorted(sortedAscLastName).map(displayAllStudents);
		System.out.println(allStud);
	}

	@SuppressWarnings("unchecked")
	public List<ScoreInfo> getStudentRecords() {
		List<ScoreInfo> studentsRec= (List<ScoreInfo>) numStud.map(displayAllStudents);
		
		return studentsRec;
	
	}
}
