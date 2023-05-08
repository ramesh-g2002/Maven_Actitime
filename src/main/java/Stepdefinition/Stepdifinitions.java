package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import Pageobject.Homepage;
import Pageobject.Loginpage;
import io.cucumber.java.en.*;

public class Stepdifinitions {
	static {
		System.setProperty("webdriver.chrome.driver",".//src//main//resources//driver/chromedriver.exe");
	}
public WebDriver driver;
@Given("User launch chrome Browser")
public void user_launch_chrome_browser() {
	Reporter.log("openBrowser",true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}

@When("User open Url {string}")
public void user_open_url(String url) {
	Reporter.log("Enter the url",true);
	driver.get(url);
   
}

@When("User enter username {string} and password {string}")
public void user_enter_username_and_password(String un, String pwd) {
	Reporter.log("username and  password",true);
	Loginpage lgpage=new Loginpage(driver);

	lgpage.setLogin(un, pwd);
	lgpage.setclicklogin();
    
    
}

@When("click on login")
public void click_on_login() {
    Reporter.log("Login",true);
}

@Then("Page title should be {string}")
public void page_title_should_be(String expectedtitle) throws InterruptedException {
	Reporter.log("title",true);
	Thread.sleep(4000);
	String actualtitle = driver.getTitle();
	Assert.assertEquals(actualtitle, expectedtitle);
	
	
}

@Then("click on Reports")
public void click_on_reports() {
	Reporter.log("reports",true);
	Homepage h=new Homepage(driver);
	//PageFactory.initElements(driver, this);
	h.setClickrep();
    
}

@Then("page current url {string}")
public void page_current_url(String actualtitle) throws InterruptedException {
	Reporter.log("current url",true);
	Thread.sleep(4000);

	String expectedtitle = driver.getCurrentUrl();
	Assert.assertEquals(actualtitle, expectedtitle);

	
	
    
}

@Then("page navigate back")
public void page_navigate_back() {
	Reporter.log("back",true);
	driver.navigate().back();
    
}

@When("user click on Logout page")
public void user_click_on_logout_page() {
	Reporter.log("Logout",true);
	Homepage h=new Homepage(driver);
	h.setLogout();
   
}

@When("Browser close")
public void browser_close() {
    Reporter.log("close browser",true);
    driver.close();
}

}
