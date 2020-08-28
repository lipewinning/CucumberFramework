package CucumberFramework.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {

	WebDriver driver;

	@Before()
	public void setup() {
		//start up Chrome
		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/chromedriver");		
		
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	
	}

	@Given("^User navigates to stackoverflow website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
		driver.get("https://stackoverflow.com/");
	}

	@Given("^User clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	}

	@Given("^User enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("felipe");
		
	}

	@Given("^User enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("teste");
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@id,'submit-button')]")).click();
	}

	@Then("^User should be taken to the succesful login page$")
	public void user_should_be_taken_to_the_succesful_login_page() throws Throwable {
		Thread.sleep(1000);
		
		WebElement askQuestionButton = null;
		try {
			askQuestionButton = driver.findElement(By.xpath("//button[contains(test(),'Ask Question')]"));
			Assert.assertEquals(true, askQuestionButton.isDisplayed());
		}catch(Exception ex) {
			Assert.assertTrue(askQuestionButton != null);
		}finally {
			this.driver.quit();
		}
		
	}

	@Given("^User navigates to stackoverflow website2$")
	public void user_navigates_to_stackoverflow_website2() throws Throwable {
		System.out.println("User navigates to stackoverflow website2");
	}

	@Given("^User clicks on the login button on homepage2$")
	public void user_clicks_on_the_login_button_on_homepage2() throws Throwable {
		System.out.println("User clicks on the login button on homepage2");
	}

	@Given("^User enters a valid username2$")
	public void user_enters_a_valid_username2() throws Throwable {
		System.out.println("User enters a valid username2");
	}

	@Given("^User enters a valid password2$")
	public void user_enters_a_valid_password2() throws Throwable {
		System.out.println("User enters a valid password2");
	}

	@When("^User clicks on the login button2$")
	public void user_clicks_on_the_login_button2() throws Throwable {
		System.out.println("User clicks on the login button2");
	}

	@Then("^User should be taken to the succesful login page2$")
	public void user_should_be_taken_to_the_succesful_login_page2() throws Throwable {
		System.out.println("User should be taken to the succesful login page2");
	}
	
	@Given("^I access webdriveruniversity\\.com$")
	public void i_access_webdriveruniversity_com() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("");
	}

	@Given("^I click on the login portal button$")
	public void i_click_on_the_login_portal_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I click on the login portal button");
	}

	@Given("^I enter a username$")
	public void i_enter_a_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I enter a username");
	}

	@Given("^I enter a \"([^\"]*)\" password$")
	public void i_enter_a_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I enter a \\\"([^\\\"]*)\\\" password");
	}

	@When("^I click on the login button$")
	public void i_click_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I click on the login button");
	}

	@Then("^I should be presented with a successful validation alert$")
	public void i_should_be_presented_with_a_successful_validation_alert() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I should be presented with a successful validation alert");
		driver.quit();
	}

	

}
