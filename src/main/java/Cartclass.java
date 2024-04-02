import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cartclass {


    @FindBy(xpath = "//div[@class=\"font-title-3\"]")
    WebElement cartText;

    @FindBy(css = "[data-test-id=\"start-shopping\"]")
    WebElement startShopping;

    @FindBy(xpath = "//div[@id=\"survey-link\"]")
    WebElement commentText;

    @FindBy(css = "[data-test-id=\"SIGN_IN\"]")
    WebElement signin;

    @FindBy(xpath = "//button[@data-test-id=\"SIGN_IN\"]")
    WebElement title;

    String text(){
        String cart = cartText.getText();
        return cart;
    }
    void clickShop(){
        startShopping.click();
    }
    String textComment(){
        String comment = commentText.getText();
        return comment;
    }

    void clickSignin(){
        signin.click();


    }
    String copyText(){
        return title.getText();
    }

}


