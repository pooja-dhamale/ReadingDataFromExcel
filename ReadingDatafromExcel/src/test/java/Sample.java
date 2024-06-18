import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sample {

	public static void main(String[] args) throws FileNotFoundException {
		
		String excelFilePath = System.getProperty("user.dir")+"\\files\\employees.xlsx";
		File excelFile = new File(excelFilePath);
		FileInputStream fis = new FileInputStream(excelFile);
		
	}
}
