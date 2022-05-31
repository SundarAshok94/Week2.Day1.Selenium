package Week2.Day1.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

		
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
		
		//Edit Lead
		//div[@class='x-panel-header']/a[text()='Leads']
		//a[text()='Find Leads']
		//button[text()='Find Leads']
		//div[@class='x-form-item x-tab-item']//input[@name='firstName']
		
		//a[text()='10040']
		
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input[@name='firstName']")).sendKeys("Amirtha");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		//div[@class='frameSectionExtra']/a[text()='Edit']
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Edit']")).click();
		//input[@name='companyName' and @id='updateLeadForm_companyName']
		
		driver.findElement(By.xpath("//input[@name='companyName' and @id='updateLeadForm_companyName']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='companyName' and @id='updateLeadForm_companyName']")).sendKeys("Wipro");
		//input[@name='submitButton' and @value='Update']
		
		driver.findElement(By.xpath("//input[@name='submitButton' and @value='Update']")).click();
		driver.close();
		
		

		
		
		
		
		
		
		
	
	}

}
