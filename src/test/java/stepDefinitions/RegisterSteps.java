package stepDefinitions;

	import org.openqa.selenium.WebDriver;
	import cucumber.api.java.Before;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import java.util.concurrent.TimeUnit;
	import pageObjects.Registerpage;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.PageFactory;

import Framework_demoshop.Demoworkshop_methods;

	public class RegisterSteps {
		 WebDriver driver;
		 Registerpage objRegister;
		  
		/*@Before
		    public void openBrowser() {
		        System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
		         driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    objRegister= new Registerpage(driver);
		    objRegister = PageFactory.initElements(driver,Registerpage.class );
		 }*/
		    
		 //User should be navigated to registration page //
		@Given("^User is on registration page$")
		public void user_is_on_registration_page() throws Throwable {
			driver=Demoworkshop_methods.openBrowser();
			 driver.get("http://demowebshop.tricentis.com/register");
			 objRegister= new Registerpage(driver);
			  objRegister = PageFactory.initElements(driver,Registerpage.class );
			 
		}

		//User should be able to enter data in their fields//
		@When("^User enters all valid data in their respective fields$")
		public void user_enters_all_valid_data_in_their_respective_fields() throws Throwable {
			 //register to application
	        objRegister.clickGenderMale();
	        objRegister.setFirstName("vasu");
	        objRegister.setLastName("dharmana");
	        objRegister.setEmail("dharmanavasuvd@gmail.com");
	        objRegister.setPassword("123456");
	        objRegister.setConfirmPassword("123456");
	        objRegister.clickRegister();
		    
		}

		//Successful registration message should be displayed after clicking register//
		@Then("^message displayed Register Successful$")
		public void message_displayed_Register_Successful() throws Throwable {
			System.out.println("Register should be successful");
			Thread.sleep(1000);
			driver=Demoworkshop_methods.closeBrowser();
		}

		//User should leave first name blank//
		@When("^user leaves first Name blank$")
		public void user_leaves_first_Name_blank() throws Throwable {
			objRegister.clickGenderMale();
	        objRegister.setFirstName("");
	        objRegister.setLastName("dharmana");
	        objRegister.setEmail("dharmanavasuvd@gmail.com");
	        objRegister.setPassword("123456");
	        objRegister.setConfirmPassword("123456");
		    
		}

		//User should able to click the register button// 
		@When("^clicks the register button$")
		public void clicks_the_register_button() throws Throwable {
			objRegister.clickRegister();
		}

		//User should get first name error message//
		@Then("^display first name error message$")
		public void display_first_name_error_message() throws Throwable {
			System.out.println(" First name is required.");
		}

		//User should leave last name blank and able to click the button//
		@When("^user leaves last Name blank and clicks the button$")
		public void user_leaves_last_Name_blank_and_clicks_the_button() throws Throwable {
			objRegister.clickGenderMale();
	        objRegister.setFirstName("vasu");
	        objRegister.setLastName("");
	        objRegister.setEmail("dharmanavasuvd@gmail.com");
	        objRegister.setPassword("123456");
	        objRegister.setConfirmPassword("123456");
	        objRegister.clickRegister();
		}

		//User should get last name error message//
		@Then("^display last name error message$")
		public void display_last_name_error_message() throws Throwable {
			 System.out.println(" Last name is required.");
			 driver=Demoworkshop_methods.closeBrowser();
		}

		//user should enter all data//
		@When("^user enters all data$")
		public void user_enters_all_data() throws Throwable {
			  objRegister.clickGenderMale();
		        objRegister.setFirstName("vasu");
		        objRegister.setLastName("dharmana");
		        objRegister.setPassword("123456");
		        objRegister.setConfirmPassword("123456");
		     
		}

		//user should be able to enter incorrect email format and click the button//
		@When("^user enters incorrect email format and clicks the button$")
		public void user_enters_incorrect_email_format_and_clicks_the_button() throws Throwable {
			objRegister.setEmail("dharmanavasuvdgmail.com");
	        objRegister.clickRegister();
		}

		//user should get email error messages//
		@Then("^display email error message$")
		public void display_email_error_message() throws Throwable {
			 System.out.println("Wrong email");
			 driver=Demoworkshop_methods.closeBrowser();
		}

		//user should leave password blank and able to click the button//
		@When("^user leaves password blank and clicks the button$")
		public void user_leaves_password_blank_and_clicks_the_button() throws Throwable {
			 objRegister.clickGenderMale();
		        objRegister.setFirstName("vasu");
		        objRegister.setLastName("dharmana");
		        objRegister.setEmail("dharmanavasuvd@gmail.com");
		        objRegister.setPassword("");
		        objRegister.setConfirmPassword("123456");
		        objRegister.clickRegister();
		}

		//user should get password error messages//
		@Then("^display password error message$")
		public void display_password_error_message() throws Throwable {
			 System.out.println("Password is required");
			 driver=Demoworkshop_methods.closeBrowser();
		}

		//user should leave confirm password blank and able to click the button//
		@When("^user leaves confirm password blank and clicks the button$")
		public void user_leaves_confirm_password_blank_and_clicks_the_button() throws Throwable {
			objRegister.clickGenderMale();
	        objRegister.setFirstName("vasu");
	        objRegister.setLastName("dharmana");
	        objRegister.setEmail("dharmanavasuvd@gmail.com");
	        objRegister.setPassword("123456");
	        objRegister.setConfirmPassword("");
	        objRegister.clickRegister();
		}

		//user should get confirm password error messages//
		@Then("^display confirm password error message$")
		public void display_confirm_password_error_message() throws Throwable {
			 System.out.println("Password is required");
			 driver=Demoworkshop_methods.closeBrowser();
		}
	}

