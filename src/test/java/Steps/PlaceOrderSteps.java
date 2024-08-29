package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.PlaceOrderPage;

public class PlaceOrderSteps {

    PlaceOrderPage a = new PlaceOrderPage();
    @When("user search for {string} in the search box")
    public void user_search_for_in_the_search_box(String item) throws InterruptedException {
        a.searchItem(item);

    }
    @Then("user selects an item from the list of items")
    public void user_selects_an_item_from_the_list_of_items() throws InterruptedException {
         a.itemDispalyed();
         a.clickElement();
        }

    @When("user select size and colour and click add to cart button")
    public void user_select_size_and_colour_and_click_add_to_cart_button(){
        a.sizeColour();

    }
    @Then("user click cart icon and proceed to checkout")
    public void user_click_cart_icon_and_proceed_to_checkout() throws InterruptedException {
        a.setProceedToCheckout();

    }
    @When("user click next and place order button")
    public void user_click_next_and_place_order_button() throws InterruptedException {
        a.setProceedToOrder();

    }
    @Then("order should be placed successfully")
    public void order_should_be_placed_successfully() throws InterruptedException {

        String message =  a.placeOrder();
       System.out.println(message);
        Assert.assertEquals(message,"Thank you for your purchase!");

    }

}
