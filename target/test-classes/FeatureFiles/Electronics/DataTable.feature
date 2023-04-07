Feature: Data Tables in Cucumbers using list and maps

@DataTablesList @new
  Scenario: Data Table as list only
    Given I want to show data table as list
   When I recevie below mentioned data in table as list
   |Amruta|
   |Bhagyashree|
   |Priya|
   |Nikhil|
   Then my list is iterated successfully
    
@DataTablesList @new
  Scenario: Data Table as list of list only
     Given I want to show data table as list of list
   When I recevie below mentioned data in table as list of list
 |Amruta|Amruta@gmail.com|Nagpur|987456|
   |Bhagyashree|Bhagyashree@gmail.com|Pune|654789|
   |Priya|Priya@gmail.com|Mumbai|123654|
   |Nikhil|Nikhil@gmail.com|Banglore|456258|
 Then my list is iterated successfully
 
 @DataTablesMap 
  Scenario: Data Table as Maps
   Given I want to show data table as map
   When I recevie below mentioned data in table as map
   |Name|Email|City|Number|
   |Amruta|Amruta@gmail.com|Nagpur|987456|
   |Bhagyashree|Bhagyashree@gmail.com|Pune|654789|
   |Priya|Priya@gmail.com|Mumbai|123654|
   |Nikhil|Nikhil@gmail.com|Banglore|456258|
   
   Then my list is iterated successfully
    
 @DataTablesMap 
  Scenario: Data Table as Maps only
   Given I want to show data table as map only
   When I recevie below mentioned data in table as map only
   |Name|Email|
   |Amruta|Amruta@gmail.com|
   |Bhagyashree|Bhagyashree@gmail.com|
   |Priya|Priya@gmail.com|
   |Nikhil|Nikhil@gmail.com|
   
   Then my list is iterated successfully
   
   
   
   