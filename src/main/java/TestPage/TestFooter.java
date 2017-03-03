package TestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Base;
import pages.Footer;

import java.util.List;

public class TestFooter {


    private String baseUrl = "http://www.seleniumeasy.com/test/";
    private WebDriver driver = new FirefoxDriver();

    protected Footer footer;


    @BeforeTest
    public void inputDriver() {
        driver.get(baseUrl);

    }

    @AfterTest
    public void closeDriver() {
        driver.close();
    }

    @Test
    public void assertClickImputForms() {
        List<WebElement> list = (List<WebElement>) footer.clickImputForms();
        System.out.println(list.size());

    }
}
