package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandelDropDown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
	WebElement dropbtn=driver.findElement(By.id("drop1"));
		
		Select sel=new Select(dropbtn);
		
//		sel.selectByValue("def");
//		sel.selectByIndex(2);
		sel.selectByVisibleText("doc 4");
	}

}
