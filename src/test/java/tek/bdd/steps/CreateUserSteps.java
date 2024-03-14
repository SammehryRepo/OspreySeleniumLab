package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.CreateUserPage;
import tek.bdd.utility.DataGenerator;
import tek.bdd.utility.SeleniumUtilities;

import java.util.Map;

public class CreateUserSteps extends SeleniumUtilities {
    String generatedEmail;

    @When("Click on sign in link")
    public void click_on_sign_in_link() {
        clickOnElement(CreateUserPage.SIGNIN_LINK);
    }
    @Then("Click on Create New Account button")
    public void click_on_creat_new_account_button() {
        clickOnElement(CreateUserPage.CREATE_NEW_ACCOUNT);
    }
    @Then("Enter valid detail in the required feilds")
    public void enter_valid_detail_in_the_required_feilds(DataTable dataTable) {

        Map<String, String> input = dataTable.asMap();
        String name = input.get("name");
        String email = input.get("email");//feature file email ospreyBDDLab@tekschool.us
        String password = input.get("password");
        //String ConfirmPassword = input.get("confirmPassword");
        generatedEmail = DataGenerator.randomEmail(email); //ospreyBDDLabXXX@tekschool.us
        sendKeysToElement(CreateUserPage.ENTER_NAME,name);
        sendKeysToElement(CreateUserPage.ENTER_EMAIL,generatedEmail);
        sendKeysToElement(CreateUserPage.ENTER_PASSWORD,password);
        sendKeysToElement(CreateUserPage.ENTER_CONF_PASSWORD,password);
    }
    @Then("click on signUp button")
    public void click_on_sign_up_button() {
        clickOnElement(CreateUserPage.SIGNUP_BUTTON);

    }
    @Then("Validate the Name in Profile as {string}")
    public void validate_the_name_in_profile_as(String expectedName) {

        String actualName = getElementText(CreateUserPage.VERIFY_NAME);
        Assert.assertEquals(expectedName, actualName);
    }
    @Then("Validate the Email in Profile as {string}")
    public void validate_the_email_in_profile_as(String expectedEmail) {
        String actualEmail = getElementText(CreateUserPage.VERIFY_EMAIL);
        Assert.assertEquals(actualEmail, generatedEmail);
    }

    @Then("Click on Logout Button")
    public void click_on_logout_button() {
        clickOnElement(CreateUserPage.LOGOUT_BUTTON);

    }
}
