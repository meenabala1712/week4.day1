package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_MergeLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 WebElement userName = driver.findElement(By.id("username"));
		 userName.sendKeys("DemoCSR");
		 
		 //Enter the password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click(); 
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Merge Contacts")).click();
		 driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		 Set<String> set1 = driver.getWindowHandles();
		 List<String> firstset = new ArrayList<String>(set1);
		 driver.switchTo().window(firstset.get(1));
		 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Rajendra");
		 Thread.sleep(30);
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 Thread.sleep(300);
		 //To Contact
		 driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		 Thread.sleep(300);
		 Set<String> set2 = driver.getWindowHandles();
		 List<String> secondset = new ArrayList<String>(set2);
		driver.switchTo().window(secondset.get(1));
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Merge")).click();
			 

	}

}
