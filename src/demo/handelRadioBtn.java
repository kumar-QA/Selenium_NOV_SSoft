package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handelRadioBtn {

	public static void main(String[] args) {
//------------- to select particular radioBtn------------
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.id("radio1")).click();
//		driver.findElement(By.xpath("//input[@value='female']")).click();
		
	List<WebElement> btns=driver.findElements(By.xpath("//input[@type='radio']"));
	
	/********************count of radioBtn**********************/
     int count= btns.size();
		System.out.println("no of radio btn ="+count);
		
		/********************Text of radio Btn***********************/	
		for(int i=0;i<count;i++) {
			System.out.println(btns.get(i).getAttribute("value"));
		}
		for(WebElement ele:btns) {
			System.out.println(ele.getAttribute("value"));
		}
		
		/************Select a radio btn from the list**************************/	
		
		for(WebElement ele:btns) {
			if(ele.getAttribute("value").equals("Bike")) {
				ele.click();
				System.out.println(ele.getAttribute("value")+" is :"+ele.isSelected());
				
			}else {
				System.out.println(ele.getAttribute("value")+"  is :"+ele.isSelected());
			}
		}
		
		
		
		
	}

}
