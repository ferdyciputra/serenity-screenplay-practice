package swaglabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import swaglabs.model.SwaglabsUser;
import swaglabs.pageobjects.CatalogPage;
import swaglabs.pageobjects.LoginPage;
import swaglabs.tasks.authentication.Login;
import swaglabs.tasks.navigation.Navigate;

public class AuthenticationStepDefinitions {

    @Given("{actor} has logged on the application")
    public void isLoggedOn(Actor actor) {
        actor.attemptsTo(
                Navigate.toTheLoginPage(),
                Login.asA(SwaglabsUser.VALID_USER)
        );
    }

    @Then("{actor} should be presented with the product catalog")
    public void shouldBePresentedWithTheProductCatalog(Actor actor) {
        actor.attemptsTo(
                Ensure.that(CatalogPage.INVENTORY_ITEM_NAME).isDisplayed()
        );
    }

    @Given("{actor} is on the login page")
    public void isOnTheLoginPage(Actor actor) {
        actor.attemptsTo(
                Navigate.toTheLoginPage()
        );
    }

    @When("{actor} logs in with invalid credentials")
    public void logsInWithInvalidCredentials(Actor actor) {
        actor.attemptsTo(
                Login.asA(SwaglabsUser.INVALID_USER)
        );
    }

    @Then("{actor} should be see the error message")
    public void shouldBeSeeTheErrorMessage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(LoginPage.ERROR_MESSAGE).isDisplayed()
        );
    }
}
