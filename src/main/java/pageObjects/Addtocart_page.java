package pageObjects;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import Framework_demoshop.Demoworkshop_methods;

	public class Addtocart_page {
	    WebDriver driver;
	    @FindBy(linkText="Books")
	    @CacheLookup
	    WebElement books;
	    
	    @FindBy(linkText="Health Book")
	    @CacheLookup
	    WebElement HealthBook;
	    
	    @FindBy(id="add-to-cart-button-22")
	    @CacheLookup
	    WebElement addtocart;
	    
	    @FindBy(xpath="//*[@id='bar-notification']/p")
	    @CacheLookup
	    WebElement displaymsg;
	    
	    public Addtocart_page(WebDriver driver){
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }
	    
	    
	    public void clickBooks(){
	    	Demoworkshop_methods.clickButton(books);
	    }
	    public void clickHealthBook() {
	    	Demoworkshop_methods.clickButton(HealthBook);
	    }
	    public void clickAddToCart(){
	    	Demoworkshop_methods.clickButton(addtocart);
	    }

			
		}
	

