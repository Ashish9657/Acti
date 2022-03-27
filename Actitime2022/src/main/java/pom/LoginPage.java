package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	
		@FindBy (xpath="//input[@name='username']") 
		private WebElement username;
		
		@FindBy (xpath="//input[@name='pwd']")
		private WebElement password;
		
		@FindBy (xpath="//input[@name='remember']")
		private WebElement keepMeLogin;
		
		@FindBy (xpath="//a[@id='loginButton']")
		private WebElement login;
		
		public  LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void sendUserName () {
			username.sendKeys("admin");
		}
		
		public void sendPassword() {
			password.sendKeys("manager");
		}
		
		public void clickOnKeepMeLogin() {
			if(!(keepMeLogin.isSelected()))
			{
				keepMeLogin.click();
			}
			else
			{
				System.out.println("keep Me Login is already selected");
			}
	    }
		
		public void clickOnLogin() {
			login.click();
		}

	}


