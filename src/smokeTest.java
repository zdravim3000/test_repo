import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class smokeTest {
    @Test
    public void smokeTest()
    {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("http://www.bitbar.com/enterprise");
        WebElement element = webDriver.findElement(By.cssSelector(".b-cta__content > h2:nth-child(1)"));
        assertEquals (element.getText(), "Unleash the Power of BitBar for Your Enterprise");
        webDriver.quit();
    }
}
