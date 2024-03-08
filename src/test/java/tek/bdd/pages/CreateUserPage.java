package tek.bdd.pages;

import org.openqa.selenium.By;

public class CreateUserPage {
    //Using  "static" keyword to be accessible
    //in other classes without creating object of this class.
    //Final keyword is used so the value is not changed.
    public static final By SIGNIN_LINK = By.id("signinLink");
    public static final By CREATE_NEW_ACCOUNT = By.xpath("//*[@id='newAccountBtn']");
    public static final By ENTER_NAME = By.xpath("//*[@id='nameInput']");
    public static final By ENTER_EMAIL = By.xpath("//*[@id='emailInput']");
    public static final By ENTER_PASSWORD = By.xpath("//*[@id='passwordInput']");
    public static final By ENTER_CONF_PASSWORD = By.xpath("//*[@id='confirmPasswordInput']");
    public static final By SIGNUP_BUTTON = By.xpath("//*[@id='signUpForm']/div[5]/button");
    public static final By VERIFY_NAME = By.xpath("//h1[@class='account__information-username']");
    public static final By VERIFY_EMAIL = By.xpath("//h1[@class='account__information-email']");
    public static final By LOGOUT_BUTTON = By.id("logoutBtn");


}
