package com.verjet.mainpackege.uikeyword;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class UIKeyword {
	public static RemoteWebDriver driver;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			Chromedriver driver = new ChromeDriver(options);

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		}
	}

	public static void lunchUrl(String url) {
		UIKeyword.get(url);
	}

	public static void scrollWindow(int x, int y) {
		UIKeyword.executeScript("window.scrollBy(arguments[0],arguments[1])", x, y);

	}

	public static void closed() {
		UIKeyword.closed();
	}

	public static void clickOnSrchBtn(By cssSelector) {
		driver.
		
	}

}
