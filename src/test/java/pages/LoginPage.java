package pages;

import Utility.BrowserDriver;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoginPage extends BrowserDriver {

    private static final By loginLinkXpath = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
    private static final By displayLogin = By.xpath("//span[@class='base']");
    private static final By email = By.xpath("//input[@id='email']");
    private static final By password = By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']");
    private static final By loginbutton = By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]");
    private static final By welcomeText = By.cssSelector("div[class='panel header'] span[class='logged-in']");


    private static final Logger log = LoggerFactory.getLogger(LoginPage.class);



    public static void clickLoginLink() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(loginLinkXpath).click();
    }
    public static String loginPageDisplayed() throws InterruptedException{
        return driver.findElement(displayLogin).getText();

    }

    public static void signIn(){
        driver.findElement(email).sendKeys("Shivam123@gmail.com");
        driver.findElement(password).sendKeys("Shivam@123");
        driver.findElement(loginbutton).click();
        log.info("User clicked login button");

    }

    public static String loggedIn() throws InterruptedException {
        Thread.sleep(5000);
        String text = driver.findElement(welcomeText).getText();
        System.out.println(text);
        return text;
    }



}
