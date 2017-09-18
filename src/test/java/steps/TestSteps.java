package steps;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestSteps {

    @Given("^Test$")
    public void test() throws Throwable {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\luckyPC\\Desktop\\Temp\\ert\\src\\test\\resources\\drivers\\geckodriver.exe");
        //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
      //  capabilities.setCapability("marionette", true);
        //WebDriver driver = new FirefoxDriver(capabilities);
        WebDriver driver = new FirefoxDriver();
       // driver.get("http://www.toolsqa.com");

       // WebDriver webDriver = new ChromeDriver();
        driver.get("https://mvnrepository.com");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Maven Repository: Search/Browse/Explore",title);


    }
}
