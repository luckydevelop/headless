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

        File pathToBinary = new File("D:\\Programs\\Firefox47\\firefox.exe");
        FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        FirefoxDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);

      //  System.setProperty("webdriver.firefox.driver", "D:\\Programs\\Firefox47\\firefox.exe");
      //  WebDriver driver = new FirefoxDriver();
        driver.get("http://www.toolsqa.com");
        Assert.assertEquals(driver.getTitle(),"QA Automation Tools Tutorial");
        driver.quit();


    }
}
