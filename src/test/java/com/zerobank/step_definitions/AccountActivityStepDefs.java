package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;

public class AccountActivityStepDefs {

    @Given("Account Activity page should have the title Zero – Account activity")
    public void account_Activity_page_should_have_the_title_Zero_Account_activity() {

        AccountActivity accountActivity=new AccountActivity();
        BrowserUtils.waitFor(2);
        accountActivity.account_activity_title.click();

        BrowserUtils.waitFor(2);
        String actuals= Driver.get().getTitle();
        //System.out.println(actuals);
        String expected="Zero - Account Activity";
        Assert.assertEquals(expected,actuals);

    }

    @When("the user should see the drop down default option as savings")
    public void the_user_should_see_the_drop_down_default_option_as_savings() {
       AccountActivity accountActivity=new AccountActivity();
      String actual= accountActivity.savings.getText();
       String expected="Savings";
      //  System.out.println(actual);
       Assert.assertEquals(expected,actual);
        // throw new cucumber.api.PendingException();
    }

    @When("Account drop down should have six options")
    public void account_drop_down_should_have_six_options() {
       AccountActivity accountActivity=new AccountActivity();
        List<WebElement> optionsList=Driver.get().findElements(By.xpath("(//*[@id='aa_accountId'] /option)"));
       /* for (WebElement listofOptins:optionsList) {
            System.out.println(listofOptins.getText());
        }*/
        Assert.assertEquals("Savings",optionsList.get(0).getText());
        Assert.assertEquals("Checking",optionsList.get(1).getText());
        Assert.assertEquals("Savings",optionsList.get(2).getText());
        Assert.assertEquals("Loan",optionsList.get(3).getText());
        Assert.assertEquals("Credit Card",optionsList.get(4).getText());
        Assert.assertEquals("Brokerage",optionsList.get(5).getText());
    }
    @Then("the user gets the transactions table headers")
    public void the_user_gets_the_transactions_table_headers() {
      AccountActivity accountActivity=new AccountActivity();

     /*   List<String>trans1= Collections.singletonList(accountActivity.transactions.getText());
        for (String tra:trans1) {
            System.out.println(trans1);
        }
        System.out.println(trans1);*/

      List<WebElement>trans=Driver.get().findElements(By.xpath("//table/thead/tr/th"));
        Assert.assertEquals("Date",trans.get(0).getText());
        Assert.assertEquals("Description",trans.get(1).getText());
        Assert.assertEquals("Deposit",trans.get(2).getText());
        Assert.assertEquals("Withdrawal",trans.get(3).getText());
    }
}
