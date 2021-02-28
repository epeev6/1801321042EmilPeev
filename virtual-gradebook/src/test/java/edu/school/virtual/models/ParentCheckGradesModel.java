package edu.school.virtual.models;

import edu.school.virtual.Services.ParentGetGradesService;

public class ParentCheckGradesModel {
	
	private String parentUsername;
	private String studentUsername;
	private Object getGradesMessage;
	
	
	
	public void navigateToMe() {
		System.out.print("Parent is on homepage. Please enter a student.");
	}
	
	public void setParent(String parentUsername) {

		System.out.println("Parent is on the Check grades page.");
		this.parentUsername = parentUsername;
	}
	
	public void setStudent(String studentUsername) {
		this.studentUsername = studentUsername;
	}
	
	public void clickGetGradesButton() {
		getGradesMessage = ParentGetGradesService.getGrades(parentUsername, studentUsername);
	}
	
	public Object getStudentGradesMessage() {
		return getGradesMessage;
	}
	
	

}
