package Example_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PageFactory_TestCase {

    static WebDriver driver;

    Home_PG_POF home_pg_pof;
    LogIn_PG_POF logIn_pg_pof;

    @BeforeMethod
    public void beforeMethod(){
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
        home_pg_pof= PageFactory.initElements(driver,Home_PG_POF.class);
        logIn_pg_pof=PageFactory.initElements(driver,LogIn_PG_POF.class);
    }

    @Test
    public void logInTest(){

        home_pg_pof.lnk_MyAccount.click();
        logIn_pg_pof.logIn_Action("RSav08","ecOj3T^(dc@VdtW$");
        home_pg_pof.lnk_LogOut.click();

    }

    @AfterMethod
    public void closeDriver(){
        driver.close();
    }
}
