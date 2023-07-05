package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookstepdef {
	WebDriver driver;
	@Given("^user is able to launch Browser$")
	public void user_is_able_to_launch_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}


	@And("^user is able enter url \\\"(.*)\\\"$")
	public void user_is_able_enter_url(String url) {
		driver.get(url);
	}

	@When("user is able to enter email \\\"(.*)\\\" & password \\\"(.*)\\\"$")
	public void user_is_able_to_enter_email_password(String email, String password) {

		WebElement mail = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		mail.clear();
		mail .sendKeys(email);
		WebElement pass = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		pass.clear();
		pass.sendKeys(password);

	}

	@And("user is able to click on login button")
	public void user_is_able_to_click_on_login_button() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

	@Then("user is on Homepage")
	public void user_is_on_homepage() {
		System.out.println(driver.getTitle());
	}

	@And("user is able to click on logout")
	public void user_is_able_to_click_on_logout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();

	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		System.out.println(driver.getTitle());


	}


}
