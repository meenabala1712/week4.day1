package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClassRoom {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		 driver.manage().window().maximize();
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		 org.openqa.selenium.Alert alert = driver.switchTo().alert();
		 alert.sendKeys("Meena");
		alert.accept();
		
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		
		if(text.contains("Meena")) {
			System.out.println("My Name is printed");
		
		
	}
		else {
			System.out.println("My Name is not printed");
		}

}
}