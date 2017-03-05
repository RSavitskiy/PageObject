package Example_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogIn_PG_POF {

    final WebDriver driver;

    public LogIn_PG_POF(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how= How.ID,using = "log")
    public WebElement username;

    @FindBy(how = How.ID, using = "pwd")
    public WebElement password;

    @FindBy(how = How.ID,using = "login")
    public WebElement button_login;

    public void logIn_Action(String userName, String userPassword){

        username.sendKeys(userName);
        password.sendKeys(userPassword);
        button_login.click();

    }
}
