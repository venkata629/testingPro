package com.qa;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testbase.GooglePage;
import testbase.TestBase;

public class GoogleTest extends TestBase{
	
	GooglePage googlePage;
	public GoogleTest() {
		super();
	}


	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();	
		googlePage = new GooglePage();
		
	}
	
	  
	@Test
	 
	  public void verifyGooglePageTitleTest() throws IOException{ 
	   String title = googlePage.validateGooglePageTitle(); 
	   Assert.assertEquals(title,"Google"); 
	   	   
	   }
	
	@AfterMethod
	public void tearDown(){
		 
			driver.quit();
		}




}
