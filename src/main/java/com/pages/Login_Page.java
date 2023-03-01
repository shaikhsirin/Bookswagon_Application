package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class Login_Page extends BaseClass {

    @FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtEmail']")
    WebElement email;

    @FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtPassword']")
    WebElement pass;

    @FindBy(xpath = "//a[@id='ctl00_phBody_SignIn_btnLogin']")
    WebElement login;

    public Login_Page() {
        PageFactory.initElements(driver, this);
    }

    public void login(String username,String password) {
        email.sendKeys(username);
        pass.sendKeys(password);
        login.click();
    }

    public void multipleUserLogin(String username,String password) {
        email.sendKeys(username);
        pass.sendKeys(password);
        login.click();
    }
}
