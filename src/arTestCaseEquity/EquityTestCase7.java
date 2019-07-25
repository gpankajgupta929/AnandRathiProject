package arTestCaseEquity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import arEquity.EquityMethodTC1;
import arEquity.EquityMethodTC7;

public class EquityTestCase7
{
	@Test (description = "Place Order Entry > CNC PRODUCT > Limit Order Type > Validity IOC")
    public void BuyOrder() throws Exception
    {
		ChromeOptions notify1 = new ChromeOptions();
		notify1.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver rupee1 = new ChromeDriver(notify1);
		
		rupee1.manage().window().maximize();
		
		rupee1.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		   
		rupee1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		   	
		rupee1.get((new EquityMethodTC1()).getData()); //Invoking URL on Browser
		 
		 rupee1.findElement(By.xpath("//*[@id=\"id\"]")).sendKeys(new EquityMethodTC1().getData1()); //Inputting User ID
		 
		 Thread.sleep(2000);
		   
		   rupee1.findElement(By.id("loginb1")).click(); //Clicking on Validate Button
		   
		   rupee1.findElement(By.id("newpassword")).sendKeys(new EquityMethodTC1().getData2()); //Inputting Password
		   
		   rupee1.findElement(By.xpath("//*[@id=\"2ndpage\"]/div[2]/div/label")).click(); //Checking Images checkbox
		   
	       rupee1.findElement(By.xpath("//*[@id=\"2ndpage\"]/div[3]")).click(); //Clicking on Submit Button
		   
		   rupee1.findElement(By.xpath("//*[@id=\"ans_1\"]")).sendKeys(new EquityMethodTC1().getData3(false)); //Inputting Security answer No.1
		   
		   rupee1.findElement(By.xpath("//*[@id=\"ans_2\"]")).sendKeys(new EquityMethodTC1().getData3(true)); //Inputting Security answer No.2
		   
		   rupee1.findElement(By.xpath("//*[@id=\"securityquesbtn\"]")).click(); //Clicking on Security Q&A Submit Button
		   
		   rupee1.findElement(By.xpath("//*[@id=\"mainmenu\"]/ul/li[8]")).click(); //Clicking on Homepage's Search Button
		   
		   rupee1.findElement(By.xpath("//*[@id=\"symbollookup\"]")).sendKeys(new EquityMethodTC7().getData0()); //Inputting searching value in Search Pop-Up Screen
		   
		   rupee1.findElement(By.xpath("/html/body/div[8]/ul/li[1]/div")).click(); //Capturing value from AutoSuggested List
		   
		 //-->/html/body/div[8]/ul/li[1] For capturing 1st Value
		   //->/html/body/div[10]/ul/li[2]  For capturing 2nd value
		   
		   WebElement element = rupee1.findElement (By.id ("TradeSymbol"));
		   JavascriptExecutor js = (JavascriptExecutor) rupee1;
		   
		   js.executeScript ("arguments[0].click();" , element);
		   
		   Thread.sleep(2000);
		   
		   rupee1.findElement(By.id("buy_active")).click(); //Clicking on Buy Action
		   
		   rupee1.findElement(By.xpath("//*[@id=\"orderLot\"]")).clear(); //Clearing By-Default value from Quantity field
		   
		   rupee1.findElement(By.xpath("//*[@id=\"orderLot\"]")).sendKeys(new EquityMethodTC7().getData1()); //Setting Order Quantity value
		  
		   rupee1.findElement(By.id("orderPrice")).clear(); //Clearing existing Price value
		   WebElement dl = rupee1.findElement(By.id("orderPrice"));
		   JavascriptExecutor js1 = (JavascriptExecutor) rupee1;		 
		   
		   js1.executeScript("arguments[0].value = " + new EquityMethodTC7().getData2(), dl);
		   
		   rupee1.findElement(By.xpath("//*[@id=\"more_less_fields\"]/h6/a")).click(); //Clicking on More Fields
		   
		   Select drpOrderValidity = new Select(rupee1.findElement(By.id("orderValidity"))); 
			drpOrderValidity.selectByVisibleText("IOC"); //Selecting Order type from Dropdown
		 
		 rupee1.findElement(By.id("btnConfirmOrder")).click(); //Clicking Submit Order button
		   
		   Thread.sleep(2000);
		   
		   rupee1.findElement(By.id("action_model1")).click(); //Clicking on Order Confirmation button
		   
		   Thread.sleep(2000);
		   
		  rupee1.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button[1]")).click(); //Clicking Ok button of Confirm Message screen
		  
		  rupee1.findElement(By.xpath("/html/body/section[1]/nav/div/div[3]/ul/li[10]/a/span")).click(); //Clicking on Power Button to Signout
	         
          Thread.sleep(2000);
		  
		   rupee1.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button")).click(); //Clicking Ok button of Confirm Message screen
          
          rupee1.close();
    }
}