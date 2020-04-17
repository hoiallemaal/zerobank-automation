Feature: User can use the account summary page properly
  @smoke
  Scenario: User can use account sumamry page
    Given the user is on the login page
    And the user logs in with valid credentials
    When user gets the title of Account summary
    And user sees the account types
    Then user dets the credit accounts table

