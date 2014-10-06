/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gmail;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author sampathvarikolu
 */
public class testBase {

    
    private static WebDriver driver = null;
 
    public static void main(String[] args) throws InterruptedException {
 
      driver = new FirefoxDriver();
 
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      driver.get("https://gmail.com");
      
      SignintocontinuetoGmail.createAnAccount(driver).click();
      Thread.sleep(2000L);
      createYourGoogleAccount.firstName(driver).sendKeys("varikolu");
      Thread.sleep(2000L);
      createYourGoogleAccount.lastName(driver).sendKeys("sampath");
      Thread.sleep(2000L);
      createYourGoogleAccount.chooseYourUserName(driver).clear();
      Thread.sleep(2000L);
      //createYourGoogleAccount.chooseYourUserName(driver).sendKeys("sampath.animal@gmail.com");
      createYourGoogleAccount.createApassword(driver).sendKeys("telangana1234");
      Thread.sleep(2000L);
      createYourGoogleAccount.confirmYourPassword(driver).sendKeys("telangana1234");
      Thread.sleep(2000L);
      
      createYourGoogleAccount.Day(driver).sendKeys("02");
      Thread.sleep(2000L);
      createYourGoogleAccount.Year(driver).sendKeys("1983");
      
      Thread.sleep(2000L);
      
      
      createYourGoogleAccount.phoneCapchaCheckBox(driver);
      createYourGoogleAccount.checkBoxAgreement(driver);
      /*createYourGoogleAccount.phoneCapchaCheckBox(driver).click();
      Thread.sleep(2000L);
      
      createYourGoogleAccount.checkBoxAgreement(driver).click();
      Thread.sleep(2000L); */
      
      createYourGoogleAccount.nextButton(driver).click();
      Thread.sleep(3000L);
      
      String verifyUserNamefield = createYourGoogleAccount.VerifyUserName(driver).getText();
      
      if (verifyUserNamefield.equals("You can't leave this empty.")){
          System.out.println("verifyUserNamefiled is checked");
      }
      
      driver.quit();
      
     }
    
    
   
    
}
