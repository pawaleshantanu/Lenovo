package batchjan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_ScrollBY {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Velocity class\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jquery.com/");
		
		Thread.sleep(1000);
	
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		
		Thread.sleep(1000);
		WebElement community = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[3]"));
		
		Js.executeScript("arguments[0].scrollIntoView(true)",community);
		Thread.sleep(2000);
		Js.executeScript("window.scrollBy(0,-100)");


	}

}
