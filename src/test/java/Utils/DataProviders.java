package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders {
    // This one is providing a single String as a search term
    // We can use an Excel reader or File CSV reader inside it to get data from outsource
    // For this example we use Excel Reader

    @DataProvider(name = "searchTermsProvider")
    public Object[][] Data() throws IOException {
        String[][] GetData;
        XSSFWorkbook workbook = new XSSFWorkbook(System.getProperty("user.dir") + "\\src\\Terms.xlsx");
        XSSFSheet sheet = workbook.getSheet("Terms");
        int rows = sheet.getLastRowNum() + 1;
        int columns = sheet.getRow(0).getLastCellNum();
        GetData = new String[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                GetData[i][j] = sheet.getRow(i).getCell(j).toString();
            }
        }
        return GetData;
    }

}
