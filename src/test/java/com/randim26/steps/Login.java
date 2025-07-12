package com.randim26.steps;

import com.randim26.drivers.DriverSingleton;
import com.randim26.pages.authentications.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login {
    private LoginPage loginPage;
    private WebDriver driver;

    @Before()
    public void setup() {
        driver = DriverSingleton.getDriver();
        loginPage = new LoginPage(driver);
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page(){
        loginPage.openPage();
//        Assert.assertTrue(loginPage.isLoginPagesDisplayed());
    }

    @When("I enter email {string} and password {string}")
    public void i_enter_email_and_password(String email, String password) throws InterruptedException {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        Thread.sleep(1000);
    }

    @When("I click the login button")
    public void i_click_the_login_button() throws InterruptedException {
        loginPage.clickButtonLogin();
        Thread.sleep(1000);
    }
}
