package pageObjects;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;
    import Framework_demoshop.Demoworkshop_methods;

	public class Registerpage {
	    WebDriver driver;
	    
	    @FindBy(id="gender-male")
	    @CacheLookup
	    WebElement male;

	 

	    //using how class
	    @FindBy(how=How.ID, using="gender-female")
	    @CacheLookup
	    WebElement female;

	 

	    @FindBy(xpath="//*[@id='FirstName']")
	    @CacheLookup
	    WebElement fname;
	    
	    @FindBy(css="#LastName")
	    @CacheLookup
	    WebElement lname;
	    
	    @FindBy(name="Email")
	    @CacheLookup
	    WebElement email;
	    
	    @FindBy(name="Password")
	    @CacheLookup
	    WebElement password;
	    
	    @FindBy(name="ConfirmPassword")
	    @CacheLookup
	    WebElement confirmpwd;

	 

	    @FindBy(id="register-button")
	    @CacheLookup
	    WebElement register;
	    
	   
	    public Registerpage(WebDriver driver){
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }
	    
	    
	    
	    //setters
	    public void setFirstName(String firstname){
	    	Demoworkshop_methods.sendData(fname,firstname);
	        }
	    
	    public void setLastName(String lastname){
	    	Demoworkshop_methods.sendData(lname,lastname);
	            }
	    
	    public void setEmail(String Email){
	    	Demoworkshop_methods.sendData(email,Email);
	            }
	    
	    public void setPassword(String Password){
	    	Demoworkshop_methods.sendData(password,Password);
	            }
	    
	    public void setConfirmPassword(String Confirmpwd){
	    	Demoworkshop_methods.sendData(confirmpwd,Confirmpwd);
	            }
	    
	    public void clickGenderMale(){
	    	Demoworkshop_methods.clickButton(male);
	    }
	    
	    public void clickGenderFemale(){
	    	Demoworkshop_methods.clickButton(female);
	    }
	    public void clickRegister(){
	    	Demoworkshop_methods.clickButton(register);
	    }
	}

