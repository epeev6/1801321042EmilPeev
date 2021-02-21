package edu.school.virtual;

import java.util.*;

public class Exam {

    
    public Exam() {
    }

    
    private int id;
    private String name;
    private Date date;
    private Subject subject;
    public Set<ExamGrade> examGrades;
    
    

   
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

   
    public Date getDate() {
        return date;
    }

    
    public void setDate(Date date) {
        this.date=date;
    }

    
    public Subject getSubject() {
        return subject;
    }

    
    public void setSubject(Subject subject) {
        this.subject=subject;
    }

}