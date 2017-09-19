package steps;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class TestSteps {

    @Given("^Test$")
    public void test() throws Throwable {

        String geckoDriverPath = "C:\\Users\\luckyPC\\Desktop\\Temp\\ert\\src\\test\\resources\\drivers\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", geckoDriverPath);
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumeasy.com");
        //String title = driver.getTitle();
       // System.out.println("Title is " + title );
      //  driver.quit();

        //System.setProperty("webdriver.gecko.driver", "D:\\Programs\\Firefox47\\firefox.exe");
      //  WebDriver driver = new FirefoxDriver();

        //File pathToBinary = new File("D:\\Programs\\Firefox47\\firefox.exe");
       // FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
      //  FirefoxProfile firefoxProfile = new FirefoxProfile();
       // FirefoxDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);

        //WebDriver driver = new FirefoxDriver(firefoxProfile);

//     // System.setProperty("webdriver.gecko.driver", "D:\\Programs\\Firefox47\\firefox.exe");
//       System.setProperty("webdriver.gecko.driver", "D:\\Programs\\Firefox47\\firefox.exe");
//       DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//     capabilities.setCapability("marionette", true);
//       WebDriver driver = new FirefoxDriver(capabilities);
//     //   WebDriver driver = new FirefoxDriver();
//     //  WebDriver driver = new FirefoxDriver(capabilities);
//      // WebDriver driver = new FirefoxDriver();
//       // driver.get("http://www.toolsqa.com");
//
//       // WebDriver webDriver = new ChromeDriver();
//
////        File pathToBinary = new File("C:\\Users\\luckyPC\\Desktop\\Temp\\ert\\src\\test\\resources\\drivers\\geckodriver.exe");
////       FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
////        FirefoxProfile firefoxProfile = new FirefoxProfile();
////        new GeckoDriverService()
////        WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
//       // WebDriver driver = new FirefoxDriver();
//
//       // File pathToBinary = new File("D:\\Programs\\Firefox47\\firefox.exe");
//      //  FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
//       // FirefoxProfile firefoxProfile = new FirefoxProfile();
//      //  WebDriver driver = new FirefoxDriver();
//
//       // WebDriver driver = new GeckoDriverService();
//
//       // File pathToBinary = new File("D:\\Programs\\Firefox47\\firefox.exe");
//       // FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
//       // FirefoxProfile firefoxProfile = new FirefoxProfile();
//
//       // File pathToBinary = new File("D:\\Programs\\Firefox47\\firefox.exe");
//       // FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
//       //FirefoxProfile firefoxProfile = new FirefoxProfile();
//        //WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
//       // WebDriver driver = new FirefoxDriver();


       // driver.get("https://mvnrepository.com");
       // String title = driver.getTitle();
       // System.out.println(title);
      //  Assert.assertEquals("Maven Repository: Search/Browse/Explore",title);


    }
}
