package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	public static String getData(String sheetname, int raw, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file1=new FileInputStream("src\\main\\resources\\TestData.xlsx");
		String value =WorkbookFactory.create(file1).getSheet("Data").getRow(raw).getCell(cell).getStringCellValue();
		return value;
	}
}


