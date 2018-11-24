package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class NewTest {
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("https://www.softwaretestingmaterial.com/selenium-tutorial/");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
	   driver = new ChromeDriver();
	 
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
