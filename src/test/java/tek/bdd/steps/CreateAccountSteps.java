package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import tek.bdd.pages.AccountProfilePage;
import tek.bdd.pages.SignUpPage;
import tek.bdd.pages.LoginPage;
import tek.bdd.utility.DataGeneratorUtility;
import tek.bdd.utility.SeleniumUtilities;

import java.util.Map;

public class CreateAccountSteps extends SeleniumUtilities {
    private String generatedRandomEmail;
    @Given("User click on Create Account")
    public void user_click_on_create_account() {
        clickElement(LoginPage.CREATE_ACCOUNT_LINK);
    }
    @When("User fill Form {string} and {string} and {string}")
    public void user_fill_form_and_and(String name, String email, String password) {
        generatedRandomEmail= DataGeneratorUtility.randomEmail(email);

        sendTextToElement(SignUpPage.NAME,name);
        sendTextToElement(SignUpPage.EMAIL_INPUT,generatedRandomEmail);
        sendTextToElement(SignUpPage.PASSWORD_INPUT,password);
        sendTextToElement(SignUpPage.CONFIRM_PASSWORD_INPUT,password);

    }
    @When("User Click on Sign up button")
    public void user_click_on_sign_up_button() {
        clickElement(SignUpPage.SIGNIN_UP_BUTTON);

    }
    @Then("User will navigate to Account Profile Page")
    public void user_will_navigate_to_account_profile_page() {
        boolean isDisplayed=isElementDisplayed(AccountProfilePage.ACCOUNT_PROFILE_TEXT);
        Assert.assertTrue(isDisplayed);

    }
    @Then("Validate {string} and email in account page")
    public void validate_and_email_in_account_page(String expectedName) {
        String actualName=getElementText(AccountProfilePage.PROFILE_NAME);
        Assert.assertEquals(expectedName,actualName);
        String actulEmail=getElementText(AccountProfilePage.PROFILE_EMAIL);
        Assert.assertEquals(generatedRandomEmail,actulEmail);

    }
}
