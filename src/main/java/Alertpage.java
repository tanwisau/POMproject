import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Alertpage extends Baseclass {

    @FindBy (css = "[id=\"alertButton\"]")
    WebElement alertButton;


    void clickalertButton(){
        alertButton.click();
        driver.switchTo().alert().accept();
    }

}
