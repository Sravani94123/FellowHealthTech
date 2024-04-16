package StepDefinition;


import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home {
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user_is_on_home_page");
	}
	
	@Then("verify login user name on home page")
	public void verify_login_user_name_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("verify login user name on home page");
	}
	
	@Then("verify display of amazon logo and locationon left corner of page")
	public void verify_display_of_amazon_logo_and_locationon_left_corner_of_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("verify display of amazon logo and locationon left corner of page");
	}
	

	@Then("verify tabs Medical Care")
	public void verify_tabs_medical_care() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Medical Care page");
	}
	@Then("verify Groceries")
	public void verify_groceries() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Groceries page");
	}
	@Then("verify PrimeVideo")
	public void verify_prime_video() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("PrimeVideo");
	}
	@Then("verify EverydayEssentials")
	public void verify_everyday_essentials() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("EverydayEssentials");
	}
	@Then("verify Amazon Basic")
	public void verify_amazon_basic() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Amazon Basic");
	}
	@Then("verify Buy Again")
	public void verify_buy_again() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Buy Again");
	}
	@Then("verify Todays Deals")
	public void verify_todays_deals() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Todays Deals");
	}
	@Then("verify Prime Keep shopping for")
	public void verify_prime_keep_shopping_for() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Prime Keep shopping for");
	}
	@Then("verify Customer Service")
	public void verify_customer_service() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Customer Service");
	}
	@Then("verify Best Sellers")
	public void verify_best_sellers() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Best Sellers");
	}
	@Then("verify Music")
	public void verify_music() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Music");
	}
	@Then("verify New Releases")
	public void verify_new_releases() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("New Releases");
	}
	
	
	@Then("verify display of Returns")
	public void verify_display_of_returns() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("verify display of Returns");
	}
	@Then("Verify Order")
	public void verify_order() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("verify Order");
	}
	@Then("Cart logo")
	public void cart_logo() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("verify cart_logo");
	}

	
	@When("click on search text box enter data in {string} and click on search")
	public void click_on_search_text_box_enter_data_in_and_click_on_search(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("enter text in search box"+string);
	}
	@Then("verify dropdown options")
	public void verify_dropdown_options() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("products related to search display in dropdown");
	}
	@When("select desired option from search results dropdown")
	public void select_desired_option_from_search_results_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("select desired product from results dropdown");
	}
	
	@Then("user is on search results page")
	public void user_is_on_search_results_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on search results pag");
	}
	
	@When("user clicks on Account and Lists")
	public void user_clicks_on_account_and_lists() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("account option should be clickable");
	}
	@Then("Manage profile page display")
	public void manage_profile_page_display() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("profile page should display");
	}
	@When("click on account url and select your addresses")
	public void click_on_account_url_and_select_your_addresses() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("your addresses option will display");
	}
	@Then("Your Account and your addresses page display according")
	public void your_account_and_your_addresses_page_display_according() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("your address should display");
	}
	@When("click on Add address")
	public void click_on_add_address() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("add address is clickable");
	}
	@Then("add a new address page display")
	public void add_a_new_address_page_display() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("new address page shall display");
	}
	
	@Then("user is on address page")
	public void user_is_on_address_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("address pag");

	}

@Then("Your Account and your addresses page display accordingly")
public void your_account_and_your_addresses_page_display_accordingly() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("address page");
}
@When("enter all details and click on add address")
public void enter_all_details_and_click_on_add_address(List<String> data) {
	System.out.println(data.get(0));
	System.out.println(data.get(1));
	System.out.println(data.get(2));
	System.out.println(data.get(3));
	
}

}
