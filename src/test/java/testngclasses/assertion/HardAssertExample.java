package testngclasses.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test(description = "verify page text, bmw radio button & enabled text box on practice page")
    public void verifyPracticePage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
        WebElement pageText = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
        WebElement enabledTextBox = driver.findElement(By.id("enabled-example-input"));

        Assert.assertFalse(bmwRadioBtn.isSelected(), "bwm radio button shouldn't be selected by default");
        Assert.assertEquals(pageText.getText(), "Practice Page", "Practice Page text should be displayed");
        Assert.assertTrue(enabledTextBox.isEnabled(), "enabled text box should be enabled");

        driver.close();
    }
}
