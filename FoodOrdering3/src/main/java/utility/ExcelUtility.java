package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String ToGetDataFromExcel(String Sheetname, int Rownum, int Columnnum)
			throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream(".\\src\\test\\resources\\register.xlsx"));

		Sheet sh = wb.getSheet(Sheetname);
		String data = sh.getRow(Rownum).getCell(Columnnum).getStringCellValue();
		wb.close();
		return data;
	}

}
