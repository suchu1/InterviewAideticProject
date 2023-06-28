package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public void screenshotMethod() throws IOException {
		TakesScreenshot driver = new ChromeDriver () ;
		TakesScreenshot ts = (TakesScreenshot)driver ;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String ScreenshotName = generateRandomName() +".png";
		File dest = new File ("src\\test\\resources\\Screenshots\\" + ScreenshotName);
		src.renameTo(dest);
		FileHandler.copy(src, dest);
	}
	private static String generateRandomName () {
		return UUID.randomUUID().toString();
	}

}
