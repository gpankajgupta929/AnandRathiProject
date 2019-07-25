package arTestCaseEquity;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import arEquity.EquityMethodTC1;
import arEquity.EquityMethodTC5;

public class EquityTestCase5
{
	 @Test (description = "Place Order Entry > MTF PRODUCT > Limit Order Type > Validity day only")
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
		   
		   rupee1.manage().deleteCookieNamed("JSESSIONID");

		   Set<Cookie> str12 = rupee1.manage().getCookies();
		   System.out.println(str12);		   
		   		  		  
		  rupee1.findElement(By.xpath("//*[@id=\"id\"]")).sendKeys(new EquityMethodTC1().getData1()); //Inputting User ID
		   
		 Thread.sleep(2000);
	   
	   rupee1.findElement(By.id("loginb1")).click(); //Clicking on Validate Button
	   
	   rupee1.findElement(By.id("newpassword")).sendKeys(new EquityMethodTC1().getData2()); //Inputting Password
	   
	   rupee1.findElement(By.xpath("//*[@id=\"2ndpage\"]/div[2]/div/label")).click(); //Checking Images's checkbox
	   
       rupee1.findElement(By.xpath("//*[@id=\"2ndpage\"]/div[3]")).click(); //Clicking on Submit Button
	   
	   rupee1.findElement(By.xpath("//*[@id=\"ans_1\"]")).sendKeys(new EquityMethodTC1().getData3(false)); //Inputting Security answer No.1
	   
	   rupee1.findElement(By.xpath("//*[@id=\"ans_2\"]")).sendKeys(new EquityMethodTC1().getData3(true)); //Inputting Security answer No.2
	   
	   rupee1.findElement(By.xpath("//*[@id=\"securityquesbtn\"]")).click(); //Clicking on Security Q&A Submit Button
	   
	   rupee1.findElement(By.xpath("//*[@id=\"mainmenu\"]/ul/li[8]")).click(); //Clicking on Homepage's Search Button
	   
	   rupee1.findElement(By.xpath("//*[@id=\"symbollookup\"]")).sendKeys(new EquityMethodTC5().getData0()); //Inputting searching value in Search Pop-Up Screen
	   
	   rupee1.findElement(By.xpath("/html/body/div[8]/ul/li[1]/div")).click(); //Capturing value from AutoSuggested List
	   
	   //-->/html/body/div[8]/ul/li[1] For capturing 1st Value
	   //->/html/body/div[10]/ul/li[2]  For capturing 2nd value
	   
	   WebElement element = rupee1.findElement (By.id ("TradeSymbol"));
	   JavascriptExecutor js = (JavascriptExecutor) rupee1;
	   
	   js.executeScript ("arguments[0].click();" , element);
	   
	   Thread.sleep(2000);
	   
	   rupee1.findElement(By.id("buy_active")).click(); //Clicking on Buy Action
	   
	   rupee1.findElement(By.xpath("//*[@id=\"orderLot\"]")).clear(); //Clearing By-Default value from Quantity field
	   
	   rupee1.findElement(By.xpath("//*[@id=\"orderLot\"]")).sendKeys(new EquityMethodTC5().getData1()); //Setting Order Quantity value
		  
	   rupee1.findElement(By.id("orderPrice")).clear(); //Clearing existing Price value
	   WebElement dl = rupee1.findElement(By.id("orderPrice"));
	   JavascriptExecutor js1 = (JavascriptExecutor) rupee1;		 
	   
	   js1.executeScript("arguments[0].value = " + new EquityMethodTC5().getData2(), dl);
	   
	   Select drpProduct = new Select(rupee1.findElement(By.id("orderProduct"))); 
	   drpProduct.selectByVisibleText("MTF"); //Selecting Product type from Dropdown
	   
	   rupee1.findElement(By.xpath("//*[@id=\"more_less_fields\"]/h6/a")).click(); //Clicking on More Fields
		  
	   rupee1.findElement(By.xpath("//input[@name=\"discqty\" or @id=\"orderDisclosedQuantity\"]")).clear();
	   rupee1.findElement(By.xpath("//input[@name=\"discqty\" or @id=\"orderDisclosedQuantity\"]")).sendKeys(new EquityMethodTC5().getData3()); //Setting Disclosed Quantity
		  
		  rupee1.findElement(By.id("btnConfirmOrder")).click(); //Clicking Submit Order button
		   
		   Thread.sleep(2000);
		   
		   rupee1.findElement(By.id("action_model1")).click(); //Clicking on Order Confirmation button
		   
		   Thread.sleep(2000);
		   
		  rupee1.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button[1]")).click(); //Clicking Ok button of Confirm Message screen
		  
		  rupee1.findElement(By.xpath("//*[@id=\"backoff\"]/a")).click(); //Clicking on Reports
		   
		   Thread.sleep(2000);
		   
		   rupee1.findElement(By.xpath("//*[@id=\"backoff\"]/ul/li[1]/a")).click(); //Clicking on Orderbook option
		   
		   Thread.sleep(2000);
		   
		   String statuString1 = rupee1.findElement(By.xpath("//*[@id=\"orderBookGrid\"]/div[5]/div/div[1]/div[4]/div")).getText(); //Path for Status Grid Text
		   
			 if(statuString1.equalsIgnoreCase("open"))
			   {
				   System.out.println("Text is present.");
				   
				   rupee1.findElement(By.xpath("//*[@id=\"orderBookGrid\"]/div[5]/div/div[1]/div[5]/div")).click(); //Clicking on Orderbook list for Modify
				   }
			   else
			   {
				   System.out.println("Text is absent.");
				   
				   rupee1.findElement(By.xpath("//*[@id=\"mainmenu\"]/ul/li[10]")).click(); 
				   
				   rupee1.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button")).click(); //Clicking Ok button of Confirm Message screen 
					  
				  rupee1.close();
			   }
			 
			 Thread.sleep(2000);
			 
			rupee1.findElement(By.xpath("//*[@id=\"quantity_ipfield\"]/span[2]/button")).click(); //Clicking on Plus icon increase Quantity
			
			 Thread.sleep(2000);
			   
			 rupee1.findElement(By.xpath("//button[contains(text(),'SUBMIT')]")).click(); //Clicking on Submit button of Modification screen
			   
		      Thread.sleep(2000);
		      
			  //button[contains(text(),'SUBMIT')]
		 	 //button[@id="btnConfirmOrder" and @class]
		 	   //*[@id=\"accordion2\"]/div/div[5]/button[1]
		 	 //div[@id="accordion2"]/div/div[5]/button
		 	 //button[text(),'SUBMIT']
		      
		      Thread.sleep(2000);
			   
			   rupee1.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button[2]")).click(); //Clicking OK on Order Confirmation screen
		       
			 //*[@id="Confirmscreen_view"]/div/div/div/div/div[3]
			   //div[@id="Confirmscreen"]/div/div/div/div/div[3]/button[2]
			 //button[text()='OK']
			   //div[@class='accordion-group']/div[5]/button
			   
			   rupee1.findElement(By.xpath("//button[@type=\"button\" and @id='cancel_action']")).click(); //Clicking on Pop-Up Message screen
			 
			   //-->/html/body/section[7]/div/div/div/div/div/div[3]/button
			   //*[@id="Confirmscreen_view"]/div/div/div/div/div[3]/*
			 //button[@type="button" and @id='cancel_action']
			   //div[@id="Confirmscreen_view"]/div/div/div/div/div[3]/button
			   //*[@id="Confirmscreen_view"]/div/div/div/div/div[3]/button
			 //div[@class='accordion-group']/div[5]/button
			   
			   Thread.sleep(2000);
			   
		     rupee1.findElement(By.xpath("//*[@id=\"backoff\"]/a")).click(); //Clicking on Reports
			   
			   Thread.sleep(2000);
			   
			   rupee1.findElement(By.xpath("//*[@id=\"backoff\"]/ul/li[1]/a")).click(); //Clicking on Orderbook option
			   
			   Thread.sleep(2000);
			   
			   rupee1.findElement(By.xpath("/html/body/section[25]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[5]/div/div[1]/div[5]")).click(); //Clicking on Modify button for modification
			   
			   String statuString2 = rupee1.findElement(By.xpath("//*[@id=\"orderBookGrid\"]/div[5]/div/div[1]/div[4]/div")).getText(); //Path for Status Grid Text
			   
				//*[@id="orderBookGrid"]/div[5]/div/div[1]/div[4]
				 if(statuString2.equalsIgnoreCase("open"))
				   {
					   System.out.println("Text is present 1.");
					   
					   //rupee.findElement(By.xpath("//*[@id=\"orderBookGrid\"]/div[5]/div/div[1]/div[5]/div")).click(); //Clicking on Orderbook list for Modify
					   }
				   else
				   {
					   //rupee.switchTo().window(statuString);
					   System.out.println("Text is absent 1.");
					   
					   rupee1.findElement(By.xpath("//*[@id=\"mainmenu\"]/ul/li[10]")).click(); //
					   
					   rupee1.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button")).click(); //Clicking Ok button of Confirm Message screen 
						  
				       rupee1.close();
					   }
				 
				 Thread.sleep(2000);
				 
				 rupee1.findElement(By.xpath("//div[@id=\"quantity_ipfield\"]/span[1][@class='input-group-btn']")).click(); //Clicking on Minus Sign to decrease order
					
				 //button[@type=\"button\" and @id=\"qty_minus\"]
				//div[@id="quantity_ipfield"]/span[1][@class='input-group-btn']
				 //button[@type="button" and @id="qty_minus"]
				//button[@id=\"qty_minus\"]
				 
				 rupee1.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/div[1]/div/div[1]/div[14]/div/div/div[5]/button")).click(); //Clicking on Submit button of Modification screen
				 
				//-->/html/body/div[4]/div/div/div/div/div[2]/div[1]/div/div[1]/div[14]/div/div/div[5]/button
					//button[contains(text(),'SUBMIT')]
					//button[@id="btnConfirmOrder" and @class]
				 
				 Thread.sleep(2000);
				 
		          rupee1.findElement(By.xpath("//div[3]/button[2][@id='action_model1' or contains(text(),'OK')]")).click(); //Clicking on Order Confirmation button
		          
		          rupee1.findElement(By.xpath("/html/body/section[7]/div/div/div/div/div/div[3]/button")).click(); //Clicking on Pop-Up Message screen
		        
		          //-->/html/body/section[7]/div/div/div/div/div/div[3]/button
		        //button[@id=\"cancel_action\" and @type=\"button\"]
		          //-->/html/body/section[7]/div/div/div/div/div/div[3]/button
		        //div[@id=\"Confirmscreen_view\"]/div/div/div/div/div[3]/*
		          //div[3]/button[@id='action_model1'][contains(text(),'OK')]
		        //div[3]/button[contains(text(),'OK')]
		          
		          rupee1.findElement(By.xpath("/html/body/section[1]/nav/div/div[3]/ul/li[10]/a/span")).click(); //Clicking on Power Button to Signout
		         
		          Thread.sleep(2000);
				  
				   rupee1.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button")).click(); //Clicking Ok button of Confirm Message screen
		          
		          rupee1.close();
			}	   
	 }

		 
