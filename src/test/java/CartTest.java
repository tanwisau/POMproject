import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CartTest extends Baseclass {

   Cartclass cartclass;
   @BeforeMethod
    void starting(){
        openBrowser("https://cart.payments.ebay.com/");
        cartclass= PageFactory.initElements(driver ,Cartclass.class);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));


    }

    @AfterMethod
    void close(){
       closeBrowser();
    }


    //Get text

    @Test
    void test10text(){
       String expected ="You don't have any items in your cart.";
       String actual =cartclass.text();
        Assert.assertEquals(actual , expected);


    }
    //click on specific button
    @Test
    void test11Shop(){
       cartclass.clickShop();
       String actualUrl = driver.getCurrentUrl();
       String expectedUrl="https://www.ebay.com/";
       Assert.assertEquals(actualUrl ,expectedUrl);
    }

   // Get text from cartpage comment
    @Test
    void test12Comment(){
       String expected ="Send Us Your Comments";
       String actual =cartclass.text();
       Assert.assertEquals(actual , expected);



    }

    //click on sign in button
    @Test
    void test13Signin(){
       cartclass.clickSignin();
       String actualUrl= driver.getCurrentUrl();
       String expectedUrl="https://www.ebay.com/";
       Assert.assertEquals(actualUrl ,expectedUrl);
    }


    @Test
    void test14Title(){
       String expectedTitle="Hello";
       String actualTitle =cartclass.text();
       Assert.assertEquals(actualTitle ,expectedTitle);

    }


}
