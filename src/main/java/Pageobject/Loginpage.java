package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
//public WebDriver idriver;

public Loginpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	//idriver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private WebElement untbx;
@FindBy(name="pwd")
private WebElement pwdtbx;
@FindBy(xpath = "//div[text()='Login ']")
private WebElement lgbtn;
public void setLogin(String un,String pwd)
{
	untbx.sendKeys(un);
	pwdtbx.sendKeys(pwd);
}
public void setclicklogin()
{
	lgbtn.click();

}
}
