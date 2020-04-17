Feature: Authorized users should be able to login
@smoke

  Scenario: Login as an authorized user
    Given the user is on the login page
    When the user logs in with valid credentials
    Then account summary page should be displayed


  Scenario: Do not login if the credentials are wrong
    Given the user is on the login page
    When the user logs in with invalid credentials
    Then Users with wrong username or wrong password
