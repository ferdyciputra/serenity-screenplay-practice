package swaglabs.tasks.cart;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import swaglabs.pageobjects.CatalogPage;

public class CartCount {
    public static Question<Integer> currentlyDisplayed() {
        return Text.of(CatalogPage.SHOPPING_CART_BADGE).asInteger();
    }
}
