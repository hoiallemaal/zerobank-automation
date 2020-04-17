package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.pages.AccountSummary;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSummaryStepDefs {

    @When("user gets the title of Account summary")
    public void user_gets_the_title_of_Account_summary() {

       String actual= Driver.get().getTitle();
       System.out.println(actual);
        String expected="Zero - Account Summary";
        Assert.assertEquals(expected,actual);

    }

    @When("user sees the account types")
    public void user_sees_the_account_types() {

        List<WebElement> buttons =Driver.get().findElements(By.xpath("//div/h2"));

       // List<>
        for (WebElement button:buttons) {
            System.out.println(button.getText());
        }

        Assert.assertEquals("Cash Accounts",buttons.get(0).getText());
        Assert.assertEquals("Investment Accounts",buttons.get(1).getText());
        Assert.assertEquals("Credit Accounts",buttons.get(2).getText());
        Assert.assertEquals("Loan Accounts",buttons.get(3).getText());
    }

    @Then("user dets the credit accounts table")
    public void user_dets_the_credit_accounts_table() {
        AccountSummary accountSummary=new AccountSummary();
        List<WebElement> headers=Driver.get().findElements(By.xpath("(//table)[3]/thead/tr/th"));
        for (WebElement headerss:headers) {
            System.out.println(headerss.getText());
        }

       Assert.assertEquals("Account",headers.get(0).getText());
        Assert.assertEquals("Credit Card",headers.get(1).getText());
        Assert.assertEquals("Balance",headers.get(2).getText());

    }

}
