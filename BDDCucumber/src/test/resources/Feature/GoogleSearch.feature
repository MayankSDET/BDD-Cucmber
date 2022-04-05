Feature: Search Functionality of the Google

  Scenario: Validate Google search is working
    Given browser is open
    And user is on google search
    When user enetrs the text in the search box
    And hits enter
    Then user is navigated to the search results
    