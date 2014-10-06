/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gmail;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author sampathvarikolu
 */
public class createYourGoogleAccount {
    private static WebElement element = null;
 
    public static WebElement firstName (WebDriver driver){
 
    element = driver.findElement(By.id("FirstName"));
 
    return element;
 
    }
    
    public static WebElement lastName (WebDriver driver){
 
    element = driver.findElement(By.id("LastName"));
 
    return element;
 
    }
    
    public static WebElement chooseYourUserName (WebDriver driver){
 
    element = driver.findElement(By.id("GmailAddress"));
 
    return element;
 
    }
    
    public static WebElement createApassword (WebDriver driver){
 
    element = driver.findElement(By.id("Passwd"));
 
    return element;
 
    }
    
    
    public static WebElement confirmYourPassword (WebDriver driver){
 
    element = driver.findElement(By.id("PasswdAgain"));
 
    return element;
 
    }
    
    public static void checkBoxAgreement (WebDriver driver){
        
        element = driver.findElement(By.id("TermsOfService"));
        
       if ( driver.findElement(By.id("TermsOfService")).isDisplayed() ){
             driver.findElement(By.id("TermsOfService")).click();
             } 
 
        //return element;
        
         
    }
    
    public static void phoneCapchaCheckBox (WebDriver driver){
        
        element = driver.findElement(By.id("SkipCaptcha"));
        
       if ( driver.findElement(By.id("SkipCaptcha")).isDisplayed() ){
           
             driver.findElement(By.id("SkipCaptcha")).click();
             } 
 
        //return element;
        
    }
    
    public static WebElement birthDayMonth (WebDriver driver){
        
        //element = driver.findElement(By.id("SkipCaptcha"));
        
        List <WebElement> Month = driver.findElements(By.xpath("//*[@id='BirthMonth']/div"));
        
        Month.set(0, element);
        return element;
        
    }
    
    public static WebElement Day (WebDriver driver){
        
        element = driver.findElement(By.id("BirthDay"));
    
        return element;
        
         
    }
    
    public static WebElement Year (WebDriver driver){
        
        element = driver.findElement(By.id("BirthYear"));
    
        return element;
        
         
    }
    
    public static WebElement nextButton (WebDriver driver){
        
        element = driver.findElement(By.id("submitbutton"));
    
        return element;
        
         
    }
    
    
    public static WebElement VerifyUserName (WebDriver driver){
        
        element = driver.findElement(By.xpath("//*[@id='errormsg_0_GmailAddress']"));
    
        return element;
        
         
    }
    
    
    
}

