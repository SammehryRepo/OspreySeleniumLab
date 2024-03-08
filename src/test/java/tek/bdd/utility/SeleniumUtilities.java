package tek.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;

import java.time.Duration;

public class SeleniumUtilities extends BaseSetup {
    private WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        return wait;
    }

    // Create A method "clickElement" that take By
    // object and click on element
    public WebElement clickElement(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
        return null;
    }

    public void clickOnElement(By locator){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
    }
    public void sendKeysToElement(By locator, String text) {
        WebElement element = getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.sendKeys(text);
    }
    public String getElementText(By locator) {
        String text = getWait().until(ExpectedConditions.visibilityOfElementLocated(locator))
                .getText();
        return text;
    }
    


}
