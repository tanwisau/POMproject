import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CategoryTest extends Baseclass{

    Categoryclass shopbyCategoryclass;

    @BeforeMethod

    void starting(){
        openBrowser("https://www.ebay.com");
        shopbyCategoryclass= PageFactory.initElements(driver , Categoryclass.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }

    @AfterMethod
    void close(){
        closeBrowser();
    }


    @Test
    void test19CategoryText(){
      String expectemsg="Shop by category";
      String actualmsg =shopbyCategoryclass.category.getText();
        Assert.assertEquals(actualmsg , expectemsg);


        }


    }
