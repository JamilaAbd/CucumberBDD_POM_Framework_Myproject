Feature: Login Functionality

  Scenario: User login with valid credentials
    Given User is on website
    When User enter valid credentials
    Then User is successfully logged in
