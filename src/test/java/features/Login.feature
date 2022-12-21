Feature: Login
  This feature is responsible for testing all the scenarios for Login of application

  @Login
  Scenario: Check Login with correct username and password
    And I ensure application opened
    Then I click login link
    When I enter UserName and Password
      | UserName | admin    |
      | Password | password |
    Then I click login button
    Then I should see the username with hello



  Scenario: Check Login with correct username and password failed
    And I ensure application opened
    Then I click login link
    When I enter UserName and Password
      | UserName | admin111 |
      | Password | password |
    Then I click login button
    Then I should see the username with hello


  @Login
  Scenario: Check Login with correct username and password
    And I ensure application opened
    Then I click login link
    Then I insert UserName and Password




