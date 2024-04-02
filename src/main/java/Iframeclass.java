import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Iframeclass extends Baseclass {


    @FindBy(xpath = "//div[@class=\"hXhhq\"]")
    WebElement iFrameText;

    @FindBy(xpath = "//div[@class=\"hXhhq\"]")
    WebElement signinText;




     WebDriver iframeText() {
         iFrameText.getText();
         return driver.switchTo().frame("callout");
    }

    String messages() {
        return signinText.getText();


    }
        }
