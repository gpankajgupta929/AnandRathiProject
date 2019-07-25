package arTestCaseFUTSTK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import anandrathiFUTSTK.FUTSTKMethodTC1;
import anandrathiFUTSTK.FUTSTKMethodTC12;

import org.testng.annotations.*;

public class FUTSTKTestCase12
{
     @Test (description = "Sell Order Entry > MKT Order Type > MIS PRODUCT > Validity Day.")
    public void SellOrder() throws Exception 
 
	{
		 ChromeOptions notify = new ChromeOptions();
		 notify.addArguments("--disable-notifications");
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 WebDriver rupee = new ChromeDriver(notify);
		 
		 rupee.manage().window().maximize();
		   
		   rupee.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		   
		   rupee.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		   
		   rupee.get((new FUTSTKMethodTC1()).getData()); //Invoking URL on Browser
		   
		   rupee.findElement(By.xpath("//*[@id=\"id\"]")).sendKeys(new FUTSTKMethodTC1().getData1()); //Inputting User ID
		   
		 Thread.sleep(2000);
	   
	   rupee.findElement(By.id("loginb1")).click(); //Clicking on Validate Button
	   
	   rupee.findElement(By.id("newpassword")).sendKeys(new FUTSTKMethodTC1().getData2()); //Inputting Password
	   
	   rupee.findElement(By.xpath("//*[@id=\"2ndpage\"]/div[2]/div/label")).click(); //Checking Images's checkbox
	   
       rupee.findElement(By.xpath("//*[@id=\"2ndpage\"]/div[3]")).click(); //Clicking on Submit Button
		   
       rupee.findElement(By.xpath("//*[@id=\"ans_1\"]")).sendKeys(new FUTSTKMethodTC1().getData3(false)); //Inputting Security answer No.1
	   
	   rupee.findElement(By.xpath("//*[@id=\"ans_2\"]")).sendKeys(new FUTSTKMethodTC1().getData3(true)); //Inputting Security answer No.2
	   
	   rupee.findElement(By.xpath("//*[@id=\"securityquesbtn\"]")).click(); //Clicking on Security Q&A Submit Button
	   
	   rupee.findElement(By.xpath("//*[@id=\"mainmenu\"]/ul/li[8]")).click(); //Clicking on Homepage's Search Button
	   
	   	Select drpInstrument = new Select(rupee.findElement(By.id("addSymbolInst")));
	   drpInstrument.selectByVisibleText("FUTSTK");	   
	   
	   rupee.findElement(By.xpath("//*[@id=\"symbollookup\"]")).sendKeys(new FUTSTKMethodTC12().getData0()); //Inputting searching value in Search Pop-Up Screen
	   
	   rupee.findElement(By.xpath("/html/body/div[8]/ul/li[1]/div")).click(); //Capturing value from AutoSuggested List
	   
	   //-->/html/body/div[8]/ul/li[1] For capturing 1st Value
	   //->/html/body/div[10]/ul/li[2]  For capturing 2nd value  
	   
	   WebElement element = rupee.findElement (By.id("TradeSymbol"));
	   JavascriptExecutor js = (JavascriptExecutor) rupee;
	   
	   js.executeScript ("arguments[0].click();" , element);
	   
	   Thread.sleep(2000);
	   
	   rupee.findElement(By.id("sell_active")).click(); //Clicking on Sell Action on Placing Order Screen
	   
	   rupee.findElement(By.xpath("//*[@id=\"orderLot\"]")).clear(); //Clearing By-Default value from Quantity field
	   rupee.findElement(By.xpath("//*[@id=\"orderLot\"]")).sendKeys(new FUTSTKMethodTC12().getData1()); //Setting Order Quantity value
	   //sendKeys only accept CharSequences
	   
	   Select drpOrder = new Select(rupee.findElement(By.id("orderType")));
	   drpOrder.selectByVisibleText("MKT");
	   
	   Select drpProduct = new Select(rupee.findElement(By.id("orderProduct")));
	   drpProduct.selectByVisibleText("MIS");
	   
	   rupee.findElement(By.xpath("//input[@id=\"orderMktprotection\" and @name=\"mktprotection\"]")).clear();
	   rupee.findElement(By.xpath("//input[@id=\"orderMktprotection\" and @name=\"mktprotection\"]")).sendKeys(new FUTSTKMethodTC12().getData2()); //Setting Market Protection value
	   
	   rupee.findElement(By.xpath("//*[@id=\"more_less_fields\"]/h6/a")).click(); //Clicking on More Field
	   
	   Thread.sleep(2200);
	   
	  rupee.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/div[1]/div/div[1]/div[14]/div/div/div[5]/button")).click(); //Clicking Submit Order button
	  
	  Thread.sleep(2200);
	   
	   rupee.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button[2]")).click(); //Clicking on Order Confirmation button
	   
	   Thread.sleep(2000);
	   
	  rupee.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button[1]")).click(); //Clicking Ok button of Confirm Message screen
	  
	  rupee.findElement(By.xpath("//*[@id=\"backoff\"]/a")).click(); //Clicking on Reports
	   
	   Thread.sleep(2000);
	   
	   rupee.findElement(By.xpath("//*[@id=\"backoff\"]/ul/li[1]/a")).click(); //Clicking on Orderbook option
         
	   String statuString = rupee.findElement(By.xpath("//*[@id=\"orderBookGrid\"]/div[5]/div/div[1]/div[4]/div")).getText(); //Path for Status Grid Text
	   
		//*[@id="orderBookGrid"]/div[5]/div/div[1]/div[4]
		 if(statuString.equalsIgnoreCase("open"))
		   {
			   System.out.println("Text is present.");
			   
			   rupee.findElement(By.xpath("//div[@id=\"orderBookGrid\"]/div[5]/div/div[1]/div[5]/div")).click(); //Clicking on Orderbook list for Modify
			   }
		   else
		   {
			   //rupee.switchTo().window(statuString);
			   System.out.println("Text is absent.");
			   
			   rupee.findElement(By.xpath("//*[@id=\"mainmenu\"]/ul/li[10]")).click(); //Clicking on Power Button
			   
			   rupee.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button")).click(); //Clicking Ok button of Confirm Message screen 
				  
				  rupee.close();
			   }
		 
		 rupee.findElement(By.xpath("//*[@id=\"quantity_ipfield\"]/span[2]/button")).click(); //Clicking on Plus icon increase Quantity
		   
		   Thread.sleep(2000);
		   
		   rupee.findElement(By.xpath("//button[contains(text(),'SUBMIT')]")).click(); //Clicking on Submit button of Modification screen
		 
		 //button[contains(text(),'SUBMIT')]
		 //button[@id="btnConfirmOrder" and @class]
		   //*[@id=\"accordion2\"]/div/div[5]/button[1]
		 //div[@id="accordion2"]/div/div[5]/button
		 //button[text(),'SUBMIT']
		   
		   Thread.sleep(2000);
		   
		   rupee.findElement(By.xpath("//button[contains(text(),'OK')]")).click(); //Clicking OK on Order Confirmation screen
	      
		 //*[@id="Confirmscreen_view"]/div/div/div/div/div[3]
		   //div[@id="Confirmscreen"]/div/div/div/div/div[3]/button[2]
		 //button[text()='OK']
		   //div[@class='accordion-group']/div[5]/button
		   
		   rupee.findElement(By.xpath("//button[@type=\"button\" and @id='cancel_action']")).click(); //Clicking on Pop-Up Message screen
		 
		   //-->/html/body/section[7]/div/div/div/div/div/div[3]/button
		   //*[@id="Confirmscreen_view"]/div/div/div/div/div[3]/*
		 //button[@type="button" and @id='cancel_action']
		   //div[@id="Confirmscreen_view"]/div/div/div/div/div[3]/button
		   //*[@id="Confirmscreen_view"]/div/div/div/div/div[3]/button
		 //div[@class='accordion-group']/div[5]/button
		   
		   Thread.sleep(2000);
		   
		   rupee.findElement(By.xpath("//*[@id=\"backoff\"]/a")).click(); //Clicking on Reports
		   
		   Thread.sleep(2000);
		   
		   rupee.findElement(By.xpath("//*[@id=\"backoff\"]/ul/li[1]/a")).click(); //Clicking on Orderbook option
		   
		   Thread.sleep(2000);
		   
		   rupee.findElement(By.xpath("/html/body/section[25]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[5]/div/div[1]/div[5]")).click(); //Clicking on Modify button for modification
		   
		 //-->/html/body/section[25]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[5]/div/div[8]/div[5]
			 //div[@class='slick-cell l4 r4 alignLeft padd-3-8 selected active']
			 //*[@id="orderBookGrid"]/div[5]/div/div[1]/div[5]/div
			   //*[@id="orderBookGrid"]/div[5]/div/div[1]/div[5]
			 //*[@id="orderBookGrid"]/div[5]/div/div[1]/div[5]/div
			   
			   String statuString1 = rupee.findElement(By.xpath("//*[@id=\"orderBookGrid\"]/div[5]/div/div[1]/div[4]/div")).getText(); //Path for Status Grid Text
			   //*[@id="orderBookGrid"]/div[5]/div/div[1]/div[4]
				 if(statuString1.equalsIgnoreCase("open"))
				   {
					   System.out.println("Text is present 1.");
					   
					   //rupee.findElement(By.xpath("//*[@id=\"orderBookGrid\"]/div[5]/div/div[1]/div[5]/div")).click(); //Clicking on Orderbook list for Modify
					   }
				   else
				   {
					   //rupee.switchTo().window(statuString);
					   System.out.println("Text is absent 1.");
					   
					   rupee.findElement(By.xpath("//*[@id=\"mainmenu\"]/ul/li[10]")).click(); //
					   
					   rupee.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button")).click(); //Clicking Ok button of Confirm Message screen 
						  
						  rupee.close();
					   }
				 
				 Thread.sleep(4000);
				 
				 rupee.findElement(By.xpath("//div[@id=\"quantity_ipfield\"]/span[1][@class='input-group-btn']")).click(); //Clicking on Minus Sign to decrease order
				
				 //button[@type=\"button\" and @id=\"qty_minus\"]
				//div[@id="quantity_ipfield"]/span[1][@class='input-group-btn']
				 //button[@type="button" and @id="qty_minus"]
				//button[@id=\"qty_minus\"]
				 
				 rupee.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/div[1]/div/div[1]/div[14]/div/div/div[5]/button")).click(); //Clicking on Submit button of Modification screen
	         
				 //-->/html/body/div[4]/div/div/div/div/div[2]/div[1]/div/div[1]/div[14]/div/div/div[5]/button
				//button[contains(text(),'SUBMIT')]
				//button[@id="btnConfirmOrder" and @class]
				 
				 Thread.sleep(2000);
				 
	         rupee.findElement(By.xpath("//div[3]/button[2][@id='action_model1' or contains(text(),'OK')]")).click(); //Clicking on Order Confirmation button
	         
	         rupee.findElement(By.xpath("/html/body/section[7]/div/div/div/div/div/div[3]/button")).click(); //Clicking on Pop-Up Message screen
	       
	       //button[@id=\"cancel_action\" and @type=\"button\"]
	       //*[@id="cancel_action"]
	         //-->/html/body/section[7]/div/div/div/div/div/div[3]/button
	       //div[@id=\"Confirmscreen_view\"]/div/div/div/div/div[3]/*
	         //div[3]/button[@id='action_model1'][contains(text(),'OK')]
	       //div[3]/button[contains(text(),'OK')]
	         
	         rupee.findElement(By.xpath("/html/body/section[1]/nav/div/div[3]/ul/li[10]/a/span")).click(); //Clicking on Power Button to Signout
	         
	         Thread.sleep(2000);
			  
			 rupee.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button")).click(); //Clicking Ok button of Confirm Message screen
	         
	         rupee.close();
	}
}
