package SeleniumGrid.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SearchOnBrowser {
	
	
@Test
public void Googlesearch() throws MalformedURLException {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setBrowserName("chrome");
	WebDriver driver= new RemoteWebDriver(new URL("http://192.168.43.76:4444/wd/hub"),capabilities);
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Selenium Hub" + Keys.ENTER);
	driver.findElement(By.id("result-stats")).isDisplayed();
	driver.findElement(By.xpath("//a[@title='Go to Google Home']")).click();
	String Title = driver.getTitle();
	System.out.println("Title Is : Suite 3 :TC1 : "+Title);
	driver.quit();
	
	}

@Test
public void Googlesearch1() throws MalformedURLException {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setBrowserName("chrome");
	WebDriver driver= new RemoteWebDriver(new URL("http://192.168.43.76:4444/wd/hub"),capabilities);
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Selenium Hub" + Keys.ENTER);
	driver.findElement(By.id("result-stats")).isDisplayed();
	driver.findElement(By.xpath("//a[@title='Go to Google Home']")).click();
	String Title = driver.getTitle();
	System.out.println("Title Is : Suite 3 : TC2 : "+Title);
	driver.quit();
	}

}
