package swaglabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.ui.PageElement;
import swaglabs.model.SwaglabsUser;
import swaglabs.tasks.authentication.Login;
import swaglabs.tasks.navigation.Navigate;

public class AuthenticationStepDefinitions {

    @Given("{actor} has logged on the application")
    public void isLoggedOn(Actor actor) {
        actor.attemptsTo(
                Navigate.toTheLoginPage(),
                Login.asA(SwaglabsUser.STANDARD_USER)
        );
    }

    @Then("{actor} should be presented with the product catalog")
    public void shouldBePresentedWithTheProductCatalog(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of(".title")).isEqualToIgnoringCase("Products")
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
                Ensure.that(PageElement.locatedBy(".error-message-container")).isDisplayed()
        );
    }
}
