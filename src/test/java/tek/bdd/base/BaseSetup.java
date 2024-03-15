package tek.bdd.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {
    private static WebDriver driver;
    private final Properties properties = new Properties();// to read the configFile


    public BaseSetup(){
        try {

            String filePathInfo = System.getProperty("user.dir")+"/src/test/resources/config/application-config.properties";

            File propertiesFile = new File(filePathInfo);
            FileInputStream fileInputStream = new FileInputStream(propertiesFile);
            properties.load(fileInputStream);// read content of the file
        }catch (Exception e){
            throw new RuntimeException("File Not Found or Run Time Exception");

        }

    }

    public void openBrowser()  {

        String browserType = this.properties.getProperty("retail.browser.type");

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
        String tekURL =  this.properties.getProperty("retail.ui.url");

        driver.get(tekURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public WebDriver getDriver() {
        return driver;
    }




}
