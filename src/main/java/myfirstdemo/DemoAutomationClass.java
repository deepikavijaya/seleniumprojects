package myfirstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomationClass {

	public static void main(String[] args) {
	
		
		//System.setProperty("webdriver.chrome.driver", "C:\\POC\\chromedriver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.gmail.com");
		/*driver.manage().window().maximize();
		driver.findElement(By.id("class="whsOnd zHQkBf"")).click();
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.id("whsOnd.zHQkBf")).sendKeys("deepika.vijaya@gmail.com");*/
		driver.findElement(By.id("identifierId")).sendKeys("deepika.vijaya@gmail.com");
		//driver.find_element_by_id("identifierNext").click();
	}

}
