import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends TestNgBase{
//    private String homePage=url;

    @Test
    public void testTitleHomePage(){
        Assert.assertEquals("Selenium Easy - Best Demo website to practice Selenium Webdriver Online",driver.getTitle().toString());
        System.out.println(driver.getTitle().toString());
    }


}
