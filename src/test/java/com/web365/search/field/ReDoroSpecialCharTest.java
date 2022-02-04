package com.web365.search.field;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ReDoroBaseTest;
import com.web365.redoro.field.search.ReDoroSearchField;
import com.web365.redoro.field.search.SearchSpecialChar;

public class ReDoroSpecialCharTest extends ReDoroBaseTest {

	@Test
	public void searchTest() {

		SearchSpecialChar searchField = new SearchSpecialChar(driver);
		searchField = searchField.searchTest();

		Assert.assertTrue(searchField.assert3.isDisplayed());
	}

}
