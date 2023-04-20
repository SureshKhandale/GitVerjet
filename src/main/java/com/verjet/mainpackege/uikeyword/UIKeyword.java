package com.verjet.mainpackege.uikeyword;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

public class UIKeyword {
	public static RemoteWebDriver driver;
	public static FluentWait<WebDriver> wait;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/SAI/Downloads/chromedriver_win32 (3)/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		}
		wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.withTimeout(Duration.ofSeconds(500));
		wait.ignoring(NoSuchElementException.class);

	}

	public static void lunchUrl(String url) {
		driver.get(url);
	}

//	public static void scrollWindow(int x, int y) {
//		driver.executeScript("window.scrollBy(arguments[0],arguments[1])", x, y);
//
//	}

	public static void waitForElementToBePresent(By by) {
		wait.until(ExpectedConditions.presenceOfElementLocated(by));

	}

	public static void clickOn(By by) {
		driver.findElement(by).click();
	}

	public static void clickOn(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		driver.findElement(By.cssSelector(locator)).sendKeys("Suresh");

	}

	public static void clickOnLastName(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		driver.findElement(By.cssSelector(locator)).sendKeys("Khandale");

	}

	public static void clickOnCompanyName(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		driver.findElement(By.cssSelector(locator)).sendKeys("Testing Shastra");

	}

	public static void clickOnEmailId(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		driver.findElement(By.cssSelector(locator)).sendKeys("khandalesuresh44@gmail.com");

	}

	public static void clickOnConfirmEmail(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		driver.findElement(By.cssSelector(locator)).sendKeys("khandalesuresh44@gmail.com");

	}

	public static void clickOnCreatePassword(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		driver.findElement(By.cssSelector(locator)).sendKeys("Suresh@44");

	}

	public static void clickOnConfirmPassword(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		driver.findElement(By.cssSelector(locator)).sendKeys("Suresh@44");

	}

	public static void clickOnPhoneNumber(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		driver.findElement(By.cssSelector(locator)).sendKeys("9325772706");
	}

	public static void clickOnCheckbox(String locator) {
		driver.findElement(By.cssSelector(locator)).click();

	}

	public static void clickOnSingUpButton(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
	}
	
	
	
	public static void clickOnSignInButton(By by) {
		driver.findElement(by).click();
	}
	
	
	
	

	public static void clickOnSignInButton(String locator) {
		driver.findElement(By.cssSelector(locator)).click();

	}

	public static void clickOnEmailPhoneNumber(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		driver.findElement(By.cssSelector(locator)).sendKeys("khandalesuresh44@gmail.com");
		
	}

	public static void clickOnContinueSignUpButton(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
	}

	public static void clickOnPassword(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		driver.findElement(By.cssSelector(locator)).sendKeys("suresh@44");
	}
	
	

}
