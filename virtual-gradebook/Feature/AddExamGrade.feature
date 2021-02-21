Feature: Add an exam grade
    
	Scenario Outline: Teacher adds a grade for a student
		Given Teacher is logged in
		And wants to add a grade for a student
		When Teacher enters a student "<student>"
		And teacher enters a grade "<grade>"
		And teacher press add button
		Then teacher gets a message "<expectedMessage>"
	
	Examples:
		| student | grade | expectedMessage |
		| student1 | 5 | Successfully added a grade. |
		| student1 | 1 | Exam grade must be an integer between 2 and 6. |
		| student2 | 5 | Student not found. |
		| student2 | 1 | Student not found. must be an integer between 2 and 6. |
	