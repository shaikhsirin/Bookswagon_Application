package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class ChangePassword extends BaseClass{

    @FindBy(linkText="Change Password")
    WebElement change_Pass;

    @FindBy(xpath="//input[@id='ctl00_phBody_ChangePassword_txtCurPwd']")
    WebElement current_password;

    @FindBy(xpath="//input[@id='ctl00_phBody_ChangePassword_txtNewPassword']")
    WebElement new_Password;

    @FindBy(xpath="//input[@id='ctl00_phBody_ChangePassword_txtConfirmPwd']")
    WebElement confirm_Password;

    @FindBy(xpath="//input[@id='ctl00_phBody_ChangePassword_imgSubmit']")
    WebElement change_Pass_btn;

    public ChangePassword() {
        PageFactory.initElements(driver,this);
    }

    public void changePassword(String currentPassword,String newPassword,String confirmPassword) {
        change_Pass.click();
        current_password.sendKeys(currentPassword);
        new_Password.sendKeys(newPassword);
        confirm_Password.sendKeys(confirmPassword);
        change_Pass_btn.click();
    }

}