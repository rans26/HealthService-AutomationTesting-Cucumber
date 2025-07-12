package com.randim26.drivers.strategies;

import org.openqa.selenium.WebDriver;

public interface IDriverStrategy {
    WebDriver setStrategy(String browser);
}
