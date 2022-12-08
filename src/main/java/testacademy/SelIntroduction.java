package testacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Chrome - rChromeDriver --> Methods close
		//Firefox -Driver --> Methods close
		//WebDriver methods + class methods
		//key = webdriver.chrome.driver
		//SeleniumManager
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Compressed\\chromedriver_win32_4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //accesssible a tous les browser
		
		//Firefox launch
		//geckodriver
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\Compressed\\geckodriver\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Downloads\\Compressed\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
	
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	}

	
		
}
