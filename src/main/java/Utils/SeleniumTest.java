package Utils;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by dell on 7.7.2017 г..
 */
public class SeleniumTest {
    //@test
    public void startWebDriver(){

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http/seleniumsimplified.com");
        Assert.assertTrue("title",
                driver.getTitle().startsWith("Selenium Simplifield"));
        driver.close();
        driver.quit();
    }
}
