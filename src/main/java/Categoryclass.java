import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categoryclass extends Baseclass{

    @FindBy(xpath = "//button[@id=\"gh-shop-a\"]")
    WebElement category;




    String textmsg(){
        String msg= category.getText();
        return msg;



    }
}


