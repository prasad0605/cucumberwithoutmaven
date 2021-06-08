
Feature: test the Mercury login
  Background:
      Given User is navigating to MercuryTours Login Page

Scenario: verify Login page fields
    Then  validate the mercury title
    Then  validate the mercury logo
    
@tag3
 Scenario: Login to MercuryTours
    When  User need to enter username as "mercury" and password as "mercury"
  
   
