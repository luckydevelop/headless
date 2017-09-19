package steps;

import cucumber.api.java.en.Given;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;

public class TestSteps {

    WebDriver driver;

    @Given("^Test$")
    public void test() throws Throwable {

      // System.setProperty("webdriver.gecko.driver", "C:\\Users\\luckyPC\\Desktop\\Temp");
       //System.setProperty("webdriver.firefox.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
       // File pathToBinary = new File("C:\Users\luckyPC\Desktop\Temp\ert\src\test\resources\drivers\geckodriver.exe");
       // FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
       // FirefoxProfile firefoxProfile = new FirefoxProfile();
       // FirefoxDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);

        //DesiredCapabilities capabilities=DesiredCapabilities.firefox();
       // capabilities.setCapability("marionette", true);
        //WebDriver driver = new FirefoxDriver(capabilities);

      //  WebDriver driver = new FirefoxDriver(capa);

        //DesiredCapabilities capabilities=DesiredCapabilities.firefox();

       // capabilities.setCapability("app", "PATH_TO_APP");
       //WebDriver driver = new FirefoxDriver();


        driver = new FirefoxDriver();

        driver.get("http://www.toolsqa.com");
        Assert.assertEquals(driver.getTitle(),"QA Automation Tools Tutorial2");
        System.out.println(driver.getTitle());
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
