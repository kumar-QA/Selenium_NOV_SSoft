package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frme1demo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
//		driver.manage().timeouts()
//		driver.switchTo().frame(0);
//	WebElement	ele=driver.findElement(By.xpath("//p[contains(text(),'Your content goes here.')]"));
//	System.out.println(ele.getText());

		driver.get("https://the-internet.herokuapp.com/nested_frames");

		WebElement framebottom = driver.findElement(By.name("frame-bottom"));
		driver.switchTo().f
		System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.switchTo().defaultContent();
		WebElement topframe = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(topframe);
		
		driver.switchTo().frame(1);
		System.out.println(
		driver.findElement(By.id("content")).getText());

	}

}
