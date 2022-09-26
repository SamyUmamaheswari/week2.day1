package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Umamaheswari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Samydurai");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Uma");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium testing with Java");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("umacivil95@gmail.com");
	    driver.findElement(By.name("submitButton")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.id("updateLeadForm_description")).clear();
	    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important meeting");
	    driver.findElement(By.name("submitButton")).click();
	    
	    
	    
	    String title = driver.getTitle();
		System.out.println(title);
			
		
	}

}
