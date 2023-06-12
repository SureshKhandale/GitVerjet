package com.signup;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.testingshatra.page.LoginPage;
import com.verjet.mainpackege.uikeyword.UIKeyword;

public class SingUpTest extends TestBase {

	@Test
	public void VerifyThatAllTheSpecifiedFieldsArePresentOnTheSignUpPage() throws InterruptedException {
		UIKeyword.waitForElementToBePresent(By.cssSelector("button#signUpButton"));
		UIKeyword.clickOn("button#signUpButton");

		Thread.sleep(5000);
		UIKeyword.waitForElementToBePresent(By.cssSelector("input#firstNameInput"));
		UIKeyword.clickOn("input#firstNameInput");

		UIKeyword.waitForElementToBePresent(By.cssSelector("input#lastNameInput"));
		UIKeyword.clickOnLastName("input#lastNameInput");

		UIKeyword.waitForElementToBePresent(By.cssSelector("input#companyNameInput"));
		UIKeyword.clickOnCompanyName("input#companyNameInput");

		UIKeyword.waitForElementToBePresent(By.cssSelector("input#emailInput"));
		UIKeyword.clickOnEmailId("input#emailInput");

		UIKeyword.waitForElementToBePresent(By.cssSelector("input#confirmEmailInput"));
		UIKeyword.clickOnConfirmEmail("input#confirmEmailInput");

		UIKeyword.waitForElementToBePresent(By.cssSelector("input#createPasswordInput"));
		UIKeyword.clickOnCreatePassword("input#createPasswordInput");

		UIKeyword.waitForElementToBePresent(By.cssSelector("input#confirmPasswordInput"));
		UIKeyword.clickOnConfirmPassword("input#confirmPasswordInput");

		UIKeyword.waitForElementToBePresent(By.cssSelector("input#tel"));
		UIKeyword.clickOnPhoneNumber("input#tel");

//		Thread.sleep(5000);
//		UIKeyword.waitForElementToBePresent(By.cssSelector("div.small_text.mb-3.form-group"));
//		UIKeyword.clickOnCheckbox("div.small_text.mb-3.form-group");
	

		Thread.sleep(5000);
		UIKeyword.waitForElementToBePresent(By.cssSelector("button#signUpButton"));
		UIKeyword.clickOnSingUpButton("button#signUpButton");

	}

}
