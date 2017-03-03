package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer extends Base {





    @FindBy(xpath = ".//*[@id='navbar-brand-centered']/ul[1]/li[1]/a")
    public WebElement inputForms;


    public WebElement clickImputForms() {
        inputForms.click();
        return (WebElement) this;
    }
}