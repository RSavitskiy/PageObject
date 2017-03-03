package Example.initial;

import Example.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimpleSearchPage implements SearchPage {

    private WebDriver driver;

    public void search(String query) {
        driver.findElement((By.id("text"))).sendKeys(query);
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();

    }

    public void init(WebDriver driver) {
        this.driver=driver;

    }
}
