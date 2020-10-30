package stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
public class MyStepDefinations {

	public WebDriver driver;
	

			@Given("Open home page")
			public void open_home_page() {
			  
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Work\\chromedriver.exe");
			    driver  = new ChromeDriver();	    	
		        driver.get("https://www.facebook.com/");
			}



			@When("User input {string} and {string}")
			public void user_input_and(String email, String password) {
			   
				//driver.findElement(By.xpath("")).sendKeys(email);
			}
			@Then("User cannot login")
			public void user_cannot_login() {
			    
			}





}
