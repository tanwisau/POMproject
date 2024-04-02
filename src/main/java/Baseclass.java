import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Baseclass {


    static WebDriver driver;

    void openBrowser(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);


    }

    void switchWindow(){
        String currentWindow = driver.getWindowHandle();
        Set<String> windows =driver.getWindowHandles();

        for(String a:windows){
            if(currentWindow != a){
                driver.switchTo().window(a);
            }



        }

    }

    void dropDownByValue(WebElement element,String value){

        Select select=new Select(element);
        select.selectByValue(value);


    }

    void closeBrowser() {
        driver.quit();
    }

    void waitForElementVisibility(int time,WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(element));
    }



    void waitForElementClickable(int time, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }




    }
