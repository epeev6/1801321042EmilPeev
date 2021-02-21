package edu.school.virtual.models;

import edu.school.virtual.Teacher;
import edu.school.virtual.Services.AddExamGradeService;

public class AddGradeModel {


	private int studentId;
	private int examId;
	private float grade;
	private Object addGradeMessage;
	private Teacher teacher;
	
	public void navigateToMe(String username) {
		this.teacher.setUsername(username);
		System.out.println("Teacher is on the Add an exam grade page.");
	}
	

	public void setStudentId(int studentId) {
		this.studentId=studentId;
	}
	
	public void setExamId(int examId) {
		this.examId=examId;
	}
	public void setGrade(float grade) {
		this.grade=grade;
	}
	
	public void clickAddButton() {
		addGradeMessage = AddExamGradeService.addGrade(studentId, examId, grade);
	}

	public Object getAddGradeMessage() {
		return addGradeMessage;
	}
}
