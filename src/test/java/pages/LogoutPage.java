package pages;

import Utility.BrowserDriver;
import Utility.InvokeDriver;
import org.openqa.selenium.By;

public class LogoutPage  extends BrowserDriver {

    private static final By logoutDropdown = By.xpath("//div[@class='panel header']//button[@type='button']");
    private static final By signoutButton = By.xpath("//div[@aria-hidden='false']//a[normalize-space()='Sign Out']");
    private static final By loginLinkXpath = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");

    public static void signOut(){
        driver.findElement(logoutDropdown).click();
        driver.findElement(signoutButton).click();
        driver.findElement(loginLinkXpath).getText();
    }
}
