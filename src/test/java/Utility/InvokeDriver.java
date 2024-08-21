package Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvokeDriver extends BrowserDriver{

    private static final Logger log = LoggerFactory.getLogger(InvokeDriver.class);

    @Before(order=0)
    public void invokeBrowser(){
        log.info("Launching Chrome...");
        ChromeOptions co = new ChromeOptions();
        driver = new ChromeDriver(co);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }


    @After
    public void tearDown(){
        driver.quit();
    }
}
