package org.pomManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityClass.BaseClass;

public class FashionPage extends BaseClass {

	public FashionPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[normalize-space(text())='Men']")
	private WebElement men;

	public WebElement getMen() {
		return men;
	}

	public void setMen(WebElement men) {
		this.men = men;
	}
	
	
}
