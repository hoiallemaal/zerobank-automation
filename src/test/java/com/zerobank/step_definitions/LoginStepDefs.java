package com.zerobank.step_definitions;


import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

       LoginPage loginPage=new LoginPage();
       loginPage.login();
    }

    @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {

        LoginPage loginPage=new LoginPage();
        loginPage.loginthesite();

    }

    @Then("account summary page should be displayed")
    public void account_summary_page_should_be_displayed() {
        LoginPage loginPage=new LoginPage();
        BrowserUtils.waitFor(3);
        Assert.assertTrue(loginPage.account_summary.isDisplayed());
    }


    @When("the user logs in with invalid credentials")

        public void users_with_wrong_username_or_wrong_password() {
            LoginPage loginPage=new LoginPage();
            loginPage.notloginthesite();
    }

    @Then("Users with wrong username or wrong password")
    public void the_user_logs_in_with_invalid_credentials() {
        LoginPage loginPage=new LoginPage();
        loginPage.wrongcredientialsmethod();
       }
}