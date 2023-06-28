package testAidetic;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomAidetic.LoginElement;
import utils.Parameterization;
import utils.Utility;


public class AideticTestClass extends Utility {


	private WebDriver driver ;
	private LoginElement loginelement ;
	private Parameterization parameterization ;
	private Utility utility ;

	@BeforeTest
	public void launchBrowser() { 
		driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void createPomObject() {
		loginelement = new LoginElement(driver);
		parameterization = new Parameterization();
		utility = new Utility ();

	}

	@BeforeMethod
	public void beforeClass() throws EncryptedDocumentException, IOException {
		String FName= Parameterization.getData("TestData", 2, 1);
		driver.get(FName);
	}


	@Test(priority = 1 )
	public void verifywithGoogle() throws InterruptedException, EncryptedDocumentException, IOException {
		loginelement.clickOnacceptAll();
		driver.switchTo().frame(0);

		String FName= Parameterization.getData("TestData", 3, 1);
		String LName= Parameterization.getData("TestData", 4, 1);
		String Email= Parameterization.getData("TestData", 5, 1);

		loginelement.clickOncontiWithGoogle(FName, LName, Email);

	}

	@Test(priority = 2)
	public void verifyWithFacebook() throws EncryptedDocumentException, IOException {
		driver.switchTo().parentFrame();
		String FName= Parameterization.getData("TestData", 3, 1);
		String LName= Parameterization.getData("TestData", 4, 1);
		String Email= Parameterization.getData("TestData", 5, 1);
		loginelement.clickOncontiWithFaceBook(FName, LName, Email);
	}

	@Test(priority = 3)
	public void verifyWithApple()throws EncryptedDocumentException, IOException {
		String FName= Parameterization.getData("TestData", 3, 1);
		String LName= Parameterization.getData("TestData", 4, 1);
		String Email= Parameterization.getData("TestData", 5, 1);
		loginelement.clickOncontiWithApple(FName, LName, Email);
	}

	@Test(priority = 4)
	public void verifyWithMicrosoft()throws EncryptedDocumentException, IOException {
		String FName= Parameterization.getData("TestData", 3, 1);
		String LName= Parameterization.getData("TestData", 4, 1);
		String Email= Parameterization.getData("TestData", 5, 1);
		loginelement.clickOncontiWithMicrosoft(FName, LName, Email);
	}

	@Test(priority = 5)
	public void verifyWithSignUp()throws EncryptedDocumentException, IOException {
		String FName= Parameterization.getData("TestData", 3, 1);
		String LName= Parameterization.getData("TestData", 4, 1);
		String Email= Parameterization.getData("TestData", 5, 1);
		loginelement.clickOnsignUp(FName, LName, Email);
	}

			@Test(priority = 5 )
			public void verifyWithOther()throws EncryptedDocumentException, IOException {
				String FName= Parameterization.getData("TestData", 3, 1);
				String LName= Parameterization.getData("TestData", 4, 1);
				String Email= Parameterization.getData("TestData", 5, 1);
				loginelement.clickOnOther(FName, LName, Email);
			}

	@AfterMethod
	public void captureScreenshot() throws IOException {
		utility.screenshotMethod();
	}


	@AfterClass
	public void memoryClean() {
		driver.quit();
		loginelement = null ;
		parameterization = null ;
	}


}

















