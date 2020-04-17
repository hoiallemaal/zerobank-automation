package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(id = "signin_button")
    public WebElement signin;

    @FindBy(id = "user_login")
    public WebElement log_user;

    @FindBy(id = "user_password")
    public WebElement log_password;

    @FindBy(name = "submit")
    public WebElement submit_sign;

    @FindBy(id = "account_summary_tab")
    public WebElement account_summary;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement wrong_credentials;


    public void login() {
        signin.click();

    }

    public void loginthesite() {

        log_user.sendKeys("username");
        log_password.sendKeys("password");
        submit_sign.click();


    }
    public void notloginthesite() {

        log_user.sendKeys("username");
        log_password.sendKeys("passwod");
        submit_sign.click();


    }

    public void wrongcredientialsmethod() {

        String expectedtext="Login and/or password are wrong.";
        String actualtext=wrong_credentials.getText();
        System.out.println(wrong_credentials.getText());
        BrowserUtils.waitFor(3);
        Assert.assertEquals(expectedtext, actualtext);
    }
}