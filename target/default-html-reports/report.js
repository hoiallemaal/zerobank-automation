$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivity.feature");
formatter.feature({
  "name": "For the sub models of Account Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.the_user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account Activity page should have the title Zero – Account activity",
  "keyword": "And "
});
formatter.match({
  "location": "AccountActivityStepDefs.account_Activity_page_should_have_the_title_Zero_Account_activity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the drop down default option as savings",
  "keyword": "When "
});
formatter.match({
  "location": "AccountActivityStepDefs.the_user_should_see_the_drop_down_default_option_as_savings()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have six options",
  "keyword": "And "
});
formatter.match({
  "location": "AccountActivityStepDefs.account_drop_down_should_have_six_options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user gets the transactions table headers",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountActivityStepDefs.the_user_gets_the_transactions_table_headers()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/AccountSummary.feature");
formatter.feature({
  "name": "User can use the account summary page properly",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can use account sumamry page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.the_user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the title of Account summary",
  "keyword": "When "
});
formatter.match({
  "location": "AccountSummaryStepDefs.user_gets_the_title_of_Account_summary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees the account types",
  "keyword": "And "
});
formatter.match({
  "location": "AccountSummaryStepDefs.user_sees_the_account_types()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user dets the credit accounts table",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSummaryStepDefs.user_dets_the_credit_accounts_table()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Authorized users should be able to login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as an authorized user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.the_user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "account summary page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.account_summary_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/PayBills.feature");
formatter.feature({
  "name": "Authorized users should be able to login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "User can succesfully make a payment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.the_user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Paybills page should have the title Zero – Pay Bills",
  "keyword": "And "
});
formatter.match({
  "location": "PayBillsStepDefs.paybills_page_should_have_the_title_Zero_Pay_Bills()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user completes a  successful Pay operation",
  "keyword": "When "
});
formatter.match({
  "location": "PayBillsStepDefs.user_completes_a_successful_Pay_operation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The payment was successfully submitted. should be  displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "PayBillsStepDefs.the_payment_was_successfully_submitted_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User can not succesfully make a payment if the amount or date is absent",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.the_user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Paybills page should have the title Zero – Pay Bills",
  "keyword": "And "
});
formatter.match({
  "location": "PayBillsStepDefs.paybills_page_should_have_the_title_Zero_Pay_Bills()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user completes a non successful Pay operation",
  "keyword": "When "
});
formatter.match({
  "location": "PayBillsStepDefs.user_completes_a_non_successful_Pay_operation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Please fill out this field.\" should be displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "PayBillsStepDefs.should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User can not succesfully make a payment if the amount or date is absent",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.the_user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Paybills page should have the title Zero – Pay Bills",
  "keyword": "And "
});
formatter.match({
  "location": "PayBillsStepDefs.paybills_page_should_have_the_title_Zero_Pay_Bills()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user completes a  successful Pay operation",
  "keyword": "When "
});
formatter.match({
  "location": "PayBillsStepDefs.user_completes_a_successful_Pay_operation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The payment was successfully submitted. should be  displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "PayBillsStepDefs.the_payment_was_successfully_submitted_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a new payee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.the_user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add New Payee tab",
  "keyword": "Given "
});
formatter.match({
  "location": "PayBillsStepDefs.add_New_Payee_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "creates new payee using following information",
  "rows": [
    {
      "cells": [
        "Payee Name",
        "The Law Offices of Hyde, Price \u0026 Scharks"
      ]
    },
    {
      "cells": [
        "Payee Address",
        "100 Same st, Anytown, USA, 10001"
      ]
    },
    {
      "cells": [
        "Account",
        "Checking"
      ]
    },
    {
      "cells": [
        "Payee details",
        "XYZ account"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "PayBillsStepDefs.creates_new_payee_using_following_information(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "message The new payee The Law Offices of Hyde, Price \u0026 Scharks was successfully created should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PayBillsStepDefs.message_The_new_payee_The_Law_Offices_of_Hyde_Price_Scharks_was_successfully_created_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});