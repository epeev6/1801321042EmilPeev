package edu.school.virtual;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.school.virtual.models.ParentCheckGradesModel;

public class ParentViewGradesSteps {
	
	ParentCheckGradesModel parentGradesModel = new ParentCheckGradesModel();
	
	@Given("^Parent is logged in$")
	public void parent_is_logged_in() throws Throwable {
	    
	}

	@Given("^Parent with id \"([^\"]*)\" wants to check a student's grades$")
	public void parent_with_id_wants_to_check_a_student_s_grades(String arg1) throws Throwable {
	    int parentId=Integer.parseInt(arg1);
	    parentGradesModel.setParentId(parentId);
	    
	}

	@When("^Parent enters student id \"([^\"]*)\"$")
	public void addStudentId(String arg1) throws Throwable {
	    int studentId = Integer.parseInt(arg1);
	    
	}

	@Then("^Parent gets a responce \"([^\"]*)\"$")
	public void parent_gets_a_responce(String arg1) throws Throwable {
		
	}
}
