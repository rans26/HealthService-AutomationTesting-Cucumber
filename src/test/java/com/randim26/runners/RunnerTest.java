package com.randim26.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/resources/feature/Login.feature"
        },
        glue = {
                "com.randim26.hook",
                "com.randim26.steps",
        },
        plugin = {"pretty", "html:target/cucumber-report.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)

public class RunnerTest extends AbstractTestNGCucumberTests {
}

