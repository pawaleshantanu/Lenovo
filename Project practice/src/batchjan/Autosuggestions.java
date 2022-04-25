package batchjan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Velocity class\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Honda");
		Thread.sleep(1000);
	List<WebElement> List = driver.findElements(By.xpath("//li"));
	for (WebElement w : List) {
		String actual="honda amaze";
		String desired=w.getText();		
System.out.println(w.getText());
if(actual.equals(desired)) {
	System.out.println("============Match found================");
	break;
}
}		

	}

}
