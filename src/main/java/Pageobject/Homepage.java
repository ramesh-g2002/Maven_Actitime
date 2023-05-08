package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
	
	@FindBy(xpath = "//div[text()='Reports']")
	private WebElement report;
	@FindBy(id ="logoutLink")
	private WebElement logout;
	public Homepage(WebDriver driver)
	{
		//idriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setClickrep()
	{
		report.click();
	}
	public void setLogout()
	{
		logout.click();
	}

}
