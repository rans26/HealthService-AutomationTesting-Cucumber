package com.randim26.drivers.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxManagers {
    public static WebDriver buildDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--headless");
        options.setBinary("C:\\chrome-win64\\chrome.exe");
        return new FirefoxDriver(options);
    }
}
