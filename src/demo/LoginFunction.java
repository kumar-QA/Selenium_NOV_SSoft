package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// to launch browser
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");// to trigger the url
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Example 1:")).click();
		System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
