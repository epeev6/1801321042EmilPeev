package edu.school.virtual;

import java.util.*;

public class StudentClass {

    
    public StudentClass() {
    }

   
    private int id;
    private int year;
    private char group;
    private Teacher headTeacher;
    private List<Student> students; // Set<Subjects> subjects; ???????????
    private List<Subject> subjects; // Set<> of List<>

    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id=id;
    }

    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year=year;
    }

    
    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
    }
    

    public Teacher getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(Teacher headTeacher) {
        this.headTeacher=headTeacher;
    }


    public List<Subject> getSubjects() {
    	return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        //TODO: this.subjects=(Set<Subject>) subjects;
    }

    
    public void AddStudent(Student student) {
    	students.add(student);
    }
    
    public List<Student> GetAllStudents() {
    	return students;
    }
}