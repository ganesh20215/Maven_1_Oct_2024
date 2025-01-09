package testngclasses.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test(description = "verify page text, bmw radio button & enabled text box on practice page")
    public void verifySoftAssert(){
        SoftAssert ast = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
        WebElement pageText = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
        WebElement enabledTextBox = driver.findElement(By.id("enabled-example-input"));

        ast.assertTrue(bmwRadioBtn.isSelected(), "bwm radio button shouldn't be selected by default");
        ast.assertEquals(pageText.getText(), "Practice", "Practice Page text should be displayed");
        ast.assertTrue(enabledTextBox.isEnabled(), "enabled text box should be enabled");

        ast.assertAll();
    }
}
