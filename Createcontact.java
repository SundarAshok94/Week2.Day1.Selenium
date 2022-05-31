package Week2.Day1.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

	public static void main(String[] args) throws InterruptedException {
		
		
		//ul[@class='shortcuts']/li//a[text()='Create Contact']
		//div[@class='x-panel-header']/a[text()='Contacts']
		//input[@name='firstName' and @class='inputBox']
		//input[@name='lastName' and @class='inputBox']
		//input[@name='firstNameLocal' and @class='inputBox']
		//input[@name='lastNameLocal' and @class='inputBox']
		//textarea[@name='description' and @class='inputBox']
		//input[@name='departmentName' and @class='inputBox']
		//select[@name='generalStateProvinceGeoId' and @class='inputBox']
		//input[@name='submitButton' and @class='smallSubmit']
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Create Contact
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//ul[@class='shortcuts']/li//a[text()='Create Contact']")).click();
		driver.findElement(By.xpath("//input[@name='firstName' and @class='inputBox']")).sendKeys("Sundar");
		driver.findElement(By.xpath("//input[@name='lastName' and @class='inputBox']")).sendKeys("Ashok");
		driver.findElement(By.xpath("//input[@name='firstNameLocal' and @class='inputBox']")).sendKeys("SundarAshok");
		driver.findElement(By.xpath("//input[@name='lastNameLocal' and @class='inputBox']")).sendKeys("Ashok");
		driver.findElement(By.xpath("//textarea[@name='description' and @class='inputBox']")).sendKeys("Creating the contacts");
		driver.findElement(By.xpath("//input[@name='departmentName' and @class='inputBox']")).sendKeys("Testing");
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId' and @class='inputBox']")));               
		dropdown.selectByVisibleText("Alaska");
		driver.findElement(By.xpath("//input[@name='submitButton' and @class='smallSubmit']")).click();
		Thread.sleep(3000);
		
		//Edit
		
		//div[@class='frameSectionExtra']/a[text()='Edit']
		//textarea[@name='importantNote' and @class='inputBox']
		//input[@name='submitButton' and @value='Update']
		
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@name='description' and @class='inputBox']")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote' and @class='inputBox']")).sendKeys("form has been updated with chnages");
		driver.findElement(By.xpath("//input[@name='submitButton' and @value='Update']")).click();
		
		driver.close();
  

	}

}
