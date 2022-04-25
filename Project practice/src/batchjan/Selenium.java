package batchjan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Velocity class\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		String currenturl=driver.getCurrentUrl();
        System.out.println(currenturl);
        System.out.println(driver.getTitle());
        String text=driver.findElement(By.xpath("//input[@type='text']")).getText();
      
        System.out.println(text);
        
	}


	}


