package edu.school.virtual.Services;

import java.util.ArrayList;
import java.util.List;

import edu.school.virtual.Parent;
import edu.school.virtual.Student;

public class ParentGetGradesService {

	
	public static String getGrades(String parentUsername, String studentUsername) {
		
		
		
		
		return "";
	}
	
	
	
	
	
	
	
	private static List<Student> getStudents() {

		final List<Student> students = new ArrayList<Student>();
		
		final Student student1 = new Student("student1");
		students.add(student1);
		final Student student2 = new Student("student2");
		students.add(student2);
		
		return students;
	}
	
	private static List<Parent> getParents() {

		final List<Parent> parents = new ArrayList<Parent>();
		
		final Parent parent1 = new Parent("parent1");
		parents.add(parent1);
		final Parent parent2 = new Parent("parent2");
		parents.add(parent2);
		
		List<Student> children = new ArrayList<Student>();
		List<Student> allStudents = getStudents();
		for(int i = 0; i < allStudents.size(); i++) {
			
			Student currentChild = allStudents.get(i);
			
			if(currentChild.getUsername().equals("student1")) {
				children.add(currentChild);
			}
		}
		parent1.setChildren(children);
		
		
		
		
		children=new ArrayList<Student>();
		for(int i = 0; i < allStudents.size(); i++) {
			
			Student currentChild = allStudents.get(i);
			
			if(currentChild.getUsername().equals("student2")) {
				children.add(currentChild);
			}
		}
		parent2.setChildren(children);
		return parents;
	}
	
}
