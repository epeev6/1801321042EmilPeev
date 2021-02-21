package edu.school.virtual;

import java.util.*;

public class Subject {

    
    public Subject() {
    	
    }

    
    private int id;
    private String name;
    private List<Teacher> teachers;
    public List<Grade> grades;
    public List<StudentClass> studentClasses;
    public List<Exam> exams;
    
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }
    
    public List<Teacher> getTeachers() {
        return teachers;
    }
    
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

}