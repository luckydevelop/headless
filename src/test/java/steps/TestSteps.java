package steps;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSteps {

    @Given("^Test$")
    public void test() throws Throwable {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("headless");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://mvnrepository.com");
        String title = webDriver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Maven Repository: Search/Browse/Explore",title);


    }
}
