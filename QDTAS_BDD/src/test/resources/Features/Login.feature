@tag
Feature: Feature to test Login Functionality
  

  @tag1
  Scenario: Check Login is Successful with valid credentials.
 
   Given user is on login page       
   When user enters UserName and Password      
   And click on Submit button           
   Then user is navigate to the UserPage