package loginPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Loginpage 
{
public WebDriver ldriver;
	@FindBy(xpath="//input[@name=\"username\"]")
	private WebElement username_txtbox;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement pwd_txtbox;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private 	WebElement Login_btn;
	
	@FindBy(xpath="//li[@class=\"oxd-userdropdown\"]")
	private WebElement webelement_dropdwn;
	
	@FindBy(xpath=("//a[text()='Logout']"))
	private WebElement logout_btn;
	
	public Loginpage(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver, this);
	}
	
	public void setUserName(String Username)
	{
		//username_txtbox.clear();
		username_txtbox.sendKeys(Username);
	}
	
	public void setpassword(String password)
	{
		//pwd_txtbox.clear();
		pwd_txtbox.sendKeys(password);
	}
	public void clickOnButton()
	{
		Login_btn.click();
	}

	public void ClickOnLogout()
	{
		//WebElement web = webelement_dropdwn;
		Select s = new Select(webelement_dropdwn);
		s.selectByVisibleText("Logout");
	}
	
}
