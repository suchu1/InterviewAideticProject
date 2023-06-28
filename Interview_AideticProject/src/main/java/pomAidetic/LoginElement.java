package pomAidetic;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;

public class LoginElement extends Utility {
	private WebDriver driver;

	@FindBy (xpath = "//button[text() = 'Accept All']")
	private WebElement acceptAll ;

	@FindBy (xpath = "(//span[text() = 'Continue with Google'])[1]")
	private WebElement contiWithGoogle ;

	@FindBy (xpath = "//button[@class='jss13 medium']")
	private WebElement contiWithFaceBook ;

	@FindBy (xpath = "//button[@buttontext='Continue with Apple']")
	private WebElement contiWithApple ;

	@FindBy (xpath = "//p[text() = 'Continue with Microsoft']")
	private WebElement contiWithMicrosoft ;

	@FindBy (xpath = "//p[text() = 'Other']")
	private WebElement Other ;

	@FindBy (xpath = "//a[contains(text(), 'Sign up')]")
	private WebElement signUp ;

	@FindBy (xpath = "//input[@fdprocessedid='1kwi1n']")
	private WebElement firstName ;

	@FindBy (xpath = "//input[@fdprocessedid='eiqeil']")
	private WebElement lastName;

	@FindBy (xpath = "//input[@fdprocessedid='h8ag78c']")
	private WebElement email ;

	@FindBy (xpath = "//button[text() = 'Create Account']")
	private WebElement creAccount ;



	public LoginElement (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	public void clickOnacceptAll () {
		acceptAll.click();
	}

	public void clickOncontiWithGoogle (String Fname, String Lname, String Email) {

		contiWithGoogle.click();
		try{
			firstName.isDisplayed();
			lastName.isDisplayed();
			email.isDisplayed();
			firstName.sendKeys(Fname);
			lastName.sendKeys(Lname);
			email.sendKeys(Email);
			creAccount.click();
		}
		catch (NoSuchElementException b){

			System.out.println("Expected WebElement not Displayed");
		}
	}


	public void clickOncontiWithFaceBook(String Fname, String Lname, String Email) {
		contiWithFaceBook.click();
		try{
			firstName.isDisplayed();
			lastName.isDisplayed();
			email.isDisplayed();
			firstName.sendKeys(Fname);
			lastName.sendKeys(Lname);
			email.sendKeys(Email);
			creAccount.click();
		}
		catch (NoSuchElementException b){

			System.out.println("Expected WebElement not Displayed");
		}
	}

	public void clickOncontiWithApple(String Fname, String Lname, String Email) {
		try{
			firstName.isDisplayed();
			lastName.isDisplayed();
			email.isDisplayed();
			firstName.sendKeys(Fname);
			lastName.sendKeys(Lname);
			email.sendKeys(Email);
			creAccount.click();
		}
		catch (NoSuchElementException b){

			System.out.println("Expected WebElement not Displayed");
		}
	}

	public void clickOncontiWithMicrosoft (String Fname, String Lname, String Email) {
		try{
			firstName.isDisplayed();
			lastName.isDisplayed();
			email.isDisplayed();
			firstName.sendKeys(Fname);
			lastName.sendKeys(Lname);
			email.sendKeys(Email);
			creAccount.click();
		}
		catch (NoSuchElementException b){

			System.out.println("Expected WebElement not Displayed");
		}
	}

	public void clickOnsignUp(String Fname, String Lname, String Email) {
		try{
			firstName.isDisplayed();
			lastName.isDisplayed();
			email.isDisplayed();
			firstName.sendKeys(Fname);
			lastName.sendKeys(Lname);
			email.sendKeys(Email);
			creAccount.click();
		}
		catch (NoSuchElementException b){

			System.out.println("Expected WebElement not Displayed");
		}
	}


	public void clickOnOther(String Fname, String Lname, String Email) {
		try{
			firstName.isDisplayed();
			lastName.isDisplayed();
			email.isDisplayed();
			firstName.sendKeys(Fname);
			lastName.sendKeys(Lname);
			email.sendKeys(Email);
			creAccount.click();
		}
		catch (NoSuchElementException b){
			System.out.println("Expected WebElement not Displayed");
		}

	}






}	



