package org.pomManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityClass.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Fashion']")
	private WebElement fashion;

	public WebElement getFashion() {
		return fashion;
	}

	public void setFashion(WebElement fashion) {
		this.fashion = fashion;
	}
	
	
	

}
