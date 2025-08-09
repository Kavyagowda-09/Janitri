package com.janitri.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Locators
    private By userIdInput = By.id("userId");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("loginButton");
    private By passwordToggle = By.id("passwordToggle");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserId(String userId) {
        driver.findElement(userIdInput).sendKeys(userId);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean isLoginButtonDisabled() {
        return !driver.findElement(loginButton).isEnabled();
    }

    public void togglePasswordVisibility() {
        driver.findElement(passwordToggle).click();
    }

    public String getErrorMessage() {
        // Implement logic to capture error message
        return driver.findElement(By.id("errorMessage")).getText();
    }
}
