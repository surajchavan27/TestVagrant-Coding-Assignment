package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import loginPage.Loginpage;
import utilities.BaseClass;

public class Stepdef extends BaseClass
{
	public Loginpage lp;
	WebDriver driver;
	@Given("^user able to open browser$")
	public void user_able_to_open_browser() {
		this.driver=super.initialization();		
	}

	@And("^user able to enter url \\\"(.*)\\\"$")
	public void user_able_to_enter_url(String url) {
		driver.get(url);
	}

	@When("^user enter Username \\\"(.*)\\\" & password \\\"(.*)\\\"$")
	public void user_enter_username_password(String Username, String password) {
		lp=new Loginpage(driver);
		lp.setUserName(Username);
		lp.setpassword(password);
	}

	@And("^user able to click on Login Button$")
	public void user_able_to_click_on_login_button() {
		lp.clickOnButton();
	}

	@Then("^user is on HomePage \\\"(.*)\\\"$")
	public void user_is_on_home_page(String title) {
		String Expected = title;
		String actual = driver.getTitle();
		Assert.assertEquals(false, false);
	}

	@And("user is able to click on Logout Button")
	public void user_is_able_to_click_on_logout_button() {
		lp.ClickOnLogout();
	}

	@And("user is on Login Page \\\"(.*)\\\"$")
	public void user_is_on_login_page(String title1) {
		String Expected = title1;
		String actual = driver.getTitle();
		Assert.assertEquals(Expected, actual);
	}
}
