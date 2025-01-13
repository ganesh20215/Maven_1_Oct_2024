package testngclasses.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicsOfTestNG {
    public static WebDriver driver;

    @BeforeMethod
    public void preRequsite(){
        driver = new ChromeDriver();
    }

    @Test(description = "verify test case 1")
    public void testCase_1(){
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    }

    @Test
    public void testCase_2(){
        driver.get("https://www.amazon.in/");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
