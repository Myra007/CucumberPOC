@Login
Feature: Testing Login Feature

  @TC01
  Scenario: Login with valid credentials
    Given User is on the home page
    When User log in with valid credentials
    Then User is logged in successfully

  @TC02
  Scenario: Login with valid credentials
    Given User is on the home page
    When User log in with valid credentials
    Then User is logged in successfully

