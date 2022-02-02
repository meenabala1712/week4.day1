package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Alerts {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://www.leafground.com/pages/Alert.html");
		 driver.manage().window().maximize();
		//Alert
		 driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		driver.switchTo().alert().accept();
		//Confirm
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.switchTo().alert().accept();
		//Prompt		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert alert3 = driver.switchTo().alert();
		String text1 = alert3.getText();
		System.out.println(text1);
		alert3.sendKeys("Meena");
		alert3.accept();
		//linebreaks
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		driver.switchTo().alert().accept();
		//sweet Alert
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		//Accept the alert
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.switchTo().alert().accept();
	
	
	}

}
