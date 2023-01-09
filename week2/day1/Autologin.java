package week2.day1;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autologin {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new Edgedriver();
		driver.get("https://www.flipkart.com/?affid=siteplug&affExtParam1=a6b36a7dca6f8b68e70f3d8dd219cffa");
		driver.manage().window().maximize();

	}

}
