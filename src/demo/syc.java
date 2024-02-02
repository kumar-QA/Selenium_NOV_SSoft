package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class syc {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.partialLinkText("Example 2:")).click();
		driver.findElement(By.tagName("button")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	WebElement ele	=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4)[2]")));
System.out.println(ele.getText());
		
		
		
	
		

}
}
