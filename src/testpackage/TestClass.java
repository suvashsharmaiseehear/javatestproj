package testpackage;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
//import org.openqa.selenium.interactions.H;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Interactive;
//import org.openqa.selenium.interactions.Keyboard;
//import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.Sequence;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.openqa.selenium.interactions.TouchScreen;
//import org.openqa.selenium.remote.RemoteWebDriver;


public class TestClass {

	@Test
	public void validateLogin(){
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "/home/iseehear/Downloads/chromedriver");
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://mouseapp.com/");
		WebElement txtUserName= driver.findElement(By.id("inputUsernameEmail"));
		txtUserName.sendKeys("test2");
		
		driver.findElement(By.id("inputPassword")).sendKeys("KM051519cp");
		driver.findElement(By.id("secureLogin")).click();
		// Iseehear: SoftMouseDB Transgenic Mouse Breeding & Colony Management Database Software<
//		String expectedTitle="Iseehear: SoftMouseDB Transgenic Mouse Breeding & Colony Management Database Software";
		String actual_title=driver.getPageSource();
		boolean result = actual_title.contains("<img src=\"images/softmouse-colony-management-software-and-database-logo-0003.png\">");
		System.out.println(actual_title);
		
		Assert.assertEquals(result, true);
	}
	
	
	public static int doSum(int a, int b) {
		int sum= a+b;
		return sum;
	}
	
	@Test
	public void validateSum() {
		int retval = TestClass.doSum(6, 7);
		Assert.assertEquals(1, 13);
	}

	}


