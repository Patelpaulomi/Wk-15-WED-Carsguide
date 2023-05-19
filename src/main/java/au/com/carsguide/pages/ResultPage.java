package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement verifyMakeInResult;

    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement resultTextUsedCars;



    public void verifyMakeResult(String expected) {
        String expectedMessage =expected;
        String actualMessage = getTextFromElement(verifyMakeInResult);
        Assert.assertEquals(actualMessage, expectedMessage, "Verify The Results");
    }
    public void verifyTheResultUsedCars(String expected1){
        log.info("Verify The Results : " + resultTextUsedCars.toString());
        String actualMessage = getTextFromElement(resultTextUsedCars);
        String expectedMessage = expected1;
        Assert.assertEquals(actualMessage, expectedMessage, "Verify The Results");
    }


}
