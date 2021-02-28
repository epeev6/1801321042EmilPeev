package edu.school.virtual;

import java.util.*;

public class Parent extends User {

    
    public Parent(String username) {
    	setUsername(username);
    }

    
    private List<Student> children;
    
    
    public List<Student> getChildren(){
    	return children;
    }
    
    public void setChildren(List<Student> students) {
    	this.children=students;
    }
    
    public void getGrades() {
    	// RETURN STUDENT GRADES
    }


}