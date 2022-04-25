package batchjan;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Selenium_practice {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Velocity class\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		SimpleDateFormat str = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		File dest=new File("D:\\screenshot"+str+".png");
		FileHandler.copy(source, dest);
		((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	}
}
