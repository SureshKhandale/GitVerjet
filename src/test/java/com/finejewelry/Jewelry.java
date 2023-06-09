package com.finejewelry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Jewelry {
	public ChromeDriver driver;

	@Test
	public void verifySearchGoldJewelry() throws InterruptedException {

//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//
//		ChromeDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "D:/JARS/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://dev.verjet.com/fine-jewelry/rings/engagement-rings");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Gold jewelry");

		driver.findElement(By.cssSelector("[id=searchicon]")).click();
		driver.executeAsyncScript("window.scrollBy(0,300)");
		driver.executeAsyncScript("window.scrollBy(0,300)");

		Thread.sleep(4000);
		driver.close();

	}

	@Test
	public void verifyButtonOfSignInClickable() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\JARS\\drivers\\chromedriver 111.exe");

		driver.get("https://dev.verjet.com/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='signInButton']")).click();
		driver.findElement(By.xpath("//input[@id='emailPhoneNumberInput']")).sendKeys("khandalesuresh44@gmail.com");
		driver.findElement(By.xpath("//button[@id='continueSignUpButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-cy='passwordInput']")).sendKeys("suresh@44");
		driver.findElement(By.xpath("//button[@id='signInButton']")).click();
		driver.close();

	}

	@Test
	public void myUrIsOpen() {
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\jar\\chromedriver_win32.exe");
		driver.get("https://testingshastra.com/");

		driver.manage().window().maximize();
	}
	

}
//"D:\\JARS\\drivers\\chromedriver 111.exe

//	@AfterClass
//	public void tearDown() throws Exception {
//		driver.close();
//	}
//
//}
