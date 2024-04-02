import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class WindowTest extends Baseclass {

    WindowPage window;

    @BeforeMethod
    void starting() {
        openBrowser("https://demoqa.com/browser-windows");
        window = PageFactory.initElements(driver, WindowPage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }
    @AfterMethod
void close(){
    closeBrowser();
    }
//Testing if new window open and copy text
    @Test
    void test30Window(){
        window.openWindow();
        String actualMessage = window.copyMessage();
        String expectedMessage ="This is a sample page";
        Assert.assertEquals(actualMessage ,expectedMessage);
    }
//checking if new Tab open
    @Test
    void test31Tab(){
        window.openTab();
        String actual = window.copyMessage();
        String expected ="This is a sample page";
        Assert.assertEquals(actual ,expected);

    }

}


