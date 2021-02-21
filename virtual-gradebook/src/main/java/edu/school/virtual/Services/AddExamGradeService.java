package edu.school.virtual.Services;

import java.util.ArrayList;
import java.util.List;

import edu.school.virtual.ExamGrade;

public class AddExamGradeService {

	public static String addGrade(int studentId, int examId, float grade) {
		
		final ExamGrade newExamGrade = new ExamGrade(studentId, examId, grade);
		List<ExamGrade> examGrades = getExamGrades();
		
		if(newExamGrade.getGrade()<=2&&newExamGrade.getGrade()>=6) {
			return "Exam grade must be an integer between 2 and 6.";
		}
		
		boolean isStudentExists = examGrades.stream().anyMatch(e -> e.getStudentId() == studentId);
		if (!isStudentExists) {
			return "Student not found.";
		}
		
		examGrades.add(newExamGrade);
		return examGrades.contains(newExamGrade) ? "Successfully added a grade." : "";
	}

	private static List<ExamGrade> getExamGrades() {

		final List<ExamGrade> result = new ArrayList<ExamGrade>();
		final ExamGrade grade = new ExamGrade(1, 1, 4);
		result.add(grade);

		return result;
	}
	
	
}
