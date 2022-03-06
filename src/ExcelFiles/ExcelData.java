package ExcelFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.cert.CRL;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelData {

      public static void (String[] args ) throws EncryptedDocumentException, IOException {
              FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
Workbook wb = WorkbookFactory.create(fis); 
Sheet sh = wb.getSheet("City");
Row row = sh.getRow(5);

Cell cell = row.getCell(0); 
String value = ((Object) cell).getStringCellValue(); 
System.out.println(value);

      }
}
