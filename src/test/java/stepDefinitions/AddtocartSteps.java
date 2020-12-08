package stepDefinitions;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.support.PageFactory;

import Framework_demoshop.Demoworkshop_methods;
import cucumber.api.java.Before;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import pageObjects.Addtocart_page;

	public class AddtocartSteps {
		WebDriver driver;
	    Addtocart_page objwebshop;
	    
	    
	    //User should be navigated to home page //   
		@Given("^User is on home page$")
		public void user_is_on_home_page() throws Throwable {
			 /*System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
		       driver=new ChromeDriver();    
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
			driver=Demoworkshop_methods.openBrowser();
		    objwebshop = new Addtocart_page(driver);
		    objwebshop = PageFactory.initElements(driver,Addtocart_page.class );
			driver.navigate().to("http://demowebshop.tricentis.com");
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("Log in")).click();
		    driver.findElement(By.name("Email")).sendKeys("dharmanavasuvd@gmail.com");
		    driver.findElement(By.name("Password")).sendKeys("123456");
		    
		}

		//User should be able to click on books list//
		@When("^User clicks on books link$")
		public void user_clicks_on_books_link() throws Throwable {
			 objwebshop.clickBooks();
		}

		//User should be able to select a book to add it to the cart//
		@When("^selects a book to add to cart$")
		public void selects_a_book_to_add_to_cart() throws Throwable {
			objwebshop.clickHealthBook();
		}

		//User should be able to click on add to cart//
		@When("^click on Add to cart$")
		public void click_on_Add_to_cart() throws Throwable {
			 objwebshop.clickAddToCart();
		}

		//User should be able to get item added successful message//
		@Then("^item is added to cart successfully$")
		public void item_is_added_to_cart_successfully() throws Throwable {
		System.out.println("The product has been added to your shopping cart");
		driver=Demoworkshop_methods.closeBrowser();
		}

	}

