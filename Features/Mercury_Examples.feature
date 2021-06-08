
Feature: test the Mercury login
Background:
      Given User is navigating to MercuryTours Login Page

Scenario: verify Login page fields
    Then  validate the mercury title
    Then  validate the mercury logo
@tag2
 Scenario Outline: Login to MercuryTours
    When  User need to enter username as "<Username>" and password as "<Password>"
    
    Examples:
    |Username|Password|
    |mercury|mercury|
    |neeli|neeli|
    |mercury|neeli|
    
   
   
