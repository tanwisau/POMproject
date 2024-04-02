import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class Homepage extends Baseclass {


    @FindBy(xpath = "//li[@data-hover-track=\"p4375194.m1379.l6435\"]")
    WebElement motors;

    @FindBy(css = "[data-hover-track=\"p4375194.m1379.l6435\"]")
    WebElement classics;

    @FindBy(css = "[placeholder=\"Search for anything\"]")
    WebElement searchbox;

    @FindBy(css = "[_sp=\"m571.l2932\"]")
    WebElement aboutEbay;

    @FindBy(xpath = "//a")
    List<WebElement> links;

    @FindBy(xpath = "//input[@id=\"gh-btn\"]")
    WebElement searchbutton;

    @FindBy(css = "[data-hover-track=\"p4375194.m1380.l6435\"]")
    WebElement electronics;

    @FindBy(css = "[_sp=\"p4375194.m1380.l3257\"]")
    WebElement headphones;

    @FindBy(xpath = "//li@[data-hover-track=\"p4375194.m1384.l6435\"]")
    WebElement toys;

    @FindBy(xpath = "//select[@id=\"gh-cat\"]")
    WebElement dropDown;

    @FindBy(css = "[aria-label=\"Select a category for search\"]")
    WebElement productTitle;

    @FindBy(xpath = "//img[@id=\"gh-logo\"]")
    WebElement logo;

    @FindBy(xpath = "//a[@data-sp=\"m570.l2633\"]")
    WebElement cart;

    @FindBy(xpath = "//div[@id=\"vl-flyout-nav\"]")
    WebElement header;


    @FindBy(xpath = "//input[@aria-owns=\"ui-id-1\"]")
    WebElement searchbar;

    @FindBy(css = "[id=\"ui-id-136\"]")
    WebElement searchBtn;

    @FindBy(css = "[title=\"My eBay\"]")
    WebElement myEbay;

    @FindBy(css = "[data-sp=\"m570.l1534\"]")
    WebElement watchlist;

    @FindBy(css = "[data-sp=\"m570.l1545\"]")
    WebElement helpContactBtn;

    @FindBy(css = "[data-sp=\"m570.l1528\"]")
    WebElement sell;

    @FindBy(xpath = "//footer[@id=\"glbfooter\"]")
    WebElement footer;

    @FindBy(xpath = "//div[@id=\"gf-BIG\"]")
    WebElement helpBtn;

    @FindBy(xpath = "//footer[@id=\"glbfooter\"] //a[@class=\"gf-bttl thrd\"]")
    List<WebElement>footer1Links;

    @FindBy(xpath = "//img[@id=\"gh-logo\"]")
    WebElement logoLink;


    void clickMotors() {
        motors.click();
    }

    void moveToMotors() {
        Actions actions = new Actions(driver);
        actions.moveToElement(motors);
    }

    void clickClassics() {
        classics.click();

    }

    void search(String searchKey) {

        searchbox.sendKeys(searchKey, Keys.ENTER);
    }

    String textAbout() {

        return aboutEbay.getText();
    }

     int alllinks() {

         return links.size();

     }
     void clickSearchbutton() {

        searchbutton.click();
    }

    void clickElectronics() {

        electronics.click();
    }

    void moveToElectronics() {
        Actions actions = new Actions(driver);
        actions.moveToElement(electronics);

    }

    void clickHeadphones() {

        headphones.click();
    }

    void clickToys() {
        toys.click();
    }

    void moveToToys() {
        Actions actions = new Actions(driver);
        actions.moveToElement(toys);

    }

    void clickLogo() {
        logo.click();


    }

    public void checkLogo() {
    }

    void  searchBar() {

        searchbar.sendKeys("mac");


    }
    void searchBtn() {
        searchBtn.click();



    }

    void selectCategory() {
        dropDownByValue(dropDown, "2984");


    }

    void searchBook(){
        searchbox.sendKeys("Book");
    }

    String copyTitle() {
        return productTitle.getText();

    }
    boolean checkCart() {
        return cart.isDisplayed();
    }

    boolean checkHeader() {
        return header.isDisplayed();
    }

    void checkMyeBay() {
        myEbay.click();


    }

    void moveTowatchList() {
        Actions actions = new Actions(driver);
        actions.moveToElement(myEbay);


    }

    String checkHelpandContact() {
        return helpContactBtn.getText();
    }

    String setSellBtn() {
        sell.click();
        return driver.getCurrentUrl();


    }
    boolean checkFooter(){
        return footer.isEnabled();
    }

    boolean checkHelp(){
        return helpBtn.isDisplayed();
    }

    int footer1Links(){
        return footer1Links.size();
    }

    boolean logolink(){
        return logoLink.isDisplayed();




    }
}
















