package Week4.day2;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class userregistration 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/saravananjeganathan/seljuly/Selenium/drivers/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//driver.close();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByLinkText("Create Contact").click();
		//driver.findElementById("createContactForm_companyName").sendKeys("CapGemini");
		driver.findElementById("firstNameField").sendKeys("Saravanan");
		driver.findElementById("lastNameField").sendKeys("Jeganathan");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Saran");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("Jegan");
		//driver.findElementById("createContactForm_personalTitle").sendKeys("personal");
		//driver.findElementById("createContactForm_generalProfTitle").sendKeys("Bussiness Man");
		driver.findElementById("createContactForm_departmentName").sendKeys("IT", Keys.TAB);
		Select dd1 = new Select(driver.findElement(By.id("createContactForm_preferredCurrencyUomId")));
		dd1.selectByIndex(2);
		driver.findElementById("createContactForm_description").sendKeys("Test");
		driver.findElementById("createContactForm_importantNote").sendKeys("Important Information");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("91");
		
		/* -------- Contact Information Section------------*/
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("04365");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("saravanaan@gmail.com");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("9840693868");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Saran");
		
		/*------------Primary Address Field----------------------*/
		//driver.findElementById("generalToNameField").sendKeys("Saran");
		driver.findElementById("createContactForm_generalAddress1").sendKeys("Ponniamman Koil St");
		driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("600117");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("600");
		driver.findElementById("createContactForm_generalAttnName").sendKeys("sa");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("Shivan Koil St");
		Select con = new Select(driver.findElement(By.id("createContactForm_generalCountryGeoId")));
		con.selectByVisibleText("India");
		Thread.sleep(2000);
		WebElement fullName1=driver.findElementById("generalToNameField");
		String name1=fullName1.getAttribute("value");
		driver.findElementByName("submitButton").click();
		WebElement fullName2=driver.findElementById("viewContact_fullName_sp");
		String name2=fullName2.getText();
		//System.out.println(name1);
		if(name2.contains(name1))
		{
			System.out.println("Text is Verified Successfully- Pass");
		}else
		{
			System.out.println("Text is Not Verified - Fail");
		}
		/*--------------Edit Page--------*/
		driver.findElementByLinkText("Edit").click();
		Select mc = new Select(driver.findElement(By.id("addMarketingCampaignForm_marketingCampaignId")));
		mc.selectByIndex(2);
		String mcValue1=mc.getFirstSelectedOption().getText();
		System.out.println(mcValue1);
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@value='Add']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@value='Update']").click();
		/*--------Update Button------*/
		Thread.sleep(3000);
		String mcValue2=driver.findElementById("viewContact_marketingCampaigns_sp").getText();
		if(mcValue2.contains(mcValue1))
		{
			System.out.println("Market Campaign is Verified Successfully- Pass");
		}else
		{
			System.out.println("Market Campaign is Not Verified - Fail");
		}
		
		//driver.findelementby
		//driver.findElementByName("submitButton").click();
		
//		WebElement source = driver.findElementById("createContactForm_industryEnumId");
//		//Select is a class to get the multiple values in the list
//		Select dd = new Select(source);
//		dd.selectByIndex(2);
//		WebElement marketc = driver.findElementById("createContactForm_marketingCampaignId");
//		//Selecting all options
//		Select mc = new Select(marketc);
//		mc.selectByIndex(2);
//		List<WebElement> markc = mc.getOptions();
//		for (WebElement webElement : markc) 
//		{
//			System.out.println(webElement.getText());
//		}
	}
}
