package First;

import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class MyStepdefs {
    WebDriver driver;

    @And("^Go to the google page$")
    public void goToTheGooglePage() throws MalformedURLException {
        String localSeleniumHubUrl = "http://127.0.0.1:4446/wd/hub";

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); // Windows path to webdriver executable
//        driver = new ChromeDriver();
        driver = new RemoteWebDriver(new URL(localSeleniumHubUrl),getChromeOptions());
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
        driver.quit();
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return options;}
}
