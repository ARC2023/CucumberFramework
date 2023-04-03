
Feature: Basic testing of Framework
 
  Scenario: To validate basic login for sauce demo
    Given I am on login page of sauce demo
    When I enter User name "standard_user"
    And I enter Password "secret_sauce"
    And I click on login button
    Then I land on home page of sauce demo
    

  