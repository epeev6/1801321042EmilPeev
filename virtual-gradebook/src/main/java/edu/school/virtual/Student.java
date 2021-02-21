package edu.school.virtual;

import java.util.*;

public class Student extends User {

    
    public Student() {
    }

    
    private List<Parent> parents;
    private StudentClass studentClass;
    private List<Grade> grades;
    

    
    public List<Parent> getParents() {
        return parents;
    }

    public void addParent(Parent parent) {
        this.parents.add(parent);
    }

    
    public StudentClass getStudentClass() {
        return studentClass;
    }

    
    public void setStudentClass(StudentClass studentClass) {
        this.studentClass=studentClass;
    }
    
    public List<Grade> getGrades(){
    	return grades;
    }
    
    public void addGrade(Grade grade) {
    	this.grades.add(grade);
    }
}