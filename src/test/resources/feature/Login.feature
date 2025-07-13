Feature: Login functionality

  @positive
  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter username "John Doe" and password "ThisIsNotAPassword"
    And I click the login button
    Then User should be redirected to the Make Appointment page