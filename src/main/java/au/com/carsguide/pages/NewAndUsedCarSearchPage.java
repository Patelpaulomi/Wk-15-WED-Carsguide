package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarSearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    public NewAndUsedCarSearchPage() {
        PageFactory.initElements(driver, this);
    }

//    @CacheLookup
//    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
//    WebElement newAndUsedCarSearch;

    @CacheLookup
    @FindBy(id = "makes")
    WebElement selectMake;

    @CacheLookup
    @FindBy(id = "models")
    WebElement selectModel;

    @CacheLookup
    @FindBy(id = "locations")
    WebElement selectLocation;

    @CacheLookup
    @FindBy(id = "priceTo")
    WebElement selectPrice;

    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement myNextCarTab;

//    public String verifyNewAndUsedCarText() {
//        log.info("Verify text : " + newAndUsedCarSearch.toString());
//        String expectedText = "New & Used Car Search - carsguide";
//        String actualText = new NewAndUsedCarSearchPage().verifyNewAndUsedCarText();
//        Assert.assertEquals(actualText, expectedText);
//        return getTextFromElement(newAndUsedCarSearch);
//    }

    public void selectMakeOfTheCarFromDropDown(String make) {
        selectByVisibleTextFromDropDown(selectMake, make);
        log.info("Select make car from dropdown :" + selectMake.toString());
    }

    public void selectModelOfTheCarFromDropDown(String model) {
        log.info("Select car model from dropdown : " + selectModel.toString());
        selectByVisibleTextFromDropDown(selectModel, model);
    }

    public void selectLocationFromDropDown(String Location) {
        log.info("Select Location from dropdown : " + selectLocation.toString());
        selectByVisibleTextFromDropDown(selectLocation, Location);
    }

    public void selectPriceOfTheCarFromDropDown(String Price) {
        log.info("Select price From dropdown : " + selectPrice.toString());
        selectByVisibleTextFromDropDown(selectPrice, Price);
    }

    public void clickOnMyNextCarTab() {
        log.info("Click On My Next Car Tab : ");
        clickOnElement(myNextCarTab);
    }


}
