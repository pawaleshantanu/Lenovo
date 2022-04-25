package batchjan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Velocity class\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement Selenium = driver.findElement(By.xpath("//*[@id=\"link\"]"));
		Actions doubleclick=new Actions(driver);
		//doubleclick.doubleClick(Selenium).perform();
	Thread.sleep(1000);
	//doubleclick.contextClick(Selenium).perform();
	driver.navigate().to("https://qavbox.github.io/demo/dragndrop/");
	Thread.sleep(1000);
	WebElement drag1 = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement drag2 = driver.findElement(By.xpath("//div[@id='droppable']"));
	//doubleclick.dragAndDrop(drag1, drag2).perform();
   doubleclick.clickAndHold(drag1).moveToElement(drag2).release().build().perform();
		
	
	
	}

}
