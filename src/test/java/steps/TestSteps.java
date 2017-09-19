package steps;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;

public class TestSteps {

    @Given("^Test$")
    public void test() throws Throwable {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\luckyPC\\Desktop\\Temp\\ert\\src\\test\\resources\\drivers\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(capabilities);
        driver.get("http://www.toolsqa.com");
        Assert.assertEquals(driver.getTitle(),"QA Automation Tools Tutorial");
        driver.quit();


    }
}
