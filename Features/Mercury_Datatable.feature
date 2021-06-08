
Feature: test the Mercury login
@tag1
 Scenario: Login to MercuryTours
    Given User is navigating to MercuryTours Login Page
    Then  validate the mercury title
    Then  validate the mercury logo
    When  User need to enter username and password and click on login button
        |Username|Password|
        |mercury|mercury|
        |neeli|neeli|
    
   
   
