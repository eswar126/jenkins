package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Loginpage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Framework_demoshop.Demoworkshop_methods;

	public class LoginSteps {
		WebDriver driver;
	    Loginpage  objlog;
		
	  //User should be navigated to login page //
		@Given("^User is on login page$")
		public void user_is_on_login_page() throws Throwable {
			/*System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
			driver=Demoworkshop_methods.openBrowser();
		    objlog = new Loginpage(driver);
		    driver.get("http://demowebshop.tricentis.com/login");
		    driver.manage().window().maximize();
		    objlog = PageFactory.initElements(driver,Loginpage.class );
		    driver.findElement(By.linkText("Log in")).click();
		}

		//User should be able to enter data in their fields//
		@When("^User enters all valid data$")
		public void user_enters_all_valid_data() throws Throwable {
			 objlog.enterEmail("dharmanavasuvd@gmail.com");    Thread.sleep(1000);
			 objlog.enterPassword("123456");    Thread.sleep(1000);
		}

		//User should be able to click on login button//
		@When("^click on Log in$")
		public void click_on_Log_in() throws Throwable {
			 objlog.clickLogin();
		}

		//User should be able to get login successful//
		@Then("^login should be successful$")
		public void login_should_be_successful() throws Throwable {
			System.out.println("login is successful");
			driver=Demoworkshop_methods.closeBrowser();
		}

		//User should be able to enter invalid data in email and password fields//
		@When("^I enter Email  as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
		public void i_enter_Email_as_and_Password_as(String arg1, String arg2) throws Throwable {
			objlog.enterEmail(arg1);   
			Thread.sleep(1000);
		    objlog.enterPassword(arg2);  
            Thread.sleep(1000);
		}

		//User should be able to get login unsuccessful//
		@Then("^login should be Unsuccessful$")
		public void login_should_be_Unsuccessful() throws Throwable {
			 System.out.println("login is unsuccessfull");
			 driver=Demoworkshop_methods.closeBrowser();
		}
	}

