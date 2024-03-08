package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.utility.SeleniumUtilities;

import java.time.Duration;

public class SmokeTestSteps extends SeleniumUtilities {

    @Then("Validate top left corner is {string}")
    public void validateTopLeftCorner(String expectedTitle)  {
        String actualTitle = getElementText(By.className("top-nav__logo"));
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Then("Click on SignIn link")
    public void clickSignIn() {
        By signIn = By.id("signinLink");
        WebElement element = getDriver().findElement(signIn);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(1000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(signIn));
        element.click();
       // clickElement(signIn);
    }
    @Then("I Enter Email {string}")
    public void enterEmail(String email){
        By locator = By.id("email");
       sendKeysToElement(locator, email);
    }
    @Then("I Enter Password {string}")
    public void enterPassword(String password) {
        By locator = By.id("password");
        sendKeysToElement(locator, password);
    }
    @Then("I Click on Login button")
    public void ClickLoginButton() {
        By locator = By.id("loginBtn");
        clickElement(locator);
        System.out.println("This step Executed Successfully ");
    }
    @Then("Verify the text message is displayed as {string}")
    public void verifyErrorMessage(String expected) {
        By error = By.className("error");
        String actual = getElementText(error);
        Assert.assertEquals(actual,expected);
    }





}
