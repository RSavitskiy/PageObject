package Example_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LogIn_TestCase {

    private static WebDriver driver=null;

    public static void main(String[] args) {
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
        driver.findElement(By.id("account")).click();
        driver.findElement(By.id("log")).sendKeys("RSav08");
        driver.findElement(By.id("pwd")).sendKeys("ecOj3T^(dc@VdtW$");
        driver.findElement(By.id("login")).click();
        System.out.println("Login successful ");
        driver.findElement(By.id("account_logout"));
        driver.quit();
    }

}
