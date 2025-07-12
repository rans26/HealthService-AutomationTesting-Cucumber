package com.randim26.drivers.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeManagers {
    public static WebDriver buildDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
//        options.addArguments("--headless");
        options.setBinary("C:\\chrome-win64\\chrome.exe");
        return new ChromeDriver(options);
    }
}
