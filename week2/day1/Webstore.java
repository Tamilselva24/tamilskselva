package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webstore {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chrome.google.com/webstore/category/extensions?hl=en");
		driver.findElement(By.xpath("//input[@id='searchbox-input']")).sendKeys("skype");
		

	}

}
