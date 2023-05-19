package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class CarDealerPage extends Utility {
    private static final Logger log = LogManager.getLogger(CarDealerPage.class.getName());

    public CarDealerPage() {
        PageFactory.initElements(driver, this);
    }

//    @CacheLookup
//    @FindBy(xpath = "//h1[contains(text(),'Find a Car Dealership Near You')]")
//    WebElement findACarDealership;
//
//    public String verifyFindACarDealershipText() {
//        log.info("Verify text: " + findACarDealership.toString());
////        String expectedText = "Find a Car Dealership Near You";
////        String actualText = new CarDealerPage().verifyFindACarDealershipText();
////        Assert.assertEquals(actualText, expectedText);
//        return getTextFromElement(findACarDealership);
//    }

}
