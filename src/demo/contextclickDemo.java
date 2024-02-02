package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclickDemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
	WebElement btn=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	  Actions act=new Actions(driver);
	  Thread.sleep(2000);
	  
	  act.contextClick(btn);
	  Thread.sleep(2000);
	 WebElement cpyele=driver.findElement(By.xpath("//span[contains(text(),'Quit')]"));
	  act.moveToElement(cpyele).click().build().perform();
	  Thread.sleep(2000);
//	  
		driver.switchTo().alert().accept();
		
	WebElement	dbele=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		act.doubleClick(dbele).build().perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}


}
