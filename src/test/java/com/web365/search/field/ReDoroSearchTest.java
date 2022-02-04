package com.web365.search.field;

import org.testng.Assert;
import org.testng.annotations.Test;
import static com.web365.redoro.field.search.ReDoroSearchFieldConstants.SEARCH_REDORO_XPATH;
import com.web365.base.test.ReDoroBaseTest;
import com.web365.redoro.field.search.ReDoroSearchField;

public class ReDoroSearchTest extends ReDoroBaseTest {
	
	 
	@Test
	public void searchTest() {
	
	ReDoroSearchField searchField  = new ReDoroSearchField (driver); 
	searchField = searchField.searchFieldTest();
	
	Assert.assertTrue(searchField.redoroSearchField.isDisplayed());
}

}
