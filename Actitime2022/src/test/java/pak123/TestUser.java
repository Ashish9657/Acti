package pak123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ApplicationHeaderPage;
import pom.LoginPage;
import pom.Users;

public class TestUser {
	
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://localhost/login.do");
	
	LoginPage loginPage=new LoginPage(driver);
	loginPage.sendUserName();
	loginPage.sendPassword();
	loginPage.clickOnKeepMeLogin();
	loginPage.clickOnLogin();
	
	ApplicationHeaderPage applicationHeaderPage=new ApplicationHeaderPage(driver);
	applicationHeaderPage.openUsers();
	
	Users users=new Users(driver);
	
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
}