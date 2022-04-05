Feature: to test login functionality

  Scenario: Check login is successfull with valid credentials
    Given user is on ligin page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
