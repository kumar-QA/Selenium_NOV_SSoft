package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelalert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(2000);
	   driver.switchTo().alert().accept();	
	   
	   driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	   Thread.sleep(2000);
	   driver.switchTo().alert().accept();
	   
	   
	   driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		  Thread.sleep(2000);
	 Alert  alt=driver.switchTo().alert();
	 alt.sendKeys("hi iam robo");
	  Thread.sleep(2000);
	  alt.accept();
	  
	   
	}

}
