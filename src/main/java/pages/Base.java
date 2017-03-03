package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import javax.jws.WebService;

public class Base {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumeasy.com/test/");



    }
}



