package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	public static String getData(String sheetname, int raw, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("src\\test\\resources\\AideticData.xlsx");
		String value =WorkbookFactory.create(file).getSheet("TestData").getRow(raw).getCell(cell).getStringCellValue();
		return value;
	}
}


