Feature: For the sub models of Account Activity
  @smoke
  Scenario:
    Given the user is on the login page
    And the user logs in with valid credentials
    And Account Activity page should have the title Zero – Account activity
    When the user should see the drop down default option as savings
    And Account drop down should have six options
    Then the user gets the transactions table headers

