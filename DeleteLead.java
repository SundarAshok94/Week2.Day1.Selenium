package Week2.Day1.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		//a[text()='Leads']
		//a[text()='Find Leads']
		//span[text()='Phone']
		//input[@name='phoneNumber']
		//button[text()='Find Leads']
		//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]
		//a[text()='Delete']
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9095326910");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//leadid = 13410
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//div[@class='x-form-element']/input[@name='id']
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys("13410");
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		boolean message = driver.findElement(By.xpath("//div[text() = 'No records to display']")).isDisplayed();
		System.out.println(message);
		driver.close();
		



		
		
	}

}
