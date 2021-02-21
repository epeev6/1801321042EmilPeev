package edu.school.virtual;

//import java.util.*;

public class Grade {

    public Grade() {
    }

    
    private int id;
    private Student student;
    private Subject subject;
    private float score;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public Student getStudent() {
    	return student;
    }
    
    public void setStudent(Student student) {
        this.student=student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject=subject;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score=score;
    }

}