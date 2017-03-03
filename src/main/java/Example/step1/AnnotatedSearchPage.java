package Example.step1;

import Example.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnnotatedSearchPage implements SearchPage {
    @FindBy(id = "text")
    private WebElement searchField;

    @FindBy(css = "input[type=\"submit\"]")
    @CacheLookup
    private WebElement searchButton;


    public void search(final String query) {
        searchField.sendKeys(query);
        searchButton.click();
    }


    public void init(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

