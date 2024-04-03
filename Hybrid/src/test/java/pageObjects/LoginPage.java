package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	// Constructor to invoke the elements
    public LoginPage(WebDriver driver)
    {
    	this.driver=driver;
        PageFactory.initElements(driver, this);
    }
	//TestSuite1 testSuite1=new TestSuite1();
	
	@FindBy(name="uid")
	@CacheLookup()
	WebElement username;
	
	@FindBy(name="password")
	@CacheLookup()
	WebElement password;
	
	@FindBy(name="btnLogin")
	@CacheLookup()
	WebElement login_button;
    
	public void enterUsernameAndPasswordAndLogin(String uname,String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		login_button.click();
	}
}
