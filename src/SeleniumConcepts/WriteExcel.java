package SeleniumConcepts;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcel {
	public static void main (String [] args) throws IOException{
		 //create an object of Workbook and pass the FileInputStream object into it to create a pipeline between the sheet and eclipse.
		 FileInputStream fis = new FileInputStream("E:\\new pc\\gmail.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 Row row = sheet.createRow(1);
		 Cell cell = row.createCell(1);
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 cell.setCellValue("Data writeing on Execl");
		 FileOutputStream fos = new FileOutputStream("E:\\new pc\\gmail.xlsx");
		 workbook.write(fos);
		 fos.close();
		 System.out.println("Sucessfull");
		 }

}
