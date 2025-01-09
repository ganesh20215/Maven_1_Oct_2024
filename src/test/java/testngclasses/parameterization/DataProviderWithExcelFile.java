package testngclasses.parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcelFile {

    @DataProvider(name = "test-data")
    public Object[][] dataFun() throws IOException {
        Object[][] arrObj = getExcelData("D:\\classes\\TestNGDemoForMorningBatch.xlsx", "TestCases");
        return arrObj;
    }

    public String[][] getExcelData(String fileName, String sheetName) throws IOException {
        FileInputStream file = new FileInputStream(fileName);       //Normal File Access
        XSSFWorkbook wb = new XSSFWorkbook(file);                   //Excel File Access
        XSSFSheet sheet = wb.getSheet(sheetName);                   //Sheet Name Access
        XSSFRow row = sheet.getRow(0);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfColn = row.getLastCellNum();

        Cell cell;

        String[][] data = new String[noOfRows - 1][noOfColn];

        for (int i = 1; i <= noOfRows-1; i++) {
            for (int j = 0; j < noOfColn; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue();
            }
        }

        return data;
    }

    @Test(dataProvider = "test-data")
    public void verifyNeedOfParameterization(String cityName, String courseName) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(cityName + " " + courseName);
        searchTextBox.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        driver.close();
    }
}
