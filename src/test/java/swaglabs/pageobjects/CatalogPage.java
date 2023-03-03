package swaglabs.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;

public class CatalogPage extends PageObject {
    public static Target INVENTORY_ITEM_NAME = Target.the("inventory item name").locatedBy(".inventory_item_name");
    public static SearchableTarget ELEMENT_INVENTORY_ITEM = PageElement.locatedBy(".inventory_item");
    public static Target SHOPPING_CART_BADGE = Target.the("shopping cart badge").locatedBy(".shopping_cart_badge");
}
