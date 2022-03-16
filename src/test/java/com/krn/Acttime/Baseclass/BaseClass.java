package com.krn.Acttime.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
  @BeforeClass 
  public void openBrowser() {
	  System.out.println("OPEN BROWSER");
	  
  }
  @BeforeMethod 
  public void login() {
	  System.out.println("LOGIN");
  }
  @AfterMethod 
  public void logout() {
	  System.out.println("LOGOUT");
  }
  @AfterClass 
  public void closBrowser() {
	  System.out.println("CLOSE BROWSER");
  }
}
