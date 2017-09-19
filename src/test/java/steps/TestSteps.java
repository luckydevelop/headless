package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;

public class TestSteps {

    static WebDriver driver;

    @Before
    public void before(){
        System.out.println("before HI!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @After
    public void makeScreen(Scenario scenario) {

        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("^Test$")
    public void test() {
        driver = new FirefoxDriver();

        driver.get("http://www.toolsqa.com");
        Assert.assertEquals(driver.getTitle(),"QA Automation Tools Tutorial");
        System.out.println(driver.getTitle());
    }

    @Given("^Test2$")
    public void test2()  {
         driver = new FirefoxDriver();
        driver.get("http://www.toolsqa.com");
        Assert.assertEquals(driver.getTitle(),"QA Automation Tools Tutorial2");
    }


}
