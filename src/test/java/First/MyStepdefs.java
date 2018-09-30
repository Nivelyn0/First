package First;

import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver driver;

    @And("^Go to the google page$")
    public void goToTheGooglePage() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); // Windows path to webdriver executable
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
        driver.quit();
    }
}
