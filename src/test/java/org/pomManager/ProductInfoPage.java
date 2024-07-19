package org.pomManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityClass.BaseClass;

public class ProductInfoPage extends BaseClass{
	
	public ProductInfoPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	private WebElement AddToCart;
	
	@FindBy(xpath="//span[@id='nav-cart-count']")
	private WebElement cartCount;

	public WebElement getAddToCart() {
		return AddToCart;
	}

	public WebElement getCartCount() {
		return cartCount;
	}

	public void setCartCount(WebElement cartCount) {
		this.cartCount = cartCount;
	}

	public void setAddToCart(WebElement addToCart) {
		AddToCart = addToCart;
	}
	
	}

