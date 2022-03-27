package pak123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
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

public class TestNGUser extends Browser {
	private WebDriver driver;
	private ApplicationHeaderPage applicationHeaderPage;
	private LoginPage loginPage;
	
	private Users users;
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
		 users=new Users(driver);
		 logOut=new LogOut(driver);
		 users=new Users(driver);
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
		public void verifyUserTab() {
			applicationHeaderPage.openUsers();
			
			
			
			users.clickOnNewUser();
			users.sendFirstName();
			users.sendLastName();
			users.sendEmailId();
			users.sendUserName();
			users.sendPassword();
			users.reEnterPassword();
			users.clickOnCheckBoxEnterTimeTrack();
			users.clickOnCheckBoxTaskManag();
			users.clickOnCheckBoxReporting();
			users.clickOnCheckBoxUserManage();
			users.clickOnCreateuser();
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
