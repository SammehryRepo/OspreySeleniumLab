package tek.bdd.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "tek.bdd.steps",
        tags = "@CreateNewUser",
        dryRun = false,
        //if true wont run steps just check for un-implemented steps
       plugin = {
        "pretty",
              "html:target/html_report/report.html"
      }
)
public class TestRunner {
}
