import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class iFrameTest extends Baseclass {

Iframeclass iframeclass;
    @BeforeMethod
    void starting() {

        openBrowser("https://google.com");
        iframeclass = PageFactory.initElements(driver, Iframeclass.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }

    @AfterMethod
    void close() {
        closeBrowser();

    }
        @Test
                void test28IframeText(){
            String expectedText="Sign in to Google";
            WebDriver actualText =iframeclass.iframeText();
            Assert.assertEquals(actualText ,expectedText);
        }





    @Test
    void test29Messages(){

        String expectedText="Sign in to Google";
        String actualText =iframeclass.messages();
        Assert.assertEquals(actualText ,expectedText);

    }
}