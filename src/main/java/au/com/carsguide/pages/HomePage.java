package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement mouseHoverBuySell;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement clickOnSearchCars;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement clickOnUsed;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findADealer;

    public void mouseHoverBuySell() {
        log.info("Mouse Hover On Buy + Sell : " + mouseHoverBuySell.toString());
        mouseHoverToElement(mouseHoverBuySell);
    }

    public void clickOnSearchCars() {
        log.info("Click On Search Cars link : " + clickOnSearchCars.toString());
        clickOnElement(clickOnSearchCars);
    }

    public void clickOnUsedCarLink() {
        log.info("Click On Used link : " + clickOnUsed.toString());
        clickOnElement(clickOnUsed);
    }

    public void clickOnFindADealer() {
        log.info("Click On Find a Dealer : " + findADealer.toString());
        clickOnElement(findADealer);
    }

}



