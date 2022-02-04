package com.web365.redoro.field.search;

import static com.web365.redoro.field.search.ReDoroSearchFieldConstants.ASSERT11_REDORO_XPATH;
import static com.web365.redoro.field.search.ReDoroSearchFieldConstants.SEARCH_REDORO_XPATH;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.redoro.page.base.ReDoroBasePage;

public class SearchLetters extends  ReDoroBasePage {
	
	public SearchLetters (WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = SEARCH_REDORO_XPATH)
	public WebElement redoroSearchField;

	@FindBy(xpath = ASSERT11_REDORO_XPATH)
	public WebElement assert11;

	public SearchLetters searchTest() {
		redoroSearchField.click();
		redoroSearchField.sendKeys("rings");
		redoroSearchField.sendKeys(Keys.ENTER);
		return new SearchLetters (this.driver);

	}

}
