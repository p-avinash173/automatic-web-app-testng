package TestNg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

;


public class AutomateWebApp {
	
	String driverPath="D:\\eclipse\\phase5\\chromedriver.exe";
	public WebDriver wd;
	
	@Test(priority = 1)
	  public void register() {
		
	      System.setProperty("webdriver.chrome.driver", 
	    		  "D:\\eclipse\\phase5\\chromedriver.exe");
		  
		  wd = new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("createAccountSubmit")).click();
	      wd.findElement(By.id("ap_customer_name")).sendKeys("Avinash");
	      wd.findElement(By.id("ap_phone_number")).sendKeys("9182438616");
	      wd.findElement(By.id("ap_email")).sendKeys("Avinash@gmail.com");
	      wd.findElement(By.id("ap_password")).sendKeys("Avinash@123");
	     wd.findElement(By.id("continue")).click();

	     
	  }
	@Test(priority = 2)
	  public void login() {
		  
	     System.setProperty("webdriver.chrome.driver", 
	    		 "D:\\eclipse\\phase5\\chromedriver.exe");
		  
		  wd = new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("ap_email")).sendKeys("Avinash@gmail.com");
		  wd.findElement(By.id("continue")).click();
	      wd.findElement(By.id("ap_password")).sendKeys("Avinash@123");


	  }
	  @Test(priority = 3)
	  public void search() throws InterruptedException {
		  	
		  	System.setProperty("webdriver.chrome.driver", 
		  			"D:\\eclipse\\phase5\\chromedriver.exe");
			  
			wd = new ChromeDriver();
			wd.manage().window().maximize();
	      	wd.get("https://www.amazon.in/");
		    System.out.println(wd.getTitle());
		    System.out.println(wd.getCurrentUrl());
		    wd.findElement(By.id("twotabsearchtextbox")).sendKeys("office chairs");
		    Thread.sleep(3000);
		    wd.findElement(By.id("nav-search-submit-button")).submit();
		   wd.findElement(By.linkText("Amazon Brand - Solimo Trance High Back Mesh Contemporary Office Chair (Black)")).click();
	      
	  }
}
