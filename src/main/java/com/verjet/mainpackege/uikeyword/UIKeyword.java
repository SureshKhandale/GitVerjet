
package com.verjet.mainpackege.uikeyword;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

public class UIKeyword {
	public static RemoteWebDriver driver;
	public static FluentWait<WebDriver> wait;
	private static String String;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\JARS\\drivers\\chromedriver_win32 (3) 114\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		}
		wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.withTimeout(Duration.ofSeconds(500));
		wait.ignoring(NoSuchElementException.class, IllegalAccessError.class);

	}

	public static void waitForToBePresent(By by) {
		wait.until(ExpectedConditions.presenceOfElementLocated(by));

	}

	public static void lunchUrl(String url) {
		driver.get(url);

	}

	public static void closed() {
		UIKeyword.closed();
	}

	public static void scrollWindow(int x, int y) {
		driver.executeScript("window.scrollBy(arguments[0],arguments[1])", x, y);

	}

	public static void scrollWindowForElement(int x, int y) {
		driver.executeScript("window.scrollBy(arguments[0],arguments[1])", x, y);

	}

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

	public static void clickOnParticularColour(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		driver.findElement(By.cssSelector(locator)).sendKeys("blue jewelry");

	}

	public static void clickOnSpacificAmount(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		driver.findElement(By.cssSelector(locator)).sendKeys("");

	}

	public static void clickOnSearchButton(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		driver.findElement(By.cssSelector(locator)).sendKeys("diamond ring");
	}

	public static void clickOnToSelectLowToHighButton(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		driver.findElement(By.cssSelector(locator)).sendKeys("");

	}

	/*
	 * this method will return list of text
	 */
	public static void getTexts(By by) {
		List<WebElement> elements = driver.findElements(by);
		List<String> texts = new ArrayList<String>();
		for (WebElement element : elements) {
			String text = element.getText();
			texts.add(text);
		}

	}

	public static int getNumberFromString() {
		String regex = "([0-9]+[.][0-9]+)";
		String input = String;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		int num = 0;
		while (matcher.find()) {
			num = Integer.parseInt(matcher.group());
		}
		return num;
	}

	private static float getFloatFromStrig() {
		String regex = "([0-9]+[.][0-9]+)";
		String input = String;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		float num = 0;
		while (matcher.find()) {
			num = Float.parseFloat(matcher.group());
		}
		return num;
	}

	public static void clickOnElement(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		// driver.findElement(By.cssSelector(locator)).sendKeys("");
	}

	public static void enterOnSearchButton(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
	}

	public static void clickOnAddElement(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
	}

	public static void clickOnAddToCart(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
	}

}
