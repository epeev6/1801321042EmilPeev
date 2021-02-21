package edu.school.virtual;

//import java.util.*;

public class ExamGrade {

   
    public ExamGrade(int studentId, int examId, float grade) {
    	this.studentId=studentId;
    	this.exam.setId(examId);
    	this.grade=grade;
    }

    private int id;
    private int studentId;
    private float grade;
    public Exam exam;

    
    public int getExamId() {
        return id;
    }

    public void setExamId(int id) {
        this.id=id;
    }

    
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId=studentId;
    }

    
    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade=grade;
    }

}