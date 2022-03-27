package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeaderPage {

	@FindBy (xpath="//a[@class='content tt_selected selected']//div[2]//img")
	private WebElement timetrack;
	
	@FindBy (xpath="//a[@class='content tasks']")
	private WebElement tasks;
	
	@FindBy (xpath="//a[@class='content reports']")
	private WebElement reports;
	
	@FindBy (xpath="//a[@class='content users']")
	private WebElement user;
	
	@FindBy (xpath="//a[@class='content calendar']")
	private WebElement workSchedule;
		
	public ApplicationHeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void openTimeTrack()
	{
		timetrack.click();
	}
	
	public void openTasks()
	{
		tasks.click();
	}
	
	public void openReports()
	{
		reports.click();
	}
	
	public void openUsers()
	{
		user.click();
	}
	


	

}
