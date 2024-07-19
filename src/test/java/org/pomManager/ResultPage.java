package org.pomManager;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityClass.BaseClass;

public class ResultPage extends BaseClass{

	public ResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h2//a")
	private List<WebElement> allProducts;


	public List<WebElement> getAllProducts() {
		return allProducts;
	}


	public void setAllProducts(List<WebElement> allProducts) {
		this.allProducts = allProducts;
	}
	
}
