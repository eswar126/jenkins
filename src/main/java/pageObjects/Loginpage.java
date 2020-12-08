package pageObjects;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import Framework_demoshop.Demoworkshop_methods;
	 
	public class Loginpage {

	    WebDriver driver;
	    
	    @FindBy(name="Email")
	    @CacheLookup
	    WebElement lemail;
	    
	    @FindBy(name="Password")
	    @CacheLookup
	    WebElement lpassword;
	    
	    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	    @CacheLookup
	    WebElement login;
	    
	    public Loginpage(WebDriver driver){
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }
	    
	    
	    public void enterEmail(String Email){
	    	Demoworkshop_methods.sendData(lemail,Email);
	            }
	    
	    public void enterPassword(String Password){
	    	Demoworkshop_methods.sendData(lpassword,Password);
	    }
	    
	    public void clickLogin(){
	    	Demoworkshop_methods.clickButton(login);
	    }
		}
	

