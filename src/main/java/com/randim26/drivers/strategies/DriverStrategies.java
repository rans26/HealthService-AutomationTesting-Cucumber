package com.randim26.drivers.strategies;

import com.randim26.drivers.managers.ChromeManagers;
import com.randim26.drivers.managers.FirefoxManagers;
import com.randim26.drivers.utils.Browser;
import org.openqa.selenium.WebDriver;

public class DriverStrategies implements IDriverStrategy {
    @Override
    public WebDriver setStrategy(String strategy) {
        switch (strategy) {
            case Browser.CHROME:
                return ChromeManagers.buildDriver();
            case Browser.FIREFOX:
                return FirefoxManagers.buildDriver();
            default:
                return ChromeManagers.buildDriver();
        }
    }
}
