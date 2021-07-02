package Infra.Pages.TestFormPage;

import Infra.Pages.BasePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestFormPage extends BasePage {
    public TestFormPage(){}

    public void pressLogoutButton(){
        WebElement logoutButton = this.seleniumInfra.findElem(TestFormPageLocators.logoutButton,null);
        if(logoutButton.isDisplayed()){
            this.seleniumInfra.clickElement(TestFormPageLocators.logoutButton,null,null);
        }
    }

    public String getGreetingMessage(){
        return this.seleniumInfra.getTextFromElement(TestFormPageLocators.greetingMessage,null,null);
    }

}
