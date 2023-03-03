package swaglabs.tasks.cart;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import swaglabs.pageobjects.CatalogPage;

import java.util.Collection;

public class CartContents {
    public static Question<Collection<String>> currentlyDisplayed() {
        return Text.ofEach(CatalogPage.INVENTORY_ITEM_NAME);
    }
}
