package com.randim26.drivers;

import com.randim26.drivers.strategies.DriverStrategies;
import org.openqa.selenium.WebDriver;

public class DriverSingleton {
    public static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        if (driver == null) {
            driver = new DriverStrategies().setStrategy(browser);
        }

        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}
