package Infra.Flows;

import Infra.Pages.LoginPage.LoginPage;
import Infra.Pages.TestFormPage.TestFormPage;
import io.qameta.allure.Step;
import org.testng.Assert;

public class LoginProcess {
    private LoginPage loginPage;
    private TestFormPage testFormPage;

    public LoginProcess() {
        this.loginPage = new LoginPage();
        this.testFormPage = new TestFormPage();
    }

    @Step("Perform login process")
    public void performLoginProcess(String userName, String password) {
        this.loginPage.setUserName(userName);
        this.loginPage.setPassword(password);
        this.loginPage.pressLoginButton();
    }

    public void clearUserNameAndPasswordFields(){
        this.loginPage.clearUserNameField();
        this.loginPage.clearPasswordField();
    }
}
