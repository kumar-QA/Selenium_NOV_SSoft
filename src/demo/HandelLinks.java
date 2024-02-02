package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelLinks {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	//count no of links
		
		int nooflinks=driver.findElements(By.tagName("a")).size();
		System.out.println("no of links are:"+nooflinks);
		
	//print link names	
	List<WebElement> ele=driver.findElements(By.tagName("a"));
//	System.out.println(ele.getText());
//	for (int i = 0; i < ele.size(); i++) {
//	System.out.println(ele.get(i).getText());
//	}
	
//	for(WebElement el:ele) {
//		System.out.println(el.getText());
//	}
//	
	
	
	
	}

}
