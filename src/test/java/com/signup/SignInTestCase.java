package com.signup;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.verjet.mainpackege.uikeyword.UIKeyword;

public class SignInTestCase extends TestBase {
	@Test
	public void VerifyThatAllFieldsArePresentOnSignInPage() throws InterruptedException {
		UIKeyword.waitForElementToBePresent(By.cssSelector("button#signInButton"));
		UIKeyword.clickOnSignInButton("button#signInButton");

		Thread.sleep(5000);
		UIKeyword.waitForElementToBePresent(By.cssSelector("input#emailPhoneNumberInput"));
		UIKeyword.clickOnEmailPhoneNumber("input#emailPhoneNumberInput");
		
		UIKeyword.waitForElementToBePresent(By.cssSelector("button#continueSignUpButton"));
		UIKeyword.clickOnContinueSignUpButton("button#continueSignUpButton");

		UIKeyword.waitForElementToBePresent(By.cssSelector("input#passwordInput"));
		UIKeyword.clickOnPassword("input#passwordInput");
		
		Thread.sleep(5000);
		UIKeyword.waitForElementToBePresent(By.cssSelector("button#signInButton"));
		UIKeyword.clickOnSignInButton("button#signInButton");
	}

}
