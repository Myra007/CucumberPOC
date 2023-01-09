package StepDef;

import Page.Actions.CheckBox;
import Page.Actions.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSD {

    WebDriver driver;

    @And("User is on the home page")
    public void user_is_on_the_login_page() {
        System.out.println("Step 1");
    }
    @When("User log in with valid credentials")
    public void user_log_in_with_valid_credentials() {

        System.out.println("Test case 1");
        HomePage homePage = new HomePage(driver);
        CheckBox cbAction = homePage.goToCheckBoxPage();
        System.out.println("Printing page header");
        System.out.println(cbAction.getPageHeader());

    }
    @Then("User is logged in successfully")
    public void user_is_logged_in_successfully() {

        System.out.println("Step 3 Executed");
    }

}
