package edu.school.virtual;

import java.util.*;


public class Teacher extends User {

    public Teacher() {
    	
    }

    
    private List<Subject> subjects;
    public StudentClass studentClass;
    
    public List<Subject> getSubjects() {
    	return subjects;
    }

    
    public void addSubjects(Subject subject) {
        this.subjects.add(subject);
    }

}