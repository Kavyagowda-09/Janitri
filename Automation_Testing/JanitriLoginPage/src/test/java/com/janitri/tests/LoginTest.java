   package com.janitri.tests;

   import com.janitri.base.BaseTest;
import com.janitri.pages.LoginPage;
   import org.testng.Assert;
   import org.testng.annotations.Test;

   public class LoginTest extends BaseTest {

       @Test
       public void testLoginButtonDisabledWhenFieldsAreEmpty() {
           LoginPage loginPage = new LoginPage(driver);
           Assert.assertTrue(loginPage.isLoginButtonDisabled(), "Login button should be disabled.");
       }

       @Test
       public void testInvalidLoginShowErrorMsg() {
           LoginPage loginPage = new LoginPage(driver);
           loginPage.enterUserId("invalidUser ");
           loginPage.enterPassword("invalidPass");
           loginPage.clickLogin();
           String errorMsg = loginPage.getErrorMessage();
           System.out.println("Error Message: " + errorMsg);
           Assert.assertNotNull(errorMsg, "Error message should be displayed.");
       }

       @Test
       public void testPasswordMaskedButton() {
           LoginPage loginPage = new LoginPage(driver);
           loginPage.enterPassword("password");
           loginPage.togglePasswordVisibility();
           // Add assertions to check if password is visible
       }
   }
   