package com.agsvensson.pages;

import com.agsvensson.core.Driver;
import com.agsvensson.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void clickBtnLogin() {
        Driver.visibilityOf(loginMap.btnLogin);
        loginMap.btnLogin.click();
    }

    public void clickBtnFechar() {
        loginMap.btnFechar.click();
    }

    public void clickDivFecharModal() {
        loginMap.divFecharModal.click();
    }

    public void setInpUserName(String username) {
        loginMap.inpUserName.sendKeys(username);
    }

    public void setInpPassword(String password) {
        loginMap.inpPassword.sendKeys(password);
    }

    public void clickInpRemember() {
        loginMap.inpRemember.click();
    }

    public void clickLinkCreateAccount() {
        loginMap.linkCreateAccount.click();
    }

    public void clickBtnSignIn() {
        loginMap.btnSignIn.click();
    }

    public boolean isBtnSignIn() {
        return loginMap.btnSignIn.isEnabled();
    }

    public void visibilityOfBtnFechar() {
        Driver.visibilityOf(loginMap.btnFechar);
    }

    public void invisibilityOfBtnFechar() {
        Driver.invisibilityOf(loginMap.btnFechar);
    }

}
