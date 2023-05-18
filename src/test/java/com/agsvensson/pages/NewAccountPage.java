package com.agsvensson.pages;

import com.agsvensson.core.Driver;
import com.agsvensson.maps.NewAccountMap;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {

    NewAccountMap newAccountMap;

    public NewAccountPage() {
        newAccountMap = new NewAccountMap();
        PageFactory.initElements(Driver.getDriver(), newAccountMap);
    }

    public String getTxtNewAccount(){
        Driver.visibilityOf(newAccountMap.txtCreateAccount);
        return newAccountMap.txtCreateAccount.getText();
    }
}
