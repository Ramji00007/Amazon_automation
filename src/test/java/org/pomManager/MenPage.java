package org.pomManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityClass.BaseClass;

public class MenPage extends BaseClass{

	public MenPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@aria-label='4 Stars & Up']")
	private WebElement fourStarsUp;

	public WebElement getFourStarsUp() {
		return fourStarsUp;
	}

	public void setFourStarsUp(WebElement fourStarsUp) {
		this.fourStarsUp = fourStarsUp;
	}
	
	
	
}
