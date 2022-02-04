package com.web365.search.field;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.test.ReDoroBaseTest;
import com.web365.redoro.field.search.SearchLetters;

public class ReDoroSearchLetters extends ReDoroBaseTest {
	
	@Test
	public void searchTest() {

		SearchLetters searchField = new SearchLetters (driver);
		searchField = searchField.searchTest();

		Assert.assertTrue(searchField.assert11.isDisplayed());
	}

}
