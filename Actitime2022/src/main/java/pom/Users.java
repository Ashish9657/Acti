package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users {
	
	@FindBy (xpath="//span[text()='User']")
	private WebElement newUser;
	
	@FindBy (xpath="//input[@class='firstNameField inputFieldWithPlaceholder']")
	private WebElement firstName;
	
	@FindBy (xpath="//input[@class='lastNameField inputFieldWithPlaceholder']")
	private WebElement lastName;
	
	@FindBy (xpath="//input[@class='emailField inputFieldWithPlaceholder']")
	private WebElement emailId;
	
	@FindBy (xpath="//input[@class='usernameField inputFieldWithPlaceholder']")
	private WebElement userName;

	@FindBy (xpath="//input[@class='passwordField inputFieldWithPlaceholder']")
	private WebElement password;
	
	@FindBy (xpath="//input[@class='passwordCopyField inputFieldWithPlaceholder']")
	private WebElement retypePassword;
	
	@FindBy (xpath="(//input[@class='rightChBox'])[1]")
	private WebElement enterTimeTrack;
	
	@FindBy (xpath="(//input[@class='rightChBox'])[3]")
	private WebElement taskManag;
	
	@FindBy (xpath="(//input[@class='rightChBox'])[5]")
	private WebElement reporting;
	
	@FindBy (xpath="(//input[@class='rightChBox'])[8]")
	private WebElement userManage;
	
	@FindBy (xpath="//span[text()='Create User']")
	private WebElement createuser;

	private Actions action;
	
	  public Users(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    	action = new Actions(driver);
	    }
	  
	  
	  public void clickOnNewUser()
	  {
		  newUser.click();
	  }
	  
	  public void sendFirstName()
	  {
		  firstName.sendKeys("abcd");
	  }
	  
	  public void sendLastName()
	  {
		  lastName.sendKeys("xyz");
	  }
	  
	  public void sendEmailId()
	  {
		  emailId.sendKeys("pqr@gmail.com");
	  }
	  
	  public void sendUserName()
	  {
		  userName.sendKeys("hgfyrgg");
	  }
	  
	  public void sendPassword()
	  {
		  password.sendKeys("54552");
	  }
	  
	  public void reEnterPassword()
	  {
		  retypePassword.sendKeys("54552");
	  }
	  
	  public void clickOnCheckBoxEnterTimeTrack()
	  {
		  enterTimeTrack.click();
	  }
	  
	  public void clickOnCheckBoxTaskManag()
	  {
		  taskManag.click();
	  }
	  
	  public void clickOnCheckBoxReporting()
	  {
		  reporting.click();
	  }
	  
	  public void clickOnCheckBoxUserManage()
	  {
		  userManage.click();
	  }
	  
	  public void clickOnCreateuser()
	  {
		  createuser.click();
	  }
	  
	  
}

