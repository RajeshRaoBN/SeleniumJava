# Created by rajeshnarayanarao at 25/7/18
Feature: Login functionality for demoqa.com

  Scenario: Vefify that user is able to successfully login to demoqa
    Given A user is on demoqa.com
    When User clicks on MyAccount
    Then User is taken to Login Page
    When User enters a valid user name
    Then User is able to login successfully