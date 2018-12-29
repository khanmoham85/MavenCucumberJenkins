package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest {
WebDriver driver;
	
	@Given("^Open Chrome and start application$")
	public void open_Chrome_and_start_application() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}

	@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_valid_and_valid(String arg1, String arg2) throws Throwable {
		  driver.findElement(By.id("username")).sendKeys(arg1);
		    driver.findElement(By.id("passsword")).sendKeys(arg2);
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
