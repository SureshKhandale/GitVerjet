package com.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.verjet.mainpackege.uikeyword.UIKeyword;

public class TestBase {
	
	
	@BeforeMethod
	public void setUpMethod() throws Exception {
		UIKeyword.openBrowser("Chrome");
		UIKeyword.lunchUrl("https://dev.verjet.com/");
		
	}
	
		@AfterMethod
		public void tearDownMethod() throws Exception {
			UIKeyword.driver.close();
		}
}
