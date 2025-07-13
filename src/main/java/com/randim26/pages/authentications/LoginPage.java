package com.randim26.pages.authentications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private String baseUrl = "https://katalon-demo-cura.herokuapp.com/profile.php#login";
    private WebDriver driver;

    private By usernameField = By.xpath("//input[@id='txt-username']");
    private By passwordField = By.xpath("//input[@id='txt-password']");
    private By buttonLogin = By.xpath("//button[@id='btn-login']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void openPage(){
        driver.get(baseUrl);
    }

    public void enterEmail(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickButtonLogin(){
        driver.findElement(buttonLogin).click();
    }
}
