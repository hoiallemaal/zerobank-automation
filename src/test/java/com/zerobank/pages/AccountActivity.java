package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountActivity extends  BasePage{

    @FindBy(id = "account_activity_tab")
    public WebElement account_activity_title;

    @FindBy(css = "#aa_accountId option")   //xpath  (//*[@id='aa_accountId'] /option)[1]
    public WebElement savings;


    @FindBy(id= "#aa_accountId")
    public WebElement acountOptions;


    @FindBy(xpath= "//table/thead/tr/th")
    public WebElement transactions;


}
