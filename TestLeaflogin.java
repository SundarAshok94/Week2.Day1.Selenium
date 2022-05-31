package Week2.Day1.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaflogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input[@type='email']
		//input[@type='password']
		//button[@type='submit']
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kumar.testleaf@gmail.com");
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		pswd.sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
		String title = driver.getTitle();
		System.out.println(title);
		


	}

}
