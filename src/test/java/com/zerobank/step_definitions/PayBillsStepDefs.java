package com.zerobank.step_definitions;

import com.zerobank.pages.PayBills;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Map;

public class PayBillsStepDefs {

    @Given("Paybills page should have the title Zero – Pay Bills")
    public void paybills_page_should_have_the_title_Zero_Pay_Bills() {
        PayBills payBills=new PayBills();
        payBills.paybills.click();
    }

    @When("user completes a  successful Pay operation")
    public void user_completes_a_successful_Pay_operation() {
        PayBills payBills=new PayBills();
        payBills.amount.sendKeys("100");
        BrowserUtils.waitFor(2);
        payBills.date.sendKeys("11-04-2020");
        BrowserUtils.waitFor(2);
        payBills.description.sendKeys("for fiets");
        BrowserUtils.waitFor(2);
        payBills.pay.click();


    }

    @Then("The payment was successfully submitted. should be  displayed.")
    public void the_payment_was_successfully_submitted_should_be_displayed() {


        PayBills payBills=new PayBills();
        String actual=  payBills.paymanetsucessful.getText();
        String expected="The payment was successfully submitted.";
        Assert.assertEquals(expected,actual);
    }

    @When("user completes a non successful Pay operation")
    public void user_completes_a_non_successful_Pay_operation() {
        PayBills payBills=new PayBills();
       // payBills.amount.sendKeys("100");
        BrowserUtils.waitFor(2);
        payBills.date.sendKeys("11-04-2020");
        BrowserUtils.waitFor(2);
        payBills.description.sendKeys("for fiets");
        BrowserUtils.waitFor(2);
        payBills.pay.click();
    }

    @Then("{string} should be displayed.")
    public void should_be_displayed(String themesassage) {
        PayBills payBills=new PayBills();

        /*JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        boolean isDisplayed=false;
        if(payBills.amount.equals("Please fill out this field message!")) {
            isDisplayed = (Boolean) js.executeScript("return arguments[0].required;", payBills.amount);
            Assert.assertTrue(isDisplayed);
        }else {
            Assert.assertTrue(isDisplayed);
        }*/

     String actual=payBills.amount.getAttribute("validationMessage");

        Assert.assertEquals(themesassage,actual);

    }

    @Given("Add New Payee tab")
    public void add_New_Payee_tab() {
       PayBills payBills=new PayBills();
       payBills.paybills.click();
       BrowserUtils.waitFor(1);
       payBills.newPayee.click();
       BrowserUtils.waitFor(3);
    }

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String, String> payeeData) {
        PayBills payBills=new PayBills();
        payBills.Payee_name.sendKeys(payeeData.get("Payee Name"));
        BrowserUtils.waitFor(1);
        payBills.Payee_adress.sendKeys(payeeData.get("Payee Address"));
        BrowserUtils.waitFor(1);
        payBills.payee_account.sendKeys(payeeData.get("Account"));
        BrowserUtils.waitFor(1);
        payBills.payee_details.sendKeys(payeeData.get("Payee details"));
    }

    @Then("message The new payee The Law Offices of Hyde, Price & Scharks was successfully created should be displayed")
    public void message_The_new_payee_The_Law_Offices_of_Hyde_Price_Scharks_was_successfully_created_should_be_displayed() {
        PayBills payBills=new PayBills();
        payBills.payee_add.click();
        BrowserUtils.waitFor(1);
        String expected="The new payee The Law Offices of Hyde, Price & Scharks was successfully created.";
        String actual=payBills.new_payee_added.getText();
        Assert.assertEquals(expected,actual);

    }
}
