Feature: Manage Users
  Manage Users test cases

  @OneTest
  Scenario: Select Role for User
    And I ensure application opened
    Then I click login link
    When I enter UserName and Password
      | UserName | admin    |
      | Password | password |
    Then I click login button
    And I click lnkManageUsers link
    Then I select Role "User"
    Then I click on button Assign