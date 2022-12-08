package testacademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//implicit wait
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Compressed\\chromedriver_win32_4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Downloads\\Compressed\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
					
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		Thread.sleep(1000);
		
	
	
		
		/*
		 * Thread.sleep(10000);
		 * 
		 * driver.findElement(By.xpath("//button[@id='submit']")).click();
		 * //Thread.sleep(2000);
		 * 
		 * System.out.println(driver.findElement(By.
		 * xpath("//button[@class='swal-button swal-button--confirm']")).getText());
		 * 
		 * Thread.sleep(1000); driver.findElement(By.
		 * xpath("//button[@class='swal-button swal-button--confirm']")).click();
		 */
		
	
		
		
		driver.findElement(By.id("inputUsername")).sendKeys("kouassi");
		driver.findElement(By.name("inputPassword")).sendKeys("kouassi123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Georges");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("georges@pk.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("georges@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("055556328");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click()	;
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	    }
	
	

}
