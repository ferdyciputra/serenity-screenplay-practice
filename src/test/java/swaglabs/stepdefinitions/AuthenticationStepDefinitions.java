package swaglabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
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
}
