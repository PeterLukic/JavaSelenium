Feature: Employee
  Responsible for verifying Benefits, Create Employee,
  Delete employee and check if the functionality works


  Scenario: Create Employee with all details 1
    And I ensure application opened
    Then I click login link
    When I enter UserName and Password
      | UserName | admin    |
      | Password | password |
    Then I click login button
    And I click employeeList link
    Then I click create new button
    And I enter following details
      | Name      | Salary | DurationWorked | Grade | Email           |
      | AutoUser  | 4000   | 30             | 1     | autouser@ea.com |
      | AutoUser2 | 5000   | 40             | 1     | autouser@ea.com |
  And I click create button



