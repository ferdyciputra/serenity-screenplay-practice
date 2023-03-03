package swaglabs.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import swaglabs.tasks.cart.AddToCart;
import swaglabs.tasks.cart.CartContents;
import swaglabs.tasks.cart.CartCount;
import swaglabs.tasks.navigation.Navigate;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CatalogStepDefinitions {
    List<String> cartItems;

    @And("{actor} is browsing the catalog")
    public void isBrowsingTheCatalog(Actor actor) {
        actor.attemptsTo(
                Navigate.toTheCatalogPage()
        );
    }

    @When("{actor} adds the following items to the cart:")
    public void addsTheFollowingItemsToTheCart(Actor actor, List<String> items) {
        cartItems = items;

        items.forEach(
                itemName -> actor.attemptsTo(AddToCart.item(itemName))
        );
    }

    @Then("the shopping cart count should be {int}")
    public void theShoppingCartCountShouldBe(int expectedCount) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(CartCount.currentlyDisplayed()).isEqualTo(expectedCount)
        );
    }

    @And("the items should appear in the cart")
    public void theItemsShouldAppearInTheCart() {
        theActorInTheSpotlight().attemptsTo(
                Navigate.toTheSoppingCart(),
                Ensure.that(CartContents.currentlyDisplayed()).containsElementsFrom(cartItems)
        );
    }
}
