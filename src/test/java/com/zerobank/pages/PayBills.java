package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBills extends BasePage {

    @FindBy(id = "pay_bills_tab")
    public WebElement paybills;


    @FindBy(id = "sp_payee")
    public WebElement payee;

    @FindBy(id = "sp_account")
    public WebElement account;


    @FindBy(id = "sp_amount")
    public WebElement amount;

    @FindBy(id = "sp_date")
    public WebElement date;

    @FindBy(id = "sp_description")
    public WebElement description;

    @FindBy(id = "pay_saved_payees")
    public WebElement pay;

    @FindBy(xpath = "//div/span")
    public WebElement paymanetsucessful;

    @FindBy(xpath = "(//div/div/div/ul/li)[11]")
    public WebElement newPayee;

    @FindBy(name= "name")
    public WebElement Payee_name;

    @FindBy(id="np_new_payee_address")
    public WebElement Payee_adress;

    @FindBy(  id="np_new_payee_account")
    public WebElement payee_account;

    @FindBy(  id="np_new_payee_details")
    public WebElement payee_details;

    @FindBy(id="add_new_payee")
    public WebElement payee_add;


    @FindBy(id="alert_content")
    public WebElement new_payee_added;




}
