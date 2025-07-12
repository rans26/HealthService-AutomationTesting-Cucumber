Feature: Login functionality

  @positive
  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter email "John Doe" and password "ThisIsNotAPassword"
    And I click the login button
#    Then I should be redirected to the dashboard page