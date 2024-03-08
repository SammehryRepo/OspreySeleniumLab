package tek.bdd.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

import java.time.Duration;

public class BaseSetup {
    private static WebDriver driver;
    public void openBrowser()  {
        //Add if statements to select different types of browser cross-browser testing
String browserType = "firefox";
if(browserType.equalsIgnoreCase("chrome")){
    driver = new ChromeDriver();
}else if (browserType.equalsIgnoreCase("edge")){
    driver = new EdgeDriver();
}else if (browserType.equalsIgnoreCase("safari")){
    driver = new SafariDriver();
}else if (browserType.equalsIgnoreCase("firefox")){
    driver = new FirefoxDriver();
}else {
    System.out.println("You have entered an invalid value in Browser Type");
    //throw new RuntimeException("Invalid browser type: Only chrome, edge, safair and firefox");
}
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public WebDriver getDriver() {
        return driver;
    }




}
