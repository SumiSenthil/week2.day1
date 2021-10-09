package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 //MAXIMISE WINDOW
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		  WebElement eleUsername = driver.findElement(By.name("USERNAME"));
		  eleUsername.sendKeys("DemoSalesManager");
		  WebElement elePassword = driver.findElement(By.name("PASSWORD"));
		  elePassword.sendKeys("crmsfa");
		  //driver.findElement(By.id("password")).sendKeys("hello"); single line code
		  WebElement eleLogin =driver.findElement(By.className("decorativeSubmit"));
		  eleLogin.click();
		  Thread.sleep(2000);
		  WebElement eleSubmit =driver.findElement(By.linkText("CRM/SFA"));
		  eleSubmit.click();
		  driver.findElement(By.linkText("Leads")).click();
		  driver.findElement(By.linkText("Create Lead")).click();
		  Thread.sleep(2000);
		  //enter details and create Lead
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sumathi");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gana");
		  Thread.sleep(2000);
		  driver.findElement(By.name("submitButton")).click();
		  driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(2000);
		  driver.close();
	}

}
