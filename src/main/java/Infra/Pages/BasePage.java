package Infra.Pages;

import Infra.DriverSingleton.DriverSingleton;
import SeleniumInfra.SeleniumInfraStructure;

public class BasePage {
    protected SeleniumInfraStructure seleniumInfra = DriverSingleton.getInstance().getSeleniumInfra();
}
