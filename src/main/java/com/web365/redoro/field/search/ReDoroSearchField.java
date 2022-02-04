package com.web365.redoro.field.search;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.web365.redoro.field.search.ReDoroSearchFieldConstants.SEARCH_REDORO_XPATH;
import com.web365.redoro.page.base.ReDoroBasePage;

public class ReDoroSearchField extends ReDoroBasePage {
	
	
	public ReDoroSearchField(WebDriver driver) {
		super(driver);
		this.driver = driver;
  
	}
	
	@FindBy(xpath = SEARCH_REDORO_XPATH)
	public WebElement redoroSearchField;

	
	public ReDoroSearchField searchFieldTest() {
		redoroSearchField.click();
		redoroSearchField.sendKeys("218245");
		redoroSearchField.sendKeys(Keys.ENTER);
		return new ReDoroSearchField(this.driver);
		
		
	}
	
}



