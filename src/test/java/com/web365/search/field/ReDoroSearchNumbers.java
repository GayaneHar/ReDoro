package com.web365.search.field;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ReDoroBaseTest;
import com.web365.redoro.field.search.SearchNumbers;
import com.web365.redoro.field.search.SearchSpecialChar;

public class ReDoroSearchNumbers extends ReDoroBaseTest {
	
	@Test
	public void searchTest() {

		SearchNumbers searchField = new SearchNumbers (driver);
		searchField = searchField.searchTest();

		Assert.assertTrue(searchField.assert10.isDisplayed());
	}

}
