package com.randim26.steps;

import com.randim26.drivers.DriverSingleton;
import com.randim26.pages.authentications.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login {
    private LoginPage loginPage;
    private WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page(){
        driver = DriverSingleton.getDriver();
        loginPage = new LoginPage(driver);
        loginPage.openPage();
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) throws InterruptedException {
        loginPage.enterEmail(username);
        loginPage.enterPassword(password);
        Thread.sleep(1000);
    }

    @And("I click the login button")
    public void i_click_the_login_button() throws InterruptedException {
        loginPage.clickButtonLogin();
        Thread.sleep(1000);
    }

    @Then("User should be redirected to the Make Appointment page")
    public void redirected_to_appointment_page() {
        Assert.assertTrue(driver.getCurrentUrl().contains("appointment"));
    }
}
