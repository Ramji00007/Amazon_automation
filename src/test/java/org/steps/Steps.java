package org.steps;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.WebElement;
import org.pomManager.FashionPage;
import org.pomManager.HomePage;
import org.pomManager.MenPage;
import org.pomManager.ProductInfoPage;
import org.pomManager.ResultPage;
import org.testng.Assert;
import org.utilityClass.BaseClass;

import io.cucumber.java.en.*;

public class Steps extends BaseClass{
	
	public HomePage homepage;
	public FashionPage fashionPage;
	public MenPage menPage;
	public ResultPage resultPage;
	public ProductInfoPage productInfoPage;
	public String initialCount;
	public String finalCount;
	
	@Given("I navigated to Fashsion Page in amazon")
	public void i_navigated_to_fashsion_page_in_amazon() throws FileNotFoundException, IOException, InterruptedException {
	    browserLaunch(getValue("url"));
	    Thread.sleep(3000);
	    homepage = new HomePage();
	    homepage.getFashion().click();
	}
	
	@When("Selected customers review with four stars and UP under Men section")
	public void selected_customers_review_with_four_stars_and_up_under_men_section() throws InterruptedException {
	    fashionPage = new FashionPage();
	    fashionPage.getMen().click();
	    
	    menPage = new MenPage();
	    WebElement fourstars = menPage.getFourStarsUp();
	    scrollDown(fourstars);
	    fourstars.click();
	    
	}
	@When("I have filtered the Price Range between {string} to {string}")
	public void i_have_filtered_the_price_range_between_to(String string, String string2) {
	   
	}
	@Then("Validate the Product count in the results")
	public void validate_the_product_count_in_the_results() {
	    resultPage = new ResultPage();
	    List<WebElement> allProducts = resultPage.getAllProducts();
	    Assert.assertEquals(60, allProducts.size());
	    System.out.println("Validation of Product count is success");
	}
	@Then("I have added the second product to the cart")
	public void i_have_added_the_second_product_to_the_cart() throws InterruptedException {
	    resultPage.getAllProducts().get(1).click();
	    Set<String> allIds = driver.getWindowHandles();
	    List<String> all = new ArrayList<String>();
	    all.addAll(allIds);
	    driver.switchTo().window(all.get(1));
	    initialCount = productInfoPage.getCartCount().getText();
	    productInfoPage = new ProductInfoPage();
	    Thread.sleep(4000);
	    WebElement element = productInfoPage.getAddToCart();
	    element.click();
	}
	@Then("The Cart product number should be increment by one")
	public void the_cart_product_number_should_be_increment_by_one() {
		productInfoPage = new ProductInfoPage();
		finalCount = productInfoPage.getCartCount().getText();
		int inc = Integer.parseInt(initialCount);
		int fnc = Integer.parseInt(finalCount);
		int increment = fnc-inc;
		Assert.assertEquals(1, increment);
		System.out.println("Cart count increment by 1");
	}

}
