package edu.school.virtual;

import edu.school.virtual.models.AddGradeModel;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddExamGradeSteps {
	
	private AddGradeModel addGradeModel = new AddGradeModel();

	
	@Given("^Teacher is logged in$")
	public void teacher_is_logged_in(String teacherUsername) throws Throwable {
		addGradeModel.navigateToMe(teacherUsername);
	}

	@Given("^wants to add a grade for a student$")
	public void addExamId(int examId) throws Throwable {
		addGradeModel.setExamId(examId);
	}

	@When("^Teacher enters a student \"([^\"]*)\"$")
	public void addStudent(int studentId) throws Throwable {
	    addGradeModel.setStudentId(studentId);
	}

	@When("^teacher enters a grade \"([^\"]*)\"$")
	public void addGrade(float grade) throws Throwable {
		addGradeModel.setGrade(grade);
	}
	
	@When("^teacher press add button$")
	public void clickAddGradeButton() throws Throwable {
		addGradeModel.clickAddButton();
	}

	@Then("^teacher gets a message \"([^\"]*)\"$")
	public void teacher_gets_a_message(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, addGradeModel.getAddGradeMessage());
	}
}
