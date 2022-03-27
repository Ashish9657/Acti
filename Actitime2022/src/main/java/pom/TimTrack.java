package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimTrack {

	@FindBy (xpath="//span[@class='dashedLink']")
	private WebElement newTask;
	
	@FindBy (xpath="(//button[@class='x-btn-text'])[1]")
	private WebElement clickOnSelectCustomer;
	
	@FindBy (xpath="(//a[@class='x-menu-item'])[2]")
	private WebElement clickOnNewCustomer;
	
	@FindBy (xpath="//input[@id='createTasksPopup_newCustomer']")
	private WebElement clickOnNewCustomerCheckBox;
	
	@FindBy (xpath="//input[@id='createTasksPopup_newProject']")
	private WebElement clickOnEnterProjectName;
	
	@FindBy (xpath="(//input[@type='text'])[1]")
	private WebElement enterTask1Name;
	
	@FindBy (xpath="(//button[@class='x-btn-text'])[3]")
	private WebElement setDate;
	
	@FindBy (xpath="//button[text()='February 2022']")
	private WebElement clickOnMAndY;
	
	
    @FindBy (xpath="//a[text()='Oct']")
	private WebElement clickOnMonth;
    
    @FindBy (xpath="//a[text()='2027']")
	private WebElement clickOnYear;
    
    @FindBy (xpath="//button[@class='x-date-mp-ok']")
	private WebElement clickOnOk;
    
    @FindBy (xpath="(//span[text()='28'])[2]")
   	private WebElement selectDate;
    
    @FindBy (xpath="//button[@id='ext-gen330']")
    private WebElement clickOnOk1;
    		 
    @FindBy (xpath="(//button[@class='x-btn-text'])[4]")
    private WebElement clickOnNonBilable;	
    
    @FindBy (xpath="//a[text()='Billable']")
    private WebElement clickOnBilable;
     
    @FindBy (xpath="//span[text()='Create Tasks']")
    private WebElement clickOnCreateTask;
    
    private Actions action;
    
    public TimTrack (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	action = new Actions(driver);
    }
    
    public void clickOnNewTask()
    {
    	newTask.click();
    }
    
    public void selectCustomer()
    {
    	clickOnSelectCustomer.click();
    }
    
    public void moveToNewCustomer()
    {
    	action.moveToElement(clickOnNewCustomer).click().build().perform();
    }
    
    public void sendNewCustomerName()
    {
    	clickOnNewCustomerCheckBox.sendKeys("Tushar");
    }
    
    public void sendProjectName()
    {
    	clickOnEnterProjectName.sendKeys("slenium");
    }
    
    public void sendTaskName()
    {
    	enterTask1Name.sendKeys("sprint11");
    }
    
    public void clickOnSetDate()
    {
    	setDate.click();
    }
    
    public void moveToNewMAndY()
    {
    	action.moveToElement(clickOnMAndY).click().build().perform();
    	
    }
    
    public void moveToMonth()
    {
    	action.moveToElement(clickOnMonth).click().build().perform();
    }
    
    public void moveToYear()
    {
    	action.moveToElement(clickOnYear).click().build().perform();
    }
    
    public void moveToOk()
    {
    	action.moveToElement(clickOnOk).click().build().perform();
    }
    
    public void moveToDate()
    {
    	action.moveToElement(selectDate).click().build().perform();
    }
    
    public void moveToOk1()
    {
    	action.moveToElement(clickOnOk1).click().build().perform();
    }
    
    public void clickOnNonBilableCheckBox()
    {
    	clickOnNonBilable.click();
    }
    
    public void clickOnBilable()
    {
    	action.moveToElement(clickOnBilable).click().build().perform();
    }
    
    public void clickOnCreateTask()
    {
    	clickOnCreateTask.click();
    }
}
