
Feature: Authorized users should be able to login

  @smoke
  Scenario: User can succesfully make a payment
    Given the user is on the login page
    And the user logs in with valid credentials
    And Paybills page should have the title Zero – Pay Bills
    When user completes a  successful Pay operation
    Then The payment was successfully submitted. should be  displayed.

  @smoke
    Scenario: User can not succesfully make a payment if the amount or date is absent
    Given the user is on the login page
    And the user logs in with valid credentials
    And Paybills page should have the title Zero – Pay Bills
    When user completes a non successful Pay operation
    Then "Please fill out this field." should be displayed.

    #yeni senaryo buna calis*******************38553387
  Scenario: User can not succesfully make a payment if the amount or date is absent
    Given the user is on the login page
    And the user logs in with valid credentials
    And Paybills page should have the title Zero – Pay Bills
    When user completes a  successful Pay operation
    Then The payment was successfully submitted. should be  displayed.

  @smoke
  Scenario: Add a new payee
    Given the user is on the login page
    And the user logs in with valid credentials
    Given Add New Payee tab
    And creates new payee using following information
      |Payee Name| The Law Offices of Hyde, Price & Scharks|
      |Payee Address| 100 Same st, Anytown, USA, 10001 |
      |Account| Checking |
      |Payee details| XYZ account |
    Then message The new payee The Law Offices of Hyde, Price & Scharks was successfully created should be displayed
#bunu tirnak icinde yaz tekrar dene