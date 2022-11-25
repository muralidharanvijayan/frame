package org.lal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FarmeWork {
       static  WebDriver f ;
//       @BeforeClass
//       public static void Login() {
//    	   WebDriverManager.chromedriver().setup();
//    	   f = new ChromeDriver(); 
//    	   f.get("https://www.facebook.com/");
//    	   
//    	   f.manage().window().maximize();
//       }
//
//       @Before
//	public void LoginId2() throws IOException {
//    	   WebElement maek = f.findElement(By.xpath("(//div[@class='_6ltg'])[2]"));
//    	   File mail = maek.getScreenshotAs(OutputType.FILE);
//    	   File n = new File("C:\\Users\\mural\\eclipse-workspace\\MavenProject\\xlsx\\pin.png");
//    	   FileUtils.copyFile(mail, n);
//    	   
//    	   
//       }
//       @After
//       public void LoginId3() throws IOException {
//	WebElement element = f.findElement(By.xpath("(//div[@class='_6ltg'])[2]"));
//		File as = element.getScreenshotAs(OutputType.FILE);
//		File m = new File("C:\\Users\\mural\\eclipse-workspace\\MavenProject\\xlsx\\pic.png");
//		FileUtils.copyFile(as, m);
//	}
//	@Test
//	public  void LoginId() {
//	
//              f.findElement(By.id("email")).sendKeys("murali");
//              f.findElement(By.id("pass")).sendKeys("@1233");
//              
//                              
//	}
//	@AfterClass
//	public  static void LoginId1() throws InterruptedException {
//		Thread.sleep(3000);
//		f.close();
//
//		
//	}
//	
//      
       @BeforeClass
       public static void mut() {
    	   WebDriverManager.chromedriver().setup();
    	   f = new ChromeDriver();
  	f.get("https://adactinhotelapp.com/index.php");
    	     	f.manage().window().maximize();
    	     	
    }
                @Test
              public  void mut1() throws AWTException {
                	  WebElement mu = f.findElement(By.id("location"));
           	  Select b = new Select(mu);
                	  b.selectByVisibleText("Adelaide");
                	  Robot n = new Robot();
                	  n.keyPress(KeyEvent.VK_TAB);
                	  n.keyRelease(KeyEvent.VK_TAB);
              	  n.keyPress(KeyEvent.VK_DOWN);
                	  n.keyRelease(KeyEvent.VK_DOWN);
                	  n.keyPress(KeyEvent.VK_TAB);
                	  n.keyRelease(KeyEvent.VK_TAB);
                	  n.keyPress(KeyEvent.VK_DOWN);
               	  n.keyRelease(KeyEvent.VK_DOWN);
                      f.findElement(By.id("Submit")).click();
                  }
                  @Before
                  public void mut3() {
                	  WebElement de = f.findElement(By.id("username"));
                	  de.sendKeys("Muralidharan73");
                	  f.findElement(By.id("password")).sendKeys("737389");
                	  f.findElement(By.id("login")).click();
                	            
				}
   @AfterClass
                public static void mut2() throws InterruptedException {
             Thread.sleep(4000);	
	             WebElement id = f.findElement(By.id("order_no"));
	             String string = id.getAttribute("value");
	             System.out.println(string);
	             f.close();
    	        }
   
       @After
       
          public void mut4() throws AWTException, InterruptedException {
    	   f.findElement(By.id("radiobutton_0")).click();
    	   f.findElement(By.id("continue")).click();
    	   f.findElement(By.id("first_name")).sendKeys("murali");
    	   f.findElement(By.id("last_name")).sendKeys("dharan");
    	   f.findElement(By.id("address")).sendKeys("arun pg ,narayanaswamy road, chennai");
    	   f.findElement(By.id("cc_num")).sendKeys("1254789632547896");
     	  Robot m = new Robot();
             m.keyPress(KeyEvent.VK_TAB);
             m.keyRelease(KeyEvent.VK_TAB);
             m.keyPress(KeyEvent.VK_DOWN);
             m.keyRelease(KeyEvent.VK_DOWN);
             m.keyPress(KeyEvent.VK_TAB);
             m.keyRelease(KeyEvent.VK_TAB);
             m.keyPress(KeyEvent.VK_DOWN);
             m.keyRelease(KeyEvent.VK_DOWN);
             m.keyPress(KeyEvent.VK_TAB);
             m.keyRelease(KeyEvent.VK_TAB);
             m.keyPress(KeyEvent.VK_DOWN);
             m.keyRelease(KeyEvent.VK_DOWN);
            
             f.findElement(By.id("cc_cvv")).sendKeys("854");
             f.findElement(By.id("book_now")).click();
             WebElement dfd = f.findElement(By.id("cc_exp_year"));
             Select b = new Select(dfd);
             b.selectByVisibleText("2022");
             f.findElement(By.id("cc_cvv")).sendKeys("854");
             f.findElement(By.id("book_now")).click();
             Thread.sleep(3000);
    	   

	}
      
 
         
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}
       


			
		
              
              
 	    
        
	
			
		
       
        

        
           
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


