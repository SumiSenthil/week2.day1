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
		  driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Employee");
		  driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Automobile");
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kavi");
		  driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Hava");
		  driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Hi");
		  driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/9/90");
		  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SSE");
		  driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("$10000");
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		  driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Aerospace");
		  driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("Teest12345");
		  driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("Corporation");		  
		  driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10000");
		  driver.findElement(By.name("sicCode")).sendKeys("9877-54321");
		  driver.findElement(By.id("createLeadForm_description")).sendKeys("Employee Details");
		  driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("#$%");
		  driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Well Organised");
		  //Contact Info
		  driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");
		  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123456 78910");
		  driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("234");
		  driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Chicks");
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf@gmail.com");
		  driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http:\\www.testleaf.com");
		  //Primary Address
		  driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sumathi");
		  driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Gana");
		  driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No:2,G3");
		  driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Colony,Texas");
		  driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Houston");
		  driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("California");		  
		  driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("875965");
		  driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("45777");
		  driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("875965");
		  driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("45777");
		  String strTitle= driver.getTitle();
		  System.out.println(strTitle);		  	            
		  if (strTitle.contains("Create Lead | opentaps CRM")) {
			System.out.println("Tile is available as expected");
		} 
		  else
		  {
				System.out.println("Title is not displayed as expected");
			} 
		  
		  String strName = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		  System.out.println("First Name: "+strName);
		  Thread.sleep(2000);
		  driver.findElement(By.name("submitButton")).click();
		 driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(2000);
		 driver.close();
	}

}
