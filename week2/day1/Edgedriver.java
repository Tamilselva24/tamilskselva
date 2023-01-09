package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edgedriver extends EdgeDriver {
	public static void main(String[] args) {
		//WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new Edgedriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println(driver.getTitle());
 	String title = driver.getTitle();
	if(title.contains("Leaftaps - TestLeaf Automation Platform")) {
 		System.out.println("the page is loaded");
 		}
	
 		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("tg private ltd");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("tamilselvan");
		Select drop=new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
	    drop.selectByVisibleText("Employee");
		
		
		
 		
 	
		
		
		
		
		
		
		
//		driver.close();
		
		
		
		
		
		
}}
