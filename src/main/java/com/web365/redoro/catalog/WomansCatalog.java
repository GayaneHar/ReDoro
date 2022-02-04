package com.web365.redoro.catalog;

import static com.web365.redoro.field.search.ReDoroSearchFieldConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.web365.redoro.field.search.SearchLetters;
import com.web365.redoro.page.base.ReDoroBasePage;

public class WomansCatalog extends ReDoroBasePage {
	  
			public WomansCatalog (WebDriver driver) {
			super(driver);
			this.driver = driver;

		}

		@FindBy(xpath = CATALOG_REDORO_XPATH )
		public WebElement redoroCatalog;

		@FindBy(xpath = ASSERT12_REDORO_XPATH)
		public WebElement assert12;

		public SearchLetters searchTest() {
			redoroSearchField.click();
			redoroSearchField.sendKeys("rings");
			redoroSearchField.sendKeys(Keys.ENTER);
			return new SearchLetters (this.driver);

		}

	}

}
