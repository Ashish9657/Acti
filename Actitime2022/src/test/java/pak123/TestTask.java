package pak123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ApplicationHeaderPage;
import pom.LoginPage;
import pom.Task;

public class TestTask {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		LoginPage loginPage= new LoginPage(driver);
		
		loginPage.sendUserName();
		loginPage.sendPassword();
		loginPage.clickOnKeepMeLogin();
		loginPage.clickOnLogin();
		
		ApplicationHeaderPage applicationHeaderPage=new ApplicationHeaderPage(driver);
		
		applicationHeaderPage.openTasks();
		
		Task task=new Task(driver);
		
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

}
