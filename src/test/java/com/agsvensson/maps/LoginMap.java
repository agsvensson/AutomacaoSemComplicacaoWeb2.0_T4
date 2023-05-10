package com.agsvensson.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#menuUser")
    public WebElement btnLogin;
    @FindBy(css = ".closeBtn")
    public WebElement btnFechar;
    @FindBy(css = ".PopUp")
    public WebElement divFecharModal;
    @FindBy(css = "input[name='username']")
    public WebElement inpUserName;
    @FindBy(css = "input[name='password']")
    public WebElement inpPassword;
    @FindBy(xpath = "(//button[normalize-space()='SIGN IN'])")
    public WebElement btnSignIn;
    @FindBy(xpath = "//input[@name='remember_me']")
    public WebElement inpRemember;
    @FindBy(linkText = "CREATE NEW ACCOUNT")
    public WebElement linkCreateAccount;
}
