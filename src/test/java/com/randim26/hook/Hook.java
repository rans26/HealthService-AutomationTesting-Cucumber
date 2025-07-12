package com.randim26.hook;

import com.randim26.drivers.DriverSingleton;
import com.randim26.drivers.utils.Browser;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

import java.net.MalformedURLException;

public class Hook {
    @BeforeAll
    public static void initialize() throws MalformedURLException {
        DriverSingleton.getDriver(Browser.CHROME);
    }
    @AfterAll
    public static void finalTeardown() {
        DriverSingleton.quitDriver();
    }
}
