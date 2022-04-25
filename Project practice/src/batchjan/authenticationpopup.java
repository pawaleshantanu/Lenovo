package batchjan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Velocity class\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 String s="admin";
 driver.get("https://"+s+":"+s+"@the-internet.herokuapp.com/basic_auth");
	}

}
