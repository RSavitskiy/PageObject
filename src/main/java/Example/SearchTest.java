package Example;

import Example.initial.SimpleSearchPage;
import Example.step1.AnnotatedSearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class SearchTest {

    private WebDriver driver;


    @Test(dataProvider = "pageObjects")
    public void testSearch(final SearchPage searchPage){
        searchPage.init(driver);
        driver.get("http://ya.ru");
        searchPage.search("Lolek i bolek");

    }


    @DataProvider
    private Object[][] pageObjects() {
        return new Object[][]{
                {new SimpleSearchPage()},
                {new AnnotatedSearchPage()},
//                {new ExtendedSearchPage()},
//                {new SearchPageWithSearchForm()}
        };
    }

    @BeforeClass
    public void beforeClass(){
        driver=new FirefoxDriver();
    }

    @AfterClass
    public void afterClass(){
        driver.close();
    }
}
