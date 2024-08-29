package pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlaceOrderPage extends LoginPage {

    private static final By searchBox = By.xpath("//input[@id='search']");
    private static final By search = By.xpath("//button[@title='Search']");
    private static final By searchedItem = By.xpath("//span[@class='base']");
    private static final By teeImage = By.xpath("//img[@alt='Deion Long-Sleeve EverCool™ Tee']");
    private static final By teeLink = By.xpath("//img[@alt='Deion Long-Sleeve EverCool™ Tee']");
    private static final By size = By.xpath("//div[@id='option-label-size-143-item-168']");
    private static final By colour = By.xpath("//div[@id='option-label-color-93-item-53']");
    private static final By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    private static final By cartIcon = By.xpath("//a[@class='action showcart']");
    private static final By proceedToCheckout = By.xpath("//button[@id='top-cart-btn-checkout']");
    private static final By shippingAddress = By.xpath("//div[normalize-space()='Shipping Address']");
    private static final By company = By.xpath("//input[@id='IV0BTD1']");
    private static final By Address = By.xpath("//input[@id='JN9YBIB']");
    private static final By city = By.xpath("//input[@id='NGCEX9A']");
    private static final By country = By.xpath("//select[@id='KJEA7VH']");
    private static final By state = By.xpath("//select[@id='GPCSWUN']");
    private static final By postalCode = By.xpath("//input[@id='UI3VB4K']");
    private static final By phoneNumber = By.xpath("//input[@id='D7UY450']");
    private static final By nextButton = By.xpath("//button[@class='button action continue primary']");
    private static final By placeOrderButton = By.xpath("//span[normalize-space()='Place Order']");
    private static final By orderSuccessMessage = By.xpath("//span[@class='base']");

    private static final Logger log = LoggerFactory.getLogger(LoginPage.class);

    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
public static void searchItem(String item) throws InterruptedException {

    driver.findElement(searchBox).sendKeys(item);
    driver.findElement(search).click();


}

public static void itemDispalyed() throws InterruptedException {
    Thread.sleep(2000);
     wait.until(ExpectedConditions.visibilityOfElementLocated(searchedItem));
     log.info("Item is displayed");
    }

    public static void clickElement() throws InterruptedException {
        Thread.sleep(1000);
        scrollToElement(teeLink);
        wait.until(ExpectedConditions.elementToBeClickable(teeLink));
        driver.findElement(teeLink).click();
        log.info("Item is clicked");
    }

    public void sizeColour() {
        scrollToElement(size);
        driver.findElement(size).click();
        driver.findElement(colour).click();
        driver.findElement(addToCartButton).click();
        log.info("User selected size and colour and added to cart");
    }

    public void setProceedToCheckout() throws InterruptedException {
    scrollToElement(cartIcon);
    driver.findElement(cartIcon).click();
    Thread.sleep(1000);
    driver.findElement(proceedToCheckout).click();
    log.info("User clicked proceed to checkout button");
    }

    public void setProceedToOrder() throws InterruptedException{
    wait.until(ExpectedConditions.visibilityOfElementLocated(shippingAddress));
    Thread.sleep(3000);
    scrollToElement(nextButton);
    driver.findElement(nextButton).click();

    }

    public String placeOrder() throws InterruptedException {
        Thread.sleep(1000);
    wait.until(ExpectedConditions.visibilityOfElementLocated(placeOrderButton));
        Thread.sleep(2000);
    driver.findElement(placeOrderButton).click();
    Thread.sleep(5000);
   return driver.findElement(orderSuccessMessage).getText();

    }

}
