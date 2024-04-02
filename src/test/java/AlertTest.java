import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTest extends Baseclass{
    Alertpage alertpage;
    @BeforeMethod

    void starting(){
        openBrowser("https://demoqa.com/alerts");
        alertpage = PageFactory.initElements(driver, Alertpage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Test
    void test14Alertbuttonaccept(){
        alertpage.clickalertButton();
    }


}
