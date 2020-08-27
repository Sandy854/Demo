package testThreadNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_Parallel {
WebDriver driver;
@BeforeTest
@Parameters("browser")
public void setup(String browser) throws Exception
{
	  if(browser.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","D:\\Utilitaire Selenium avec Java\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  else if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","D:\\Utilitaire Selenium avec Java\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  else
	  {
			throw new Exception("Browser is not correct");
	  }
}
  @Test   
  public void executSessionOne()
  {
          //First session of WebDriver

          //Goto guru99 site
          driver.get("http://demo.guru99.com/V4/");
          //find user name text box and fill it
          driver.findElement(By.name("uid")).sendKeys("Coucou 1");
          
   }
}
