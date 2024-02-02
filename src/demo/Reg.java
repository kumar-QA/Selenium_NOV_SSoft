package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reg {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// to launch browser
		driver.get("https://demo.automationtesting.in/Register.html");// to trigger the url
		driver.manage().window().maximize();
	List<WebElement>ele=driver.findElements(By.xpath("//div[@style=\"display: none;\"]/ul/li/a"));
	for (WebElement element : ele) {
		if(element.getText().equals("English")) {
			element.click();
		}
	}
	}

}
