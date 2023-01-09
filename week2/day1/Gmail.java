package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tamil24selva@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		
			
	
		
		
		
		
		
	}

}
