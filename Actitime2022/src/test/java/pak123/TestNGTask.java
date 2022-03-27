package pak123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Browser;
import pom.ApplicationHeaderPage;
import pom.LogOut;
import pom.LoginPage;
import pom.Task;
import pom.Users;

public class TestNGTask extends Browser{

	private WebDriver driver;
	private ApplicationHeaderPage applicationHeaderPage;
	private LoginPage loginPage;
	private Task task;
	
	private LogOut logOut;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browserName)  {
		System.out.println("launchBrowser");
//		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
//	    driver =new ChromeDriver();
		if(browserName.equals("Chrome"))
		{
			driver=launchChromeBrowser();
		}
		if(browserName.equals("Edge"))
		{
			driver=launchEdgeBrowser();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void createObject() {
		loginPage= new LoginPage(driver);
		applicationHeaderPage=new ApplicationHeaderPage(driver);
		 task=new Task(driver);
		 logOut=new LogOut(driver);
	}
		@BeforeMethod
		public void loginApplication() {
			System.out.println("loginApplication");
			driver.get("http://localhost/login.do");
			
		    
			loginPage.sendUserName();
			loginPage.sendPassword();
			loginPage.clickOnKeepMeLogin();
			loginPage.clickOnLogin();
		    
		}
		
		@Test
		public void verifyTaskTab() throws InterruptedException {
			System.out.println("verifyTaskTab");
			applicationHeaderPage.openTasks();
			String url=driver.getCurrentUrl();
			String title=driver.getTitle();
			
			if(url.equals("http://localhost/tasks/otasklist.do"))
			{
				System.out.println("pass");
			}
			else
			{
			    System.out.println("false");	
			}
			
			if(title.equals("actiTIME - Open Tasks"))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("false");
			}
			
		   
			
			task.clickOnCreateTask();
			Thread.sleep(3000);
			task.clickOnNewCustomerDropDown();
			task.clickOnEnterCustomerName();
			Thread.sleep(3000);
			task.clickOnEnterProjectName();
			Thread.sleep(2000);
			task.clickOnEnterTaskName();
			Thread.sleep(2000);
			task.clickOnsetDeadline();
			Thread.sleep(2000);
			task.clickOnToday();
			Thread.sleep(2000);
			task.clickOnnonBillable();
			Thread.sleep(2000);
			task.clickOnnonBillable();
			Thread.sleep(2000);
			task.clickOncheckbox();
			Thread.sleep(2000);
			task.clickOncreateTask2();
			Thread.sleep(2000);
		}

		@AfterMethod
		public void logoutApplication() {
			System.out.println("logoutApplication");
			
			logOut.clickOnLogOut();
		}
		
		@AfterClass
		public void afterClass() {
			loginPage=null;
			applicationHeaderPage=null;
			task=null;
			logOut=null;
		}
		
		@AfterTest
		public void closeBrowser() {
			
			System.out.println("closeBrowser");
			System.out.println("done");
			driver.quit();
			System.gc();
		}
}
