package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task {
	
	@FindBy (xpath="//span[text()='Create Tasks']")
	private WebElement createTask;
	
	@FindBy(xpath="(//em[@unselectable='on'])[1]")
	private WebElement newCustomerDropDown;
	
	@FindBy(xpath="//a[text()='- New Customer -']")
	private WebElement selectNewCustomer;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	private WebElement enterCustomerName;
	
	
	
	@FindBy(xpath="//input[@id='createTasksPopup_newProject']")
	private WebElement enterProjectname;
	
	@FindBy(xpath="//input[@placeholder='Enter task name']")
	private WebElement entertaskname;
	
	@FindBy(xpath="(//button[text()='set deadline'])[1]")
	private WebElement setDeadline;
	
	@FindBy(xpath="//button[text()='today']")
	private WebElement today;
	
	@FindBy(xpath="(//button[text()='Non-Billable'])[1]")
	private WebElement nonBillable;
	
	@FindBy(xpath="//a[text()='Billable']")
	private WebElement Billable;
	
	@FindBy(xpath="(//input[@type='checkbox'])[4]")
	private WebElement checkbox;
	
	@FindBy(xpath="(//span[text()='Create Tasks'])[1]")
	private WebElement createTask2;
	
	private Actions act;
	
	public Task(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		act=new Actions(driver);
	}
	
	public void clickOnCreateTask()
	{
		createTask.click();
	}
	
	public void clickOnNewCustomerDropDown() throws InterruptedException
	{
		newCustomerDropDown.click();
		Thread.sleep(3000);
		act.moveToElement(selectNewCustomer).click().build().perform();
	} 
	
	public void clickOnEnterCustomerName()
	{
		enterCustomerName.sendKeys("asdsdgghldjhftjddtb");
	}
	
	public void clickOnEnterProjectName()
	{
		enterProjectname.sendKeys("ActiTime");
	}
	
	public void clickOnEnterTaskName()
	{
		entertaskname.sendKeys("Automation");
	}
	
	public void clickOnsetDeadline()
	{
		setDeadline.click();
	}
	
	public void clickOnToday()
	{
		act.moveToElement(today).click().build().perform();
	}
	
	public void clickOnnonBillable()
	{
		nonBillable.click();
	}
	
	public void clickOnBillable()
	{
		act.moveToElement(Billable).click().build().perform();
	}
	
	public void clickOncheckbox()
	{
		checkbox.click();
	}

	public void clickOncreateTask2()
	{
		createTask2.click();
	}

}
