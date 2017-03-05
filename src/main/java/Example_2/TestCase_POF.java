package Example_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestCase_POF {

    static WebDriver driver;


    public static void main(String[] args) {
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://store.demoqa.com");

        LogIn_PG_POF loginPage=PageFactory.initElements(driver,LogIn_PG_POF.class);
        Home_PG_POF homePage=PageFactory.initElements(driver,Home_PG_POF.class);

        homePage.lnk_MyAccount.click();
        loginPage.username.sendKeys("RSav08");
        loginPage.password.sendKeys("ecOj3T^(dc@VdtW$");
        loginPage.button_login.click();

        System.out.println("Login successful");

        homePage.lnk_LogOut.click();



    }

}
