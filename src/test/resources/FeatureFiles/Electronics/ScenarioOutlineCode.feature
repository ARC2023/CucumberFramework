@SO
Feature: Scenario Outline Testing


  Scenario Outline: Data Driven testing using feature file
    Given I want to write a step with "<UserName>"
    When I check for the "<PassWord>" in step
    Then I verify the "<Email>" in step
    

    Examples: 
      | UserName  |   Email  |PassWord|
      |Amruta|Amruta@gmail.com|Nagpur|
   |Bhagyashree|Bhagyashree@gmail.com|Pune|
   |Priya|Priya@gmail.com|Mumbai|
   |Nikhil|Nikhil@gmail.com|Amravati|