@staging
Feature: Login Feature - Staging
  In order to perform successful login
  As a User
  I have to enter correct username and password
  
  Background:
      Given user navigates to the facebook website
    When user validates the homepage title

  Scenario: Login to the facebook website as a valid user on Staging
    Then user enters "valid" username
    And user enters "valid" password
    And user validates captcha image
    And user clicks on the signin button
    
    
   Scenario: Login to the facebook website as a invalid user on Staging
    Then user enters "invalid" username
    And user enters "invalid" password
    And user validates captcha image
    And user clicks on the signin button




