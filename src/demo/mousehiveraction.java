package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehiveraction {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	//Move to element	
//	WebElement	blogselement=driver.findElement(By.id("blogsmenu"));
//    WebElement   secondlink=driver.findElement(By.xpath("//span[contains(text(),'SeleniumByArun')]"));
//   
    Actions act=new Actions(driver);
//    act.moveToElement(blogselement);
//    act.moveToElement(secondlink).click().build().perform();
//    
    
    //perform right click 
    WebElement ele=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
    
    act.contextClick(ele).build().perform();
    
    
	}

}
