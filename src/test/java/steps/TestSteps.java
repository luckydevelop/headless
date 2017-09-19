package steps;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.File;

public class TestSteps {

    @Given("^Test$")
    public void test() throws Throwable {

        String geckoDriverPath = "C:\\Users\\luckyPC\\Desktop\\Temp\\ert\\src\\test\\resources\\drivers\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", geckoDriverPath);
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumeasy.com");


    }
}
