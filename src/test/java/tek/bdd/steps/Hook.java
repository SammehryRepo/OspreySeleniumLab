package tek.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import tek.bdd.utility.SeleniumUtilities;

public class Hook extends SeleniumUtilities {
    @Before
    public void initiateTest() throws Exception {//open the browser

        openBrowser();
    }
    @After
    public void closingTest(Scenario scenario) {//close the session
        //TakeScreenshot
        if (scenario.isFailed()){
            TakesScreenshot sc = (TakesScreenshot) getDriver();
            byte[] captureSC = sc.getScreenshotAs(OutputType.BYTES);
            scenario.attach(captureSC,"image/png","failedStep");

            }
        getDriver().quit();
        }


    }

