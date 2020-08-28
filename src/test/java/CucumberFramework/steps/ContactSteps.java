package CucumberFramework.steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactSteps {
	WebDriver driver;

	@Before()
	public void setup() {
		//start up Chrome
		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/chromedriver");		
		
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	
	}
	
	@Given("^I access webdriveruniversity$")
	public void i_access_webdriveruniversity() throws Throwable {
		driver.get("http://webdriveruniversity.com/");
		Thread.sleep(1000);
	}

	@When("^I click on the contact us button$")
	public void i_click_on_the_contact_us_button() throws Throwable {
	    driver.findElement(By.id("contact-us")).click();
	    Thread.sleep(1000);
	}

	@When("^I enter a valid first name$")
	public void i_enter_a_valid_first_name() throws Throwable {
		@SuppressWarnings("unused")
		String winHandleBefore = driver.getWindowHandle();
		
		for(String winHandle: driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		
	    driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("felipe");
	    Thread.sleep(500);
	}

	@When("^I enter a valid last name$")
	public void i_enter_a_valid_last_name() throws Throwable {
	    driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Sousa");
	    Thread.sleep(500);
	}

	@When("^I enter a valid email address$")
	public void i_enter_a_valid_email_address() throws Throwable {
	    driver.findElement(By.cssSelector("input[name='email']")).sendKeys("felipe@gmail.com");
	    Thread.sleep(500);
	}

	@When("^I enter commments$")
	public void i_enter_commments(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(data.get(0).get(0) + "\n");
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(data.get(0).get(1) + "\n");
		Thread.sleep(500);
	}

	@When("^I click on the submit button$")
	public void i_click_on_the_submit_button() throws Throwable {
	    driver.findElement(By.cssSelector("input[value='SUBMIT'")).click();
	    Thread.sleep(500);
	}

	@Then("^the information should successfully be submitterd via the contact us form$")
	public void the_information_should_successfully_be_submitterd_via_the_contact_us_form() throws Throwable {
		Thread.sleep(1000);
		
		boolean worked = driver.getPageSource().contains("Thank You for your Message!");

		Assert.assertTrue(worked);
		driver.quit();
	    
	}
}
