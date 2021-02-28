
Feature: Parent view grades

  Scenario Outline: Parents checks a student's grades
    Given Parent is logged in
    And Parent with id "<parentId>" wants to check a student's grades
    When Parent enters student id "<studentId>"
    And Parent press add button
    Then Parent gets a responce "<responce>"

    Examples: 
      | parentId  | studentId | responce  |
      | parent1 |     student1 | success |
      | parent1 |     student2 | Fail    |
      | parent2 |     student1 | Fail 		|
      | parent2 |			student2 | Success |
