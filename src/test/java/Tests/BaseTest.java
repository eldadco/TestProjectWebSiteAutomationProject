package Tests;

import Infra.DriverSingleton.DriverSingleton;
import Infra.Flows.LoginProcess;
import Infra.Pages.LoginPage.LoginPage;
import Infra.Pages.TestFormPage.TestFormPage;
import SeleniumInfra.SeleniumInfraStructure;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    protected final LoginProcess loginProcess;
    protected final LoginPage loginPage;
    protected final TestFormPage testFormPage;
    private final SeleniumInfraStructure seleniumInfra = DriverSingleton.getInstance().getSeleniumInfra();
    public BaseTest() {
        this.loginProcess = new LoginProcess();
        this.loginPage = new LoginPage();
        this.testFormPage = new TestFormPage();
    }

    @BeforeClass
    public void navigateToLoginPage(){
    this.loginPage.navigate();
    }

}
