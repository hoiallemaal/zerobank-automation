package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class AccountSummary extends BasePage{
    @FindBy(xpath = "//title")
    public WebElement account_summary_title;

    @FindBy(xpath = "(//table)[3]/thead/tr/th")
    public WebElement
            account_summary_coloumns;


        //public List<WebElement> account_summary_coloumns;  boyle yapilirsa da olur/// calisss
}
