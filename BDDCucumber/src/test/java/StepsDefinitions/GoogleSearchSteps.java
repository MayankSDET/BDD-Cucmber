package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Browser is open");
		
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",  projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
	}

	@And("user is on google search")
	public void user_is_on_google_search() {
		System.out.println("User is on the google Page");
		driver.get("https://www.google.co.in/");
	}

	@When("user enetrs the text in the search box")
	public void user_enetrs_the_text_in_the_search_box() {
		System.out.println("User enters the text in the text box");
		driver.findElement(By.name("q")).sendKeys("Facebook");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("User hits the enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to the search results")
	public void user_is_navigated_to_the_search_results() {
		System.out.println("User is navigated to the search results");
		
		driver.getPageSource().contains("Log In");
		driver.close();
		driver.quit();
	}


}
