import com.beust.ah.A;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTest extends Baseclass{

   Homepage homepage;

   @BeforeMethod
   void starting(){
        openBrowser("https://ebay.com");
        homepage = PageFactory.initElements(driver, Homepage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }
    @AfterMethod
    void finishTest(){
       closeBrowser();
    }

    //click motors

    @Test
    void test1Motors(){
       String expectedUrl ="https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334";
       homepage.clickMotors();
       String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl ,expectedUrl);

    }
    // checking the mouse move over motors
    @Test
    void test2Classics(){
       homepage.moveToMotors();
       homepage.clickMotors();
       String expectedUrl ="https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334";
       String actualUrl =driver.getCurrentUrl();

       Assert.assertEquals(actualUrl ,expectedUrl);
    }
    //search something on search box
    @Test
    void test3Search(){
       String key ="monitor";
       homepage.search(key);
       String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("laptop"));
    }
    // checking copy text

    @Test
    void test4About(){
       String expectedText ="About eBay";
       String actualText = homepage.textAbout();
       Assert.assertEquals(actualText ,expectedText);
    }
     //testing how many  links are in a website

   @Test
    void test5Links() {
       Assert.assertEquals(homepage.alllinks(), 448);

   }
    //checking  searchbutton click on perfectly

    @Test
    void test6searchbutton(){
       homepage.clickSearchbutton();
    }

    // testing mouse click on Electronics
    @Test
    void test7Electronics(){
       String expectedUrl = "https://www.ebay.com/b/Electronics/bn_7000259124";
       homepage.clickElectronics();
       String actualUrl =driver.getCurrentUrl();
       Assert.assertEquals(actualUrl ,expectedUrl);
    }
    // testing mouse move over Electronics
    @Test
    void test8Headphones(){
       homepage.moveToElectronics();
       homepage.clickElectronics();
       String expectedUrl ="https://www.ebay.com/b/Headphones/112529/bn_879608";
       String actualUrl =driver.getCurrentUrl();
       Assert.assertEquals(actualUrl ,expectedUrl);




    }
    // checking the mouse click properly on Toys
    @Test
    void test9Toys(){
       String expectedUrl="https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497";
       homepage.clickToys();
       String actualUrl =driver.getCurrentUrl();
       Assert.assertEquals(actualUrl ,expectedUrl);
    }

    //checking  logo is working

    @Test
    void test15Logo(){
       homepage.checkLogo();
       String actualUrl="https://www.ebay.com/";
       String expectedUrl= driver.getCurrentUrl();
       Assert.assertEquals(actualUrl,expectedUrl);
    }

    //testing synchronizationWait

    @Test

    void test16Synchronization() {
        String expectedUrl = "https://www.ebay.com/sch/i.html?_from=R40&_trksid=p4432023.m570.l1311&_nkw=macbook&_sacat=0";homepage.searchBtn();
     homepage.searchBtn();
        String actualdUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualdUrl, expectedUrl);
    }

    //checking cart is displayed/enabled

    @Test
    void test17cart(){
       boolean actual = homepage.checkCart();
       boolean expected =true;
       Assert.assertEquals(actual , expected);
    }

    //Testing header is displayed

    @Test
    void test18Header(){
       boolean actual = homepage.checkHeader();
       boolean expected =true;
       Assert.assertEquals(actual ,expected);
    }
  //testing dropdown by text of all category
    @Test
    void test20dropDown() {
       homepage.selectCategory();
       homepage.searchBook();
        String expectedTitle = "Book";
        String actualTitle = homepage.copyTitle();

       // Assert.assertEquals(actualText, expectedText);
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
       //checking myeBay button is working

        @Test
        void test21CheckmyEbay() {
            homepage.moveTowatchList();
            String expected = "Electronics, Cars, Fashion, Collectibles & More | eBay";
            String actual = driver.getTitle();
            Assert.assertEquals(actual, expected);

        }

       //checking if helpandContact button working

    @Test
    void test22Helpbtn() {
        String actual = homepage.checkHelpandContact();
        String expected = "How can we help you today?";
        Assert.assertEquals(actual, expected);

    }

//checking if sellBtn is working
    @Test
    void test23SellBtn() {
        String actual = homepage.setSellBtn();
        String expected = "https://www.ebay.com/sl/sell";
        Assert.assertEquals(actual, expected);

    }
    //checking if footer is enabled

    @Test

    void test24Footer(){
       boolean actual= homepage.checkFooter();
       boolean expected=true;
       Assert.assertEquals(actual ,expected);

    }
    //checking if HelpBtn is displayed

    @Test
    void test25HelpBtn(){
       boolean actual= homepage.checkHelp();
       boolean expected=true;
        Assert.assertEquals(actual , expected);
    }

    //Verifying how many footer Links are there

    @Test
    void test26Footer(){
       int expected = 5;
       int actual =homepage.footer1Links();
       Assert.assertEquals(actual ,expected);

    }
    //verying Logolink is displayed

    @Test

    void test27Logolink(){
       boolean actual= homepage.logolink();
       boolean expected =true;
       Assert.assertEquals(actual ,expected);
    }







    }












