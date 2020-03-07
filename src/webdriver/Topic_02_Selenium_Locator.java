package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Topic_02_Selenium_Locator {
  
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://live.demoguru99.com/index.php/customer/account/create/");
	}

	@Test
	public void TC_01_ID() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement( By.id("firstname")).sendKeys("user name");
		Thread.sleep(5000);
	}


	@Test
	public void TC_02_Class() {
		driver.get("");
	}


	@Test
	public void TC_03_Name() {
		driver.get("");
	}

	/*
	 * @Test public void TC_03_LoginFormDisplayed() { // Login form displayed
	 * 
	 * Assert.assertTrue(driver.findElement(By.xpath("//form[@name='frmLogin']")).
	 * isDisplayed()); }
	 * 
	 * @Test public void TC_04_LoginFormClick() throws InterruptedException { //
	 * Login form displayed WebElement elementName =
	 * driver.findElement(By.name("uid")); elementName.sendKeys("ntnt");
	 * Thread.sleep(5000);
	 * //Assert.assertTrue(driver.findElement(By.xpath("//form[@name='frmLogin']")).
	 * isDisplayed()); }
	 */
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
