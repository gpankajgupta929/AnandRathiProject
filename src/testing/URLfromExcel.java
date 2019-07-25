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

public class URLfromExcel {
	@Test(description = "Place Order Entry > MTF PRODUCT > SL Order Type > Validity DAY")
	public void BuyOrder() throws Exception {
		ChromeOptions notify1 = new ChromeOptions();
		notify1.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver rupee1 = new ChromeDriver(notify1);

		rupee1.manage().window().maximize();

		rupee1.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		rupee1.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);

		rupee1.get((new URLMethod()).getData0());

		rupee1.findElement(By.xpath("//*[@id=\"id\"]")).sendKeys("HOIbs192"); // Inputting User ID

		Thread.sleep(2000);

		rupee1.findElement(By.id("loginb1")).click(); // Clicking on Validate Button

		rupee1.findElement(By.id("newpassword")).sendKeys("qaz@123"); // Inputting Password

		rupee1.findElement(By.xpath("//*[@id=\"2ndpage\"]/div[2]/div/label")).click(); // Checking Images checkbox

		rupee1.findElement(By.xpath("//*[@id=\"2ndpage\"]/div[3]")).click(); // Clicking on Submit Button

		rupee1.findElement(By.xpath("//*[@id=\"ans_1\"]")).sendKeys("a"); // Inputting Security answer No.1

		rupee1.findElement(By.xpath("//*[@id=\"ans_2\"]")).sendKeys("a"); // Inputting Security answer No.2

		rupee1.findElement(By.xpath("//*[@id=\"securityquesbtn\"]")).click(); // Clicking on Security Q&A Submit Button

		rupee1.findElement(By.xpath("//a[contains(text(),'watchlist')]")).click(); // Clicling on Watchlist Button.

		Select drpWatchlist = new Select(rupee1.findElement(By.id("watchlistCollection")));
		drpWatchlist.selectByVisibleText("Test");

		Thread.sleep(2222);

		WebElement element = rupee1.findElement(By.xpath("//div[contains(text(),'WIPRO')]"));
		JavascriptExecutor js = (JavascriptExecutor) rupee1;

		js.executeScript("arguments[0].scrollIntoView(true);", element);

		System.out.println(element.getText());

	}
}
