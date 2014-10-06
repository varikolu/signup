/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author sampathvarikolu
 */
public  class SignintocontinuetoGmail {
  
    private static WebElement element = null;
 
    public static WebElement createAnAccount (WebDriver driver){
 
    element = driver.findElement(By.id("link-signup"));
 
    return element;
 
    }
}
