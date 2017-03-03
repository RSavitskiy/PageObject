import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNgBase {


    private String url = "http://www.seleniumeasy.com/test/";
    protected WebDriver driver;


    @BeforeSuite
    public void initWebDriver() {
        driver = new FirefoxDriver();
        driver.get(url);
    }

    @AfterSuite
    public void closeWebDriver(){
        driver.close();
    }
}

