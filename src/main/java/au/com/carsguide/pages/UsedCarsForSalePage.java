package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class UsedCarsForSalePage extends Utility {
    private static final Logger log = LogManager.getLogger(UsedCarsForSalePage.class.getName());

    public UsedCarsForSalePage() {
        PageFactory.initElements(driver, this);
    }

//    @CacheLookup
//    @FindBy(xpath = "//h1[normalize-space()='Used Cars For Sale']")
//    WebElement usedCarsForSale;
//
//    public String verifyUsedCarsForSaleText() {
//        log.info("Verify text: " + usedCarsForSale.toString());
////        String expectedText = "Used Cars For Sale";
////        String actualText = new UsedCarsForSalePage().verifyUsedCarsForSaleText();
////        Assert.assertEquals(actualText, expectedText);
//        return getTextFromElement(usedCarsForSale);
//    }

}
