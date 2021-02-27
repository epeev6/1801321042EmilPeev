
Feature: Parent view grades

  Scenario Outline: Parents checks a student's grades
    Given Parent is logged in
    And Parent with id "<parentId>" wants to check a student's grades
    When Parent enters student id "<studentId>"
    Then Parent gets a responce "<responce>"

    Examples: 
      | parentId  | studentId | responce  |
      | parent1 |     1 | success |
      | parent1 |     2 | Fail    |
