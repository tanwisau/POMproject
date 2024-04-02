import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends Baseclass{

    @FindBy(id="windowButton")
    WebElement newWindow;

    @FindBy(id="sampleHeading")
    WebElement title;

    @FindBy(id="tabButton")
    WebElement newTab;

    void openWindow(){
        newWindow.click();
        switchWindow();
    }

    void openTab(){
        newTab.click();
        switchWindow();
    }

    String copyMessage(){
        return title.getText();
    }


}


