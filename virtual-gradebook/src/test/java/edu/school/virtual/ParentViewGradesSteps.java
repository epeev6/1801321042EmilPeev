package edu.school.virtual;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.school.virtual.models.ParentCheckGradesModel;

public class ParentViewGradesSteps {
	
	ParentCheckGradesModel parentGradesModel = new ParentCheckGradesModel();
	
	@Given("^Parent is logged in$")
	public void parent_is_logged_in() throws Throwable {
	    parentGradesModel.navigateToMe();
	}

	@Given("^Parent with id \"([^\"]*)\" wants to check a student's grades$")
	public void parentEntersStudent(String parentUsername) throws Throwable {
	    parentGradesModel.setParent(parentUsername);
	    
	}

	@When("^Parent enters student id \"([^\"]*)\"$")
	public void addStudentId(String studentUsername) throws Throwable {
	  	parentGradesModel.setStudent(studentUsername);
	}
	
	@When("^parent press add button$")
	public void clickGetGradesButton() throws Throwable {
		parentGradesModel.clickGetGradesButton();
	}

	@Then("^Parent gets a responce \"([^\"]*)\"$")
	public void parent_gets_a_responce(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, parentGradesModel.getStudentGradesMessage());
	}
}
