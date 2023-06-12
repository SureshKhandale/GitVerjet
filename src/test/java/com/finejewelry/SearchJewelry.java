package com.finejewelry;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.base.TestBase;
import com.signup.SignInTestCase;
import com.verjet.mainpackege.uikeyword.UIKeyword;

public class SearchJewelry extends TestBase {
	@Test
	public static void verifyserchTitleOfHomePage() throws InterruptedException {

		Thread.sleep(5000);
		SignInTestCase signIn = new SignInTestCase();
		signIn.VerifyThatAllFieldsArePresentOnSignInPage();

		Thread.sleep(5000);
		UIKeyword.waitForElementToBePresent(By.cssSelector("input#search"));
		UIKeyword.clickOnSearchButton("input#search");

		Thread.sleep(3000);
		UIKeyword.waitForElementToBePresent(By.cssSelector("#suggestionDrop > div:nth-child(3) > div > span"));
		UIKeyword.clickOnElement("#suggestionDrop > div:nth-child(3) > div > span");

	}

	@Test
	public static void verifyButtonIsClickaBle() throws InterruptedException {

		Thread.sleep(5000);

		SignInTestCase signIn = new SignInTestCase();
		signIn.VerifyThatAllFieldsArePresentOnSignInPage();

		Thread.sleep(5000);
		UIKeyword.waitForElementToBePresent(By.cssSelector("input#search"));
		UIKeyword.clickOnParticularColour("input#search");
		UIKeyword.enterOnSearchButton("img#searchicon");

		Thread.sleep(5000);
		UIKeyword.scrollWindowForElement(0, 500);
		UIKeyword.clickOnElement("#blue-earings > div > div:nth-child(2) > h5");

		UIKeyword.waitForElementToBePresent(
				By.cssSelector("div.number.text-center.highlight-remove > span.plus.cursor.ml-2"));
		UIKeyword.clickOnAddElement("div.number.text-center.highlight-remove > span.plus.cursor.ml-2");

		UIKeyword.waitForElementToBePresent(By.cssSelector("button.btn.bag_btn"));
		UIKeyword.clickOnAddToCart("button.btn.bag_btn");

	}

	@Test
	public static void verifyButtonIsClickaBleOfWishlist() throws InterruptedException {

		Thread.sleep(5000);
		SignInTestCase signIn = new SignInTestCase();
		signIn.VerifyThatAllFieldsArePresentOnSignInPage();

	}

}
