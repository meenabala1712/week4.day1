package week4.day1;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsClassRoom {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup(); 
		 ChromeOptions options = new ChromeOptions();  
		 options.addArguments("--disable-notifications");
		 options.addArguments("--start-maximized");
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.irctc.co.in/nget/train-search");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		 driver.findElement(By.linkText("FLIGHTS")).click();
		 Set<String> windowHandles = driver.getWindowHandles();
		 
		List<String> windows = new ArrayList<String>(windowHandles); 
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());
driver.switchTo().window(windows.get(0));
driver.close();
	}

}
