package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DecimalWriting {
	@Test(description = "Place Order Entry > MTF PRODUCT > SL Order Type > Validity DAY")
	public void BuyOrder() throws Exception {
		ChromeOptions notify1 = new ChromeOptions();
		notify1.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver rupee1 = new ChromeDriver(notify1);

		rupee1.manage().window().maximize();

		rupee1.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		rupee1.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);

		rupee1.get("https://tradexpressuat.rathi.com/ITSAR/userMaster/login");

		rupee1.findElement(By.xpath("//*[@id=\"id\"]")).sendKeys("HOIbs192"); // Inputting User ID

		Thread.sleep(2000);

		rupee1.findElement(By.id("loginb1")).click(); // Clicking on Validate Button

		rupee1.findElement(By.id("newpassword")).sendKeys("qaz@123"); // Inputting Password

		rupee1.findElement(By.xpath("//*[@id=\"2ndpage\"]/div[2]/div/label")).click(); // Checking Images checkbox

		rupee1.findElement(By.xpath("//*[@id=\"2ndpage\"]/div[3]")).click(); // Clicking on Submit Button

		rupee1.findElement(By.xpath("//*[@id=\"ans_1\"]")).sendKeys("a"); // Inputting Security answer No.1

		rupee1.findElement(By.xpath("//*[@id=\"ans_2\"]")).sendKeys("a"); // Inputting Security answer No.2

		rupee1.findElement(By.xpath("//*[@id=\"securityquesbtn\"]")).click(); // Clicking on Security Q&A Submit Button

		rupee1.findElement(By.xpath("//*[@id=\"mainmenu\"]/ul/li[8]")).click(); // Clicking on Homepage's Search Button

		rupee1.findElement(By.xpath("//*[@id=\"symbollookup\"]")).sendKeys("TATA Mot"); // Inputting searching value in
																						// Search Pop-Up Screen

		rupee1.findElement(By.xpath("/html/body/div[8]/ul/li[1]/div")).click(); // Capturing value from AutoSuggested
																				// List

		// -->/html/body/div[8]/ul/li[1] For capturing 1st Value
		// ->/html/body/div[10]/ul/li[2] For capturing 2nd value

		rupee1.findElement(By.id("TradeSymbol")).click(); // Clicking on Trade Icon

		Thread.sleep(2000);

		rupee1.findElement(By.id("buy_active")).click(); // Clicking on Buy Action

		rupee1.findElement(By.xpath("//*[@id=\"orderLot\"]")).clear(); // Clearing By-Default value from Quantity field

		rupee1.findElement(By.xpath("//*[@id=\"orderLot\"]")).sendKeys("20"); // Setting Order Quantity value

		Select drpOrderType = new Select(rupee1.findElement(By.id("orderType")));
		drpOrderType.selectByVisibleText("SL");

		// rupee1.findElement(By.id("orderPrice")).clear();
		// rupee1.findElement(By.id("orderPrice"));
		WebElement dl = rupee1.findElement(By.id("orderPrice"));
		JavascriptExecutor js = (JavascriptExecutor) rupee1;

		// js.executeScript("document.documentElement.value="+new
		// Test1Method().getData0(),dl);
		js.executeScript("arguments[0].value = " + new Test1Method().getData0(), dl);

		// rupee1.findElement(By.id("orderPrice")).clear();
		/*
		 * WebElement txtUsername = rupee1.findElement(By.id("orderPrice"));
		 * 
		 * Actions builder = new Actions(rupee1); Actions seriesOfActions0 =
		 * builder.moveToElement(txtUsername); Actions seriesOfActions1 =
		 * builder.click(); Actions seriesOfActions2 = builder.keyDown(txtUsername,
		 * Keys.ALT).keyUp(txtUsername, "46"); Actions seriesOfActions3 =
		 * builder.keyDown(txtUsername, Keys.ALT);
		 * 
		 * seriesOfActions1.perform(); seriesOfActions3.perform();
		 * seriesOfActions0.perform(); seriesOfActions2.perform();
		 */

		// rupee1.findElement(By.id("orderPrice")).clear(); //Clearing existing Price
		// value
		// rupee1.findElement(By.id("orderPrice")).sendKeys("25.25");

		Select drpProductType = new Select(rupee1.findElement(By.id("orderProduct")));
		drpProductType.selectByVisibleText("MTF");

		rupee1.findElement(By.xpath("//input[@id=\"orderTriggerPrice\"]")).clear();
		rupee1.findElement(By.xpath("//input[@id=\"orderTriggerPrice\"]")).sendKeys("20");

		rupee1.findElement(By.xpath("//*[@id=\"more_less_fields\"]/h6/a")).click(); // Clicking on More Fields

		Thread.sleep(2200);

		rupee1.findElement(By.xpath("//input[@name=\"discqty\" or @id=\"orderDisclosedQuantity\"]")).clear();
		rupee1.findElement(By.xpath("//input[@id=\"orderDisclosedQuantity\" and @name=\"discqty\"]")).sendKeys(""); // Setting
																													// Disclose
																													// Quantity
	}
}
/*
 * moveToElement(txtUsername) .click() .keyDown(txtUsername, Keys.SHIFT)
 * .sendKeys(txtUsername, "hello") .keyUp(txtUsername, Keys.SHIFT)
 * .doubleClick(txtUsername)
 */